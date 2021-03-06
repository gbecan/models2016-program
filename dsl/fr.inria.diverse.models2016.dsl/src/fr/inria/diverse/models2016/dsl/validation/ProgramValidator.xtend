/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.validation

import fr.inria.diverse.models2016.dsl.utils.ProgramUtils
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import models2016.Day
import models2016.Models2016Package
import models2016.Room
import models2016.Session
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ProgramValidator extends AbstractProgramValidator {

	@Check
	def checkSessionTimes(Session session) {
		if (ProgramUtils.convertDate(session.startingTime).compareTo(ProgramUtils.convertDate(session.endingTime)) >= 0) {
			error("Session starting time is greater or equal to its ending time.", session, Models2016Package.Literals.SESSION__STARTING_TIME)
			error("Session starting time is greater or equal to its ending time.", session, Models2016Package.Literals.SESSION__ENDING_TIME)
		}
	}

	@Check
	def checkNoSessionOverlap(Day day) {
		val sessions = day.sessions
		val HashMap<Room,List<Session>> sessionsPerRoom = new HashMap
		sessions.forEach[s|
			var list = sessionsPerRoom.get(s.room)
			if (list == null) {
				list = new ArrayList
				sessionsPerRoom.put(s.room,list)
			}
			list.add(s)
		]
		
		val Set<Session> overlappingSessions = new HashSet
		sessionsPerRoom.forEach[r, l|
			l.forEach[s|
				for (Session sesh : l) {
					if (sesh != s) {
						val s_startingTime = ProgramUtils.convertDate(s.startingTime)
						val s_endingTime = ProgramUtils.convertDate(s.endingTime)
						val sesh_startingTime = ProgramUtils.convertDate(sesh.startingTime)
						val sesh_endingTime = ProgramUtils.convertDate(sesh.endingTime)
						if (s_startingTime.compareTo(sesh_endingTime) < 0 && s_endingTime.compareTo(sesh_endingTime) >= 0
							|| s_startingTime.compareTo(sesh_startingTime) <= 0 && s_endingTime.compareTo(sesh_startingTime) > 0) {
							overlappingSessions.addAll(s,sesh)
						}
					}
				}
			]
		]
		
		val sessionsFeature = day.eGet(Models2016Package.Literals.DAY__SESSIONS)
		if (sessionsFeature instanceof List<?>) {
			val l = sessionsFeature as List<?>
			for (Session s : overlappingSessions) {
				val i = l.indexOf(s)
				if (i != -1) {
					error("Overlapping sessions", day, Models2016Package.Literals.DAY__SESSIONS, i)
				}
			}
		}
	}
	
}
