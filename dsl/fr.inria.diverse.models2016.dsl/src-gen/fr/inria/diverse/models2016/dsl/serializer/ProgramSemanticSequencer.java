/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.models2016.dsl.services.ProgramGrammarAccess;
import java.util.Set;
import models2016.Clinic;
import models2016.CoffeeBreak;
import models2016.Conference;
import models2016.Date;
import models2016.Day;
import models2016.DoctoralSymposium;
import models2016.EducatorSymposium;
import models2016.Keynote;
import models2016.Kind;
import models2016.Lunch;
import models2016.Meeting;
import models2016.Models2016Package;
import models2016.Opening;
import models2016.Panel;
import models2016.Paper;
import models2016.Person;
import models2016.Poster;
import models2016.Program;
import models2016.Reception;
import models2016.Room;
import models2016.SRC;
import models2016.Session;
import models2016.SponsorKeynote;
import models2016.TalkSession;
import models2016.Tutorial;
import models2016.Workshop;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProgramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProgramGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Models2016Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Models2016Package.CLINIC:
				sequence_Clinic(context, (Clinic) semanticObject); 
				return; 
			case Models2016Package.COFFEE_BREAK:
				sequence_CoffeeBreak(context, (CoffeeBreak) semanticObject); 
				return; 
			case Models2016Package.CONFERENCE:
				sequence_Conference(context, (Conference) semanticObject); 
				return; 
			case Models2016Package.DATE:
				if (rule == grammarAccess.getDayDateRule()) {
					sequence_DayDate(context, (Date) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getHourDateRule()) {
					sequence_HourDate(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case Models2016Package.DAY:
				sequence_Day(context, (Day) semanticObject); 
				return; 
			case Models2016Package.DOCTORAL_SYMPOSIUM:
				sequence_DoctoralSymposium(context, (DoctoralSymposium) semanticObject); 
				return; 
			case Models2016Package.EDUCATOR_SYMPOSIUM:
				sequence_EducatorSymposium(context, (EducatorSymposium) semanticObject); 
				return; 
			case Models2016Package.KEYNOTE:
				sequence_Keynote(context, (Keynote) semanticObject); 
				return; 
			case Models2016Package.KIND:
				sequence_Kind(context, (Kind) semanticObject); 
				return; 
			case Models2016Package.LUNCH:
				sequence_Lunch(context, (Lunch) semanticObject); 
				return; 
			case Models2016Package.MEETING:
				sequence_Meeting(context, (Meeting) semanticObject); 
				return; 
			case Models2016Package.OPENING:
				sequence_Opening(context, (Opening) semanticObject); 
				return; 
			case Models2016Package.PANEL:
				sequence_Panel(context, (Panel) semanticObject); 
				return; 
			case Models2016Package.PAPER:
				sequence_Paper(context, (Paper) semanticObject); 
				return; 
			case Models2016Package.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case Models2016Package.POSTER:
				sequence_Poster(context, (Poster) semanticObject); 
				return; 
			case Models2016Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case Models2016Package.RECEPTION:
				sequence_Reception(context, (Reception) semanticObject); 
				return; 
			case Models2016Package.ROOM:
				sequence_Room(context, (Room) semanticObject); 
				return; 
			case Models2016Package.SRC:
				sequence_SRC(context, (SRC) semanticObject); 
				return; 
			case Models2016Package.SESSION:
				sequence_Session(context, (Session) semanticObject); 
				return; 
			case Models2016Package.SPONSOR_KEYNOTE:
				sequence_SponsorKeynote(context, (SponsorKeynote) semanticObject); 
				return; 
			case Models2016Package.TALK_SESSION:
				sequence_TalkSession(context, (TalkSession) semanticObject); 
				return; 
			case Models2016Package.TUTORIAL:
				sequence_Tutorial(context, (Tutorial) semanticObject); 
				return; 
			case Models2016Package.WORKSHOP:
				sequence_Workshop(context, (Workshop) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Event returns Clinic
	 *     Clinic returns Clinic
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? url=STRING?)
	 */
	protected void sequence_Clinic(ISerializationContext context, Clinic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns CoffeeBreak
	 *     CoffeeBreak returns CoffeeBreak
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING?)
	 */
	protected void sequence_CoffeeBreak(ISerializationContext context, CoffeeBreak semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conference returns Conference
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         talkDuration=INT 
	 *         (kinds+=Kind kinds+=Kind*)? 
	 *         (resources+=Resource resources+=Resource*)? 
	 *         (papers+=Paper papers+=Paper*)? 
	 *         (events+=Event events+=Event*)? 
	 *         program=Program?
	 *     )
	 */
	protected void sequence_Conference(ISerializationContext context, Conference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DayDate returns Date
	 *
	 * Constraint:
	 *     (year=INT month=INT day=INT)
	 */
	protected void sequence_DayDate(ISerializationContext context, Date semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.DATE__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.DATE__YEAR));
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.DATE__MONTH));
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.DATE__DAY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDayDateAccess().getYearINTTerminalRuleCall_0_0(), semanticObject.getYear());
		feeder.accept(grammarAccess.getDayDateAccess().getMonthINTTerminalRuleCall_2_0(), semanticObject.getMonth());
		feeder.accept(grammarAccess.getDayDateAccess().getDayINTTerminalRuleCall_4_0(), semanticObject.getDay());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Day returns Day
	 *
	 * Constraint:
	 *     (weekday=WeekDay date=DayDate? (sessions+=Session sessions+=Session*)?)
	 */
	protected void sequence_Day(ISerializationContext context, Day semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns DoctoralSymposium
	 *     DoctoralSymposium returns DoctoralSymposium
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? url=STRING? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_DoctoralSymposium(ISerializationContext context, DoctoralSymposium semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns EducatorSymposium
	 *     EducatorSymposium returns EducatorSymposium
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? url=STRING? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_EducatorSymposium(ISerializationContext context, EducatorSymposium semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HourDate returns Date
	 *
	 * Constraint:
	 *     (hours=INT minutes=INT)
	 */
	protected void sequence_HourDate(ISerializationContext context, Date semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.DATE__HOURS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.DATE__HOURS));
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.DATE__MINUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.DATE__MINUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHourDateAccess().getHoursINTTerminalRuleCall_0_0(), semanticObject.getHours());
		feeder.accept(grammarAccess.getHourDateAccess().getMinutesINTTerminalRuleCall_2_0(), semanticObject.getMinutes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Keynote
	 *     Keynote returns Keynote
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? speaker=Person?)
	 */
	protected void sequence_Keynote(ISerializationContext context, Keynote semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Kind returns Kind
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Kind(ISerializationContext context, Kind semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Models2016Package.Literals.KIND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Models2016Package.Literals.KIND__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKindAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Lunch
	 *     Lunch returns Lunch
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING?)
	 */
	protected void sequence_Lunch(ISerializationContext context, Lunch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Meeting
	 *     Meeting returns Meeting
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? (participants+=Person participants+=Person*)?)
	 */
	protected void sequence_Meeting(ISerializationContext context, Meeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Opening
	 *     Opening returns Opening
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING?)
	 */
	protected void sequence_Opening(ISerializationContext context, Opening semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Panel
	 *     Panel returns Panel
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? (panelists+=Person panelists+=Person*)? (moderators+=Person moderators+=Person*)?)
	 */
	protected void sequence_Panel(ISerializationContext context, Panel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Paper returns Paper
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         authors+=Person 
	 *         authors+=Person* 
	 *         abstract=STRING? 
	 *         preprint=STRING? 
	 *         kind=[Kind|STRING]?
	 *     )
	 */
	protected void sequence_Paper(ISerializationContext context, Paper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     (name=STRING email=STRING? homepage=STRING?)
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Poster
	 *     Poster returns Poster
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING?)
	 */
	protected void sequence_Poster(ISerializationContext context, Poster semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (days+=Day days+=Day*)?
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Reception
	 *     Reception returns Reception
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING?)
	 */
	protected void sequence_Reception(ISerializationContext context, Reception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Resource returns Room
	 *     Room returns Room
	 *
	 * Constraint:
	 *     (name=STRING capacity=INT?)
	 */
	protected void sequence_Room(ISerializationContext context, Room semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns SRC
	 *     SRC returns SRC
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? url=STRING?)
	 */
	protected void sequence_SRC(ISerializationContext context, SRC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Session returns Session
	 *
	 * Constraint:
	 *     (startingTime=HourDate endingTime=HourDate room=[Room|STRING] events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Session(ISerializationContext context, Session semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns SponsorKeynote
	 *     SponsorKeynote returns SponsorKeynote
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? speaker=Person?)
	 */
	protected void sequence_SponsorKeynote(ISerializationContext context, SponsorKeynote semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns TalkSession
	 *     TalkSession returns TalkSession
	 *
	 * Constraint:
	 *     (name=STRING chair=Person? abstract=STRING? (papers+=[Paper|STRING] papers+=[Paper|STRING]*)?)
	 */
	protected void sequence_TalkSession(ISerializationContext context, TalkSession semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Tutorial
	 *     Tutorial returns Tutorial
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_Tutorial(ISerializationContext context, Tutorial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Workshop
	 *     Workshop returns Workshop
	 *
	 * Constraint:
	 *     (name=STRING abstract=STRING? url=STRING? fullName=STRING? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_Workshop(ISerializationContext context, Workshop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
