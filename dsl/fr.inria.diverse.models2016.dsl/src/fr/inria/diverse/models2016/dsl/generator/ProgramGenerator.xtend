/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.generator

import fr.inria.diverse.models2016.dsl.schedule.Schedule
import fr.inria.diverse.models2016.dsl.schedule.Schedule.ScheduleEvent
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Comparator
import java.util.Date
import java.util.GregorianCalendar
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Locale
import java.util.Map
import java.util.Set
import java.util.TimeZone
import models2016.Clinic
import models2016.CoffeeBreak
import models2016.Conference
import models2016.Day
import models2016.DoctoralSymposium
import models2016.EducatorSymposium
import models2016.Event
import models2016.Keynote
import models2016.Lunch
import models2016.Meeting
import models2016.Opening
import models2016.Panel
import models2016.Person
import models2016.Poster
import models2016.Reception
import models2016.Room
import models2016.SRC
import models2016.Session
import models2016.SponsorKeynote
import models2016.TalkSession
import models2016.Tutorial
import models2016.Workshop
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.inria.diverse.models2016.dsl.utils.ProgramUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ProgramGenerator extends AbstractGenerator {

	private val Map<Day,List<Room>> roomsPerDay = new HashMap
	private val Map<Day,Map<Room,List<Session>>> sessionsPerRoomPerDay = new HashMap
	private val Map<Day,Schedule<Room>> schedulePerDay = new HashMap
	private val List<Room> rooms = new ArrayList
	private val Comparator<Room> roomComparator = [r1,r2|rooms.indexOf(r1) - rooms.indexOf(r2)]
	
	private val DateFormat dateFormat = new SimpleDateFormat("EEEE, MMM d, yyyy")
	private val DateFormat hourFormat = new SimpleDateFormat("HH:mm")
	private val DateFormat icalFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'",Locale.UK)
	
	private var int talkDuration = 25
	
	private var Conference conference
	
	new() {
		icalFormat.timeZone = TimeZone.getTimeZone("UTC")
	}
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		rooms.clear
		roomsPerDay.clear
		sessionsPerRoomPerDay.clear
		schedulePerDay.clear
		conference = input.allContents.filter(typeof(Conference)).findFirst[true]
		if (conference != null) {
			if (conference.talkDuration != 0) {
				talkDuration = conference.talkDuration
			}
			
			rooms.addAll(conference.resources.filter(typeof(Room)).toList)
			
			conference.program.days.forEach[d|
				val List<Session> sessions = d.sessions
				val Set<Room> roomsOfTheDay = new HashSet
				val Map<Room,List<Session>> sessionsPerRoomOfDay = new HashMap
				sessionsPerRoomPerDay.put(d,sessionsPerRoomOfDay)
				sessions.forEach[s|
						val room = s.room
						if (room != null) {
							roomsOfTheDay.add(room)
							var sessionsOfRoom = sessionsPerRoomOfDay.get(room)
							if (sessionsOfRoom == null) {
								sessionsOfRoom = new ArrayList
								sessionsPerRoomOfDay.put(room,sessionsOfRoom)
							}
							sessionsOfRoom.add(s)
						}
				]
				val List<Room> result = new ArrayList(roomsOfTheDay.sortWith(roomComparator))
				roomsPerDay.put(d,result)
			]
			
			sessionsPerRoomPerDay.forEach[d, sessionsPerRoom|
				val toBeSorted = new HashMap(sessionsPerRoom)
				toBeSorted.forEach[r, s|
					val sortedList = s.sortWith([s1,s2|
						return ProgramUtils.convertDate(s1.startingTime)
								.compareTo(ProgramUtils.convertDate(s2.startingTime))
					])
					sessionsPerRoom.put(r, sortedList)
				]
			]
			
			sessionsPerRoomPerDay.forEach[d, sessionsPerRoom|
				val schedule = new Schedule<Room>
				schedulePerDay.put(d,schedule)
				sessionsPerRoom.forEach[r, l|
					schedule.addColumn(r)
					l.forEach[s|
						schedule.addEventToColumn(r,new ScheduleEvent(ProgramUtils.convertDate(s.startingTime),
								ProgramUtils.convertDate(s.endingTime),s
						))
					]
				]
			]
			
			fsa.generateFile(conference.name + '-data.js', 'var data = ' + generate)
		}
	}
	
	def private int computeSessionLength(Date start, Date end) {
		return ((end.time - start.time) / (1000 * 60 * 15)) as int
	}
	
	def private Date computeDate(Date dayDate, Date hourDate) {
		val dayCal = GregorianCalendar.instance
		val hourCal = GregorianCalendar.instance
		val cal = GregorianCalendar.instance
		cal.clear
		dayCal.time = dayDate
		hourCal.time = hourDate
		
		val year = dayCal.get(Calendar.YEAR)
		val month = dayCal.get(Calendar.MONTH)
		val day = dayCal.get(Calendar.DAY_OF_MONTH)
		val hour = hourCal.get(Calendar.HOUR_OF_DAY)
		val minute = hourCal.get(Calendar.MINUTE)
		
		cal.set(year, month, day, hour, minute)
		return cal.time
	}
	
	def private Date computeTalkStart(Date start, int i) {
		return new Date(start.time + i * talkDuration * 60 * 1000)
	}
	
	def private String getPerson(Person person) {
		return
				'''
					{
						name : "«person.name»"«IF person.email != null && person.email.length > 0»,
						email : "«person.email»"
						«ELSE»
						
						«ENDIF»
					}
				'''
	}
	
	def private String getTalkSession(TalkSession talkSession, Date start) {
		return
				'''
					{
						type : "TalkSession",
						title : "«talkSession.name»",
						«IF talkSession.chair != null»
						chair : "«talkSession.chair.name»",
						«ENDIF»
						papers : [
							«var i = 0»
							«FOR p : talkSession.papers SEPARATOR ","»
							{
								title : "«p.name»",
								«IF p.abstract != null && p.abstract.length > 0»
								abstract : "«p.abstract.replace("\n","\\n")»",
								«ENDIF»
								«val talkStart = computeTalkStart(start,i++)»
								«val talkEnd = computeTalkStart(start,i)»
								start : "«hourFormat.format(talkStart)»",
								icalStart : "«icalFormat.format(talkStart)»",
								icalEnd : "«icalFormat.format(talkEnd)»",
								authors : [
									«FOR a : p.authors SEPARATOR ","»
									«getPerson(a)»
									«ENDFOR»
								]
							}
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getWorkshop(Workshop workshop) {
		return
				'''
					{
						type : "Workshop",
						title : "«workshop.name»",
						«IF workshop.abstract != null && workshop.abstract.length > 0»
						abstract : "«workshop.abstract.replace("\n","\\n")»",
						«ENDIF»
						«IF workshop.url != null && workshop.url.length > 0»
						url : "«workshop.url»",
						«ENDIF»
						organizers : [
							«FOR o : workshop.organizers SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getLunch(Lunch lunch) {
		return
				'''
					{
						type : "Lunch",
						title : "«lunch.name»"
					}
				'''
	}
	
	def private String getClinic(Clinic clinic) {
		return
				'''
					{
						type : "Clinic",
						title : "«clinic.name»"
					}
				'''
	}
	
	def private String getCoffeeBreak(CoffeeBreak coffeeBreak) {
		return
				'''
					{
						type : "CoffeeBreak",
						title : "«coffeeBreak.name»"
					}
				'''
	}
	
	def private String getReception(Reception reception) {
		return
				'''
					{
						type : "Reception",
						title : "«reception.name»"
					}
				'''
	}
	
	def private String getPanel(Panel panel) {
		return
				'''
					{
						type : "Panel",
						title : "«panel.name»",
						moderators : [
							«FOR o : panel.moderators SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						],
						panelists : [
							«FOR o : panel.panelists SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getEducatorSymposium(EducatorSymposium symposium) {
		return
				'''
					{
						type : "EducatorSymposium",
						title : "«symposium.name»",
						organizers : [
							«FOR o : symposium.organizers SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getDoctoralSymposium(DoctoralSymposium symposium) {
		return
				'''
					{
						type : "DoctoralSymposium",
						title : "«symposium.name»",
						organizers : [
							«FOR o : symposium.organizers SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getTutorial(Tutorial tutorial) {
		return
				'''
					{
						type : "Tutorial",
						title : "«tutorial.name»",
						«IF tutorial.abstract != null && tutorial.abstract.length > 0»
						abstract : "«tutorial.abstract.replace("\n","\\n")»",
						«ENDIF»
						organizers : [
							«FOR o : tutorial.organizers SEPARATOR ","»
							«getPerson(o)»
							«ENDFOR»
						]
					}
				'''
	}
	
	def private String getMeeting(Meeting meeting) {
		return
				'''
					{
						type : "Meeting",
						title : "«meeting.name»"
					}
				'''
	}
	
	def private String getSRC(SRC src) {
		return
				'''
					{
						type : "SRC",
						title : "«src.name»"
					}
				'''
	}
	
	def private String getPoster(Poster poster) {
		return
				'''
					{
						type : "Poster",
						title : "«poster.name»"
					}
				'''
	}
	
	def private String getKeynote(Keynote keynote) {
		return
				'''
					{
						type : "Keynote",
						title : "«keynote.name»",
						speaker : «getPerson(keynote.speaker)»
					}
				'''
	}
	
	def private String getSponsorKeynote(SponsorKeynote keynote) {
		return
				'''
					{
						type : "SponsorKeynote",
						title : "«keynote.name»",
						speaker : «getPerson(keynote.speaker)»
					}
				'''
	}
	
	def private String getOpening(Opening opening) {
		return
				'''
					{
						type : "Opening",
						title : "«opening.name»"
					}
				'''
	}
	
	def String getEvent(Event event, Date start) {
		if (event instanceof TalkSession) {
			return getTalkSession(event as TalkSession, start)
		} else if (event instanceof Workshop) {
			return getWorkshop(event as Workshop)
		} else if (event instanceof Tutorial) {
			return getTutorial(event as Tutorial)
		} else if (event instanceof DoctoralSymposium) {
			return getDoctoralSymposium(event as DoctoralSymposium)
		} else if (event instanceof EducatorSymposium) {
			return getEducatorSymposium(event as EducatorSymposium)
		} else if (event instanceof Panel) {
			return getPanel(event as Panel)
		} else if (event instanceof Reception) {
			return getReception(event as Reception)
		} else if (event instanceof CoffeeBreak) {
			return getCoffeeBreak(event as CoffeeBreak)
		} else if (event instanceof Clinic) {
			return getClinic(event as Clinic)
		} else if (event instanceof Lunch) {
			return getLunch(event as Lunch)
		} else if (event instanceof Meeting) {
			return getMeeting(event as Meeting)
		} else if (event instanceof SRC) {
			return getSRC(event as SRC)
		} else if (event instanceof Poster) {
			return getPoster(event as Poster)
		} else if (event instanceof SponsorKeynote) {
			return getSponsorKeynote(event as SponsorKeynote)
		} else if (event instanceof Keynote) {
			return getKeynote(event as Keynote)
		} else if (event instanceof Opening) {
			return getOpening(event as Opening)
		}
	}
	
	def String generate() {
		return 
				'''
					[
						«FOR d : conference.program.days SEPARATOR ","»
						{
							name : "«dateFormat.format(ProgramUtils.convertDate(d.date))»",
							rooms : [
								«val roomsOfDay = roomsPerDay.get(d)»
								«FOR r : roomsOfDay SEPARATOR ","»
								{
									«val hasCapacity = r.capacity != null»
									name : "«r.name»"«IF hasCapacity»,«ENDIF»
									«IF hasCapacity»
									capacity : «r.capacity»
									«ENDIF»
								}
								«ENDFOR»
							],
							sessionGroups : [
								«val scheduleOfDay = schedulePerDay.get(d)»
								«val startingDates = scheduleOfDay.allStartingDates»
								«var i = 0»
								«var rowSpan = 0»
								«FOR row : scheduleOfDay.getRows(roomComparator) SEPARATOR ","»
								[
									{
										«val startDate = startingDates.get(i++)»
										«val endDate = if (i < startingDates.size) {
											startingDates.get(i)
										} else {
											scheduleOfDay.lastDate
										}»
										start : "«hourFormat.format(startDate)»",
										«{rowSpan = computeSessionLength(startDate,endDate) null}»
										rowSpan : «rowSpan»
									},
									«FOR s : row SEPARATOR ","»
									«IF s.data == null»
									{
										rowSpan : «computeSessionLength(s.startDate, s.endDate)»
									}
									«ELSEIF s.data instanceof Session»
									{
										«val s_cast = s.data as Session»
										«val startingDate = computeDate(ProgramUtils.convertDate(d.date),s.startDate)»
										«val endingDate = computeDate(ProgramUtils.convertDate(d.date),s.endDate)»
										start : "«hourFormat.format(startingDate)»",
										end : "«hourFormat.format(endingDate)»",
										rowSpan : «computeSessionLength(s.startDate, s.endDate)»,
										icalStart : "«icalFormat.format(startingDate)»",
										icalEnd : "«icalFormat.format(endingDate)»",
										room : "«s_cast.room.name»",
										events : [
											«val events = s_cast.events»
											«IF events != null»
											«FOR e : events SEPARATOR ","»
											«getEvent(e, startingDate)»
											«ENDFOR»
											«ENDIF»
										]
									}
									«ENDIF»
									«ENDFOR»
								]«IF rowSpan > 1»,
								«FOR _ : newArrayOfSize(rowSpan - 1) SEPARATOR ","»
								[]
								«ENDFOR»
								«ENDIF»
								«{rowSpan = 0 null}»
								«ENDFOR»
							]
						}
						«ENDFOR»
					]
				'''
	}
}
