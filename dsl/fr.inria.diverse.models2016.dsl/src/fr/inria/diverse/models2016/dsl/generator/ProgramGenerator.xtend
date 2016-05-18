/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.generator

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import models2016.Clinic
import models2016.CoffeeBreak
import models2016.Conference
import models2016.Day
import models2016.DoctoralSymposium
import models2016.EducatorSymposium
import models2016.Event
import models2016.Lunch
import models2016.Panel
import models2016.Reception
import models2016.Room
import models2016.Session
import models2016.TalkSession
import models2016.Tutorial
import models2016.Workshop
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ProgramGenerator extends AbstractGenerator {

	private val Map<Day,List<Room>> roomsPerDay = new HashMap
	private val Map<Day,Map<Room,List<Session>>> sessionsPerRoomPerDay = new HashMap
	private val List<Session[]> sessionGroups = new ArrayList
	
	private val DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd")
	private val DateFormat hourFormat = new SimpleDateFormat("HH:mm")
	private val DateFormat icalFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'")
	
	private var Conference conference
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		roomsPerDay.clear
		sessionsPerRoomPerDay.clear
		conference = input.allContents.filter(typeof(Conference)).findFirst[true]
		if (conference != null) {
			val List<Room> rooms = conference.resources.filter(typeof(Room)).toList
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
				val List<Room> result = new ArrayList(roomsOfTheDay.sortWith([r1,r2|
					return rooms.indexOf(r1) - rooms.indexOf(r2)
				]))
				roomsPerDay.put(d,result)
			]
			sessionsPerRoomPerDay.forEach[d, sessionsPerRoom|
				val toBeSorted = new HashMap(sessionsPerRoom)
				toBeSorted.forEach[r, s|
					val sortedList = s.sortWith([s1,s2|
						return s1.startingTime.compareTo(s2.startingTime)
					])
					sessionsPerRoom.put(r, sortedList)
				]
			]
			
			sessionGroups.clear()
			
			sessionsPerRoomPerDay.forEach[d, sessionsPerRoom|
				val tmp = new HashMap(sessionsPerRoom)
				val roomsOfDay = roomsPerDay.get(d)
				var malformed = false
				while (getTotalLength(sessionsPerRoom) > 0 && !malformed) {
					var Date tmpStart = null
					for (Room r : roomsOfDay) {
						val l = tmp.get(r)
						if (l != null && !l.empty) {
							val start = l.get(0).startingTime
							if (tmpStart == null || tmpStart.compareTo(start) == 0) {
								tmpStart = start
							}
						}
					}
					if (tmpStart != null) {
						val earliestStart = tmpStart
						val Session[] sessionGroup = newArrayOfSize(roomsOfDay.size)
						sessionGroups.add(sessionGroup)
						tmp.forEach[r, l|
							val i = roomsOfDay.indexOf(r)
							if (l.empty || l.get(0).startingTime.compareTo(earliestStart) != 0) {
								sessionGroup.set(i, null)
							} else {
								val s = l.remove(0)
								sessionGroup.set(i, s)
							}
						]
					} else {
						malformed = true
					}
				}
			]
			
			fsa.generateFile('data.js', 'var data = ' + generate)
		}
	}
	
	def private <K,V> int getTotalLength(Map<K,List<V>> map) {
		val acc = new ArrayList
		map.forEach[k, l|acc.addAll(l)]
		return acc.size()
	}
	
	def private int computeSessionLength(Date start, Date end) {
		return 4 * (end.hours - start.hours) + (end.minutes - start.minutes) / 15
	}
	
	def private String computeSessionDate(Date day, Date hour) {
		val date = new Date
		date.year = day.year
		date.month = day.month
		date.date = day.date
		date.hours = hour.hours
		date.minutes = hour.minutes
		date.seconds = 0;
		return icalFormat.format(date)
	}
	
	def private String getTalkSession(TalkSession talkSession) {
		return
				'''
					{
						type : "TalkSession",
						title : «talkSession.name»,
						«IF talkSession.chair != null»
						chair : «talkSession.chair.name»,
						«ENDIF»
						papers : [
							«FOR p : talkSession.papers SEPARATOR ","»
							{
								title : «p.name»
								abstract : «p.abstract»
								authors : [
									«FOR a : p.authors SEPARATOR ","»
									«a.name»
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
						title : «workshop.name»,
						organizers : [
							«FOR o : workshop.organizers SEPARATOR ","»
							«o.name»
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
						title : «lunch.name»
					}
				'''
	}
	
	def private String getClinic(Clinic clinic) {
		return
				'''
					{
						type : "Clinic",
						title : «clinic.name»
					}
				'''
	}
	
	def private String getCoffeeBreak(CoffeeBreak coffeeBreak) {
		return
				'''
					{
						type : "CoffeeBreak",
						title : «coffeeBreak.name»
					}
				'''
	}
	
	def private String getReception(Reception reception) {
		return
				'''
					{
						type : "Reception",
						title : «reception.name»
					}
				'''
	}
	
	def private String getPanel(Panel panel) {
		return
				'''
					{
						type : "Panel",
						title : «panel.name»,
						moderators : [
							«FOR o : panel.moderators SEPARATOR ","»
							«o.name»
							«ENDFOR»
						],
						panelists : [
							«FOR o : panel.panelists SEPARATOR ","»
							«o.name»
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
						title : «symposium.name»,
						organizers : [
							«FOR o : symposium.organizers SEPARATOR ","»
							«o.name»
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
						title : «symposium.name»,
						organizers : [
							«FOR o : symposium.organizers SEPARATOR ","»
							«o.name»
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
						title : «tutorial.name»,
						organizers : [
							«FOR o : tutorial.organizers SEPARATOR ","»
							«o.name»
							«ENDFOR»
						]
					}
				'''
	}
	
	def String getEvent(Event event) {
		if (event instanceof TalkSession) {
			return getTalkSession(event as TalkSession)
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
		}
	}
	
	def String generate() {
		return 
				'''
					[
						«FOR d : conference.program.days SEPARATOR ","»
						{
							name : "«d.weekday.getName»",
							date : "«dateFormat.format(d.date)»",
							rooms : [
								«val roomsOfDay = roomsPerDay.get(d)»
								«FOR r : roomsOfDay SEPARATOR ","»
								{
									«val hasCapacity = r.capacity != null»
									name : «r.name»«IF hasCapacity»,«ENDIF»
									«IF hasCapacity»
									capacity : "«r.capacity»"
									«ENDIF»
								}
								«ENDFOR»
							],
							sessionGroups : [
								«FOR g : sessionGroups SEPARATOR ","»
								[
									«FOR s : g SEPARATOR ","»
									«IF s == null»
									{}
									«ELSE»
									{
										start : "«hourFormat.format(s.startingTime)»",
										end : "«hourFormat.format(s.endingTime)»",
										length : "«computeSessionLength(s.startingTime, s.endingTime)»",
										date : "«computeSessionDate(d.date,s.startingTime)»",
										events : [
											«val events = s.events»
											«IF events != null»
											«FOR e : events SEPARATOR ","»
											«getEvent(e)»
											«ENDFOR»
											«ENDIF»
										]
									}
									«ENDIF»
									«ENDFOR»
								]
								«ENDFOR»
							]
						}
						«ENDFOR»
					]
				'''
	}
}
