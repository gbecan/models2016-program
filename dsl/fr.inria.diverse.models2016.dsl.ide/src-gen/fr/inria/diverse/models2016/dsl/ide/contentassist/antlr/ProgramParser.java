/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.inria.diverse.models2016.dsl.ide.contentassist.antlr.internal.InternalProgramParser;
import fr.inria.diverse.models2016.dsl.services.ProgramGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ProgramParser extends AbstractContentAssistParser {

	@Inject
	private ProgramGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalProgramParser createParser() {
		InternalProgramParser result = new InternalProgramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
					put(grammarAccess.getWeekDayAccess().getAlternatives(), "rule__WeekDay__Alternatives");
					put(grammarAccess.getConferenceAccess().getGroup(), "rule__Conference__Group__0");
					put(grammarAccess.getConferenceAccess().getGroup_5(), "rule__Conference__Group_5__0");
					put(grammarAccess.getConferenceAccess().getGroup_5_2(), "rule__Conference__Group_5_2__0");
					put(grammarAccess.getConferenceAccess().getGroup_6(), "rule__Conference__Group_6__0");
					put(grammarAccess.getConferenceAccess().getGroup_7(), "rule__Conference__Group_7__0");
					put(grammarAccess.getConferenceAccess().getGroup_7_3(), "rule__Conference__Group_7_3__0");
					put(grammarAccess.getConferenceAccess().getGroup_8(), "rule__Conference__Group_8__0");
					put(grammarAccess.getConferenceAccess().getGroup_8_3(), "rule__Conference__Group_8_3__0");
					put(grammarAccess.getConferenceAccess().getGroup_9(), "rule__Conference__Group_9__0");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_2(), "rule__Program__Group_2__0");
					put(grammarAccess.getRoomAccess().getGroup(), "rule__Room__Group__0");
					put(grammarAccess.getRoomAccess().getGroup_3(), "rule__Room__Group_3__0");
					put(grammarAccess.getDayAccess().getGroup(), "rule__Day__Group__0");
					put(grammarAccess.getDayAccess().getGroup_1(), "rule__Day__Group_1__0");
					put(grammarAccess.getDayAccess().getGroup_2(), "rule__Day__Group_2__0");
					put(grammarAccess.getDayDateAccess().getGroup(), "rule__DayDate__Group__0");
					put(grammarAccess.getHourDateAccess().getGroup(), "rule__HourDate__Group__0");
					put(grammarAccess.getSessionAccess().getGroup(), "rule__Session__Group__0");
					put(grammarAccess.getSessionAccess().getGroup_8(), "rule__Session__Group_8__0");
					put(grammarAccess.getTalkSessionAccess().getGroup(), "rule__TalkSession__Group__0");
					put(grammarAccess.getTalkSessionAccess().getGroup_2(), "rule__TalkSession__Group_2__0");
					put(grammarAccess.getTalkSessionAccess().getGroup_3(), "rule__TalkSession__Group_3__0");
					put(grammarAccess.getTalkSessionAccess().getGroup_4(), "rule__TalkSession__Group_4__0");
					put(grammarAccess.getTalkSessionAccess().getGroup_4_2(), "rule__TalkSession__Group_4_2__0");
					put(grammarAccess.getPanelAccess().getGroup(), "rule__Panel__Group__0");
					put(grammarAccess.getPanelAccess().getGroup_2(), "rule__Panel__Group_2__0");
					put(grammarAccess.getPanelAccess().getGroup_3(), "rule__Panel__Group_3__0");
					put(grammarAccess.getPanelAccess().getGroup_3_2(), "rule__Panel__Group_3_2__0");
					put(grammarAccess.getPanelAccess().getGroup_4(), "rule__Panel__Group_4__0");
					put(grammarAccess.getPanelAccess().getGroup_4_2(), "rule__Panel__Group_4_2__0");
					put(grammarAccess.getSRCAccess().getGroup(), "rule__SRC__Group__0");
					put(grammarAccess.getSRCAccess().getGroup_2(), "rule__SRC__Group_2__0");
					put(grammarAccess.getSRCAccess().getGroup_3(), "rule__SRC__Group_3__0");
					put(grammarAccess.getPosterAccess().getGroup(), "rule__Poster__Group__0");
					put(grammarAccess.getPosterAccess().getGroup_2(), "rule__Poster__Group_2__0");
					put(grammarAccess.getPosterAccess().getGroup_3(), "rule__Poster__Group_3__0");
					put(grammarAccess.getKeynoteAccess().getGroup(), "rule__Keynote__Group__0");
					put(grammarAccess.getKeynoteAccess().getGroup_2(), "rule__Keynote__Group_2__0");
					put(grammarAccess.getKeynoteAccess().getGroup_3(), "rule__Keynote__Group_3__0");
					put(grammarAccess.getKeynoteAccess().getGroup_4(), "rule__Keynote__Group_4__0");
					put(grammarAccess.getSponsorKeynoteAccess().getGroup(), "rule__SponsorKeynote__Group__0");
					put(grammarAccess.getSponsorKeynoteAccess().getGroup_2(), "rule__SponsorKeynote__Group_2__0");
					put(grammarAccess.getSponsorKeynoteAccess().getGroup_3(), "rule__SponsorKeynote__Group_3__0");
					put(grammarAccess.getSponsorKeynoteAccess().getGroup_4(), "rule__SponsorKeynote__Group_4__0");
					put(grammarAccess.getWorkshopAccess().getGroup(), "rule__Workshop__Group__0");
					put(grammarAccess.getWorkshopAccess().getGroup_2(), "rule__Workshop__Group_2__0");
					put(grammarAccess.getWorkshopAccess().getGroup_3(), "rule__Workshop__Group_3__0");
					put(grammarAccess.getWorkshopAccess().getGroup_4(), "rule__Workshop__Group_4__0");
					put(grammarAccess.getWorkshopAccess().getGroup_5(), "rule__Workshop__Group_5__0");
					put(grammarAccess.getWorkshopAccess().getGroup_5_2(), "rule__Workshop__Group_5_2__0");
					put(grammarAccess.getTutorialAccess().getGroup(), "rule__Tutorial__Group__0");
					put(grammarAccess.getTutorialAccess().getGroup_2(), "rule__Tutorial__Group_2__0");
					put(grammarAccess.getTutorialAccess().getGroup_3(), "rule__Tutorial__Group_3__0");
					put(grammarAccess.getTutorialAccess().getGroup_3_2(), "rule__Tutorial__Group_3_2__0");
					put(grammarAccess.getDoctoralSymposiumAccess().getGroup(), "rule__DoctoralSymposium__Group__0");
					put(grammarAccess.getDoctoralSymposiumAccess().getGroup_2(), "rule__DoctoralSymposium__Group_2__0");
					put(grammarAccess.getDoctoralSymposiumAccess().getGroup_3(), "rule__DoctoralSymposium__Group_3__0");
					put(grammarAccess.getDoctoralSymposiumAccess().getGroup_4(), "rule__DoctoralSymposium__Group_4__0");
					put(grammarAccess.getDoctoralSymposiumAccess().getGroup_4_2(), "rule__DoctoralSymposium__Group_4_2__0");
					put(grammarAccess.getEducatorSymposiumAccess().getGroup(), "rule__EducatorSymposium__Group__0");
					put(grammarAccess.getEducatorSymposiumAccess().getGroup_2(), "rule__EducatorSymposium__Group_2__0");
					put(grammarAccess.getEducatorSymposiumAccess().getGroup_3(), "rule__EducatorSymposium__Group_3__0");
					put(grammarAccess.getEducatorSymposiumAccess().getGroup_4(), "rule__EducatorSymposium__Group_4__0");
					put(grammarAccess.getEducatorSymposiumAccess().getGroup_4_2(), "rule__EducatorSymposium__Group_4_2__0");
					put(grammarAccess.getReceptionAccess().getGroup(), "rule__Reception__Group__0");
					put(grammarAccess.getReceptionAccess().getGroup_2(), "rule__Reception__Group_2__0");
					put(grammarAccess.getClinicAccess().getGroup(), "rule__Clinic__Group__0");
					put(grammarAccess.getClinicAccess().getGroup_2(), "rule__Clinic__Group_2__0");
					put(grammarAccess.getClinicAccess().getGroup_3(), "rule__Clinic__Group_3__0");
					put(grammarAccess.getLunchAccess().getGroup(), "rule__Lunch__Group__0");
					put(grammarAccess.getLunchAccess().getGroup_2(), "rule__Lunch__Group_2__0");
					put(grammarAccess.getCoffeeBreakAccess().getGroup(), "rule__CoffeeBreak__Group__0");
					put(grammarAccess.getCoffeeBreakAccess().getGroup_2(), "rule__CoffeeBreak__Group_2__0");
					put(grammarAccess.getMeetingAccess().getGroup(), "rule__Meeting__Group__0");
					put(grammarAccess.getMeetingAccess().getGroup_2(), "rule__Meeting__Group_2__0");
					put(grammarAccess.getMeetingAccess().getGroup_3(), "rule__Meeting__Group_3__0");
					put(grammarAccess.getMeetingAccess().getGroup_3_2(), "rule__Meeting__Group_3_2__0");
					put(grammarAccess.getOpeningAccess().getGroup(), "rule__Opening__Group__0");
					put(grammarAccess.getOpeningAccess().getGroup_2(), "rule__Opening__Group_2__0");
					put(grammarAccess.getPaperAccess().getGroup(), "rule__Paper__Group__0");
					put(grammarAccess.getPaperAccess().getGroup_4(), "rule__Paper__Group_4__0");
					put(grammarAccess.getPaperAccess().getGroup_5(), "rule__Paper__Group_5__0");
					put(grammarAccess.getPaperAccess().getGroup_6(), "rule__Paper__Group_6__0");
					put(grammarAccess.getPaperAccess().getGroup_7(), "rule__Paper__Group_7__0");
					put(grammarAccess.getPaperAccess().getGroup_8(), "rule__Paper__Group_8__0");
					put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
					put(grammarAccess.getPersonAccess().getGroup_2(), "rule__Person__Group_2__0");
					put(grammarAccess.getPersonAccess().getGroup_3(), "rule__Person__Group_3__0");
					put(grammarAccess.getKindAccess().getGroup(), "rule__Kind__Group__0");
					put(grammarAccess.getConferenceAccess().getNameAssignment_2(), "rule__Conference__NameAssignment_2");
					put(grammarAccess.getConferenceAccess().getTalkDurationAssignment_4(), "rule__Conference__TalkDurationAssignment_4");
					put(grammarAccess.getConferenceAccess().getKindsAssignment_5_1(), "rule__Conference__KindsAssignment_5_1");
					put(grammarAccess.getConferenceAccess().getKindsAssignment_5_2_1(), "rule__Conference__KindsAssignment_5_2_1");
					put(grammarAccess.getConferenceAccess().getResourcesAssignment_6_1(), "rule__Conference__ResourcesAssignment_6_1");
					put(grammarAccess.getConferenceAccess().getResourcesAssignment_6_2(), "rule__Conference__ResourcesAssignment_6_2");
					put(grammarAccess.getConferenceAccess().getPapersAssignment_7_2(), "rule__Conference__PapersAssignment_7_2");
					put(grammarAccess.getConferenceAccess().getPapersAssignment_7_3_1(), "rule__Conference__PapersAssignment_7_3_1");
					put(grammarAccess.getConferenceAccess().getEventsAssignment_8_2(), "rule__Conference__EventsAssignment_8_2");
					put(grammarAccess.getConferenceAccess().getEventsAssignment_8_3_1(), "rule__Conference__EventsAssignment_8_3_1");
					put(grammarAccess.getConferenceAccess().getProgramAssignment_9_1(), "rule__Conference__ProgramAssignment_9_1");
					put(grammarAccess.getProgramAccess().getDaysAssignment_2_0(), "rule__Program__DaysAssignment_2_0");
					put(grammarAccess.getProgramAccess().getDaysAssignment_2_1(), "rule__Program__DaysAssignment_2_1");
					put(grammarAccess.getRoomAccess().getNameAssignment_2(), "rule__Room__NameAssignment_2");
					put(grammarAccess.getRoomAccess().getCapacityAssignment_3_1(), "rule__Room__CapacityAssignment_3_1");
					put(grammarAccess.getDayAccess().getWeekdayAssignment_0(), "rule__Day__WeekdayAssignment_0");
					put(grammarAccess.getDayAccess().getDateAssignment_1_1(), "rule__Day__DateAssignment_1_1");
					put(grammarAccess.getDayAccess().getSessionsAssignment_2_0(), "rule__Day__SessionsAssignment_2_0");
					put(grammarAccess.getDayAccess().getSessionsAssignment_2_1(), "rule__Day__SessionsAssignment_2_1");
					put(grammarAccess.getDayDateAccess().getYearAssignment_0(), "rule__DayDate__YearAssignment_0");
					put(grammarAccess.getDayDateAccess().getMonthAssignment_2(), "rule__DayDate__MonthAssignment_2");
					put(grammarAccess.getDayDateAccess().getDayAssignment_4(), "rule__DayDate__DayAssignment_4");
					put(grammarAccess.getHourDateAccess().getHoursAssignment_0(), "rule__HourDate__HoursAssignment_0");
					put(grammarAccess.getHourDateAccess().getMinutesAssignment_2(), "rule__HourDate__MinutesAssignment_2");
					put(grammarAccess.getSessionAccess().getStartingTimeAssignment_1(), "rule__Session__StartingTimeAssignment_1");
					put(grammarAccess.getSessionAccess().getEndingTimeAssignment_3(), "rule__Session__EndingTimeAssignment_3");
					put(grammarAccess.getSessionAccess().getRoomAssignment_5(), "rule__Session__RoomAssignment_5");
					put(grammarAccess.getSessionAccess().getEventsAssignment_7(), "rule__Session__EventsAssignment_7");
					put(grammarAccess.getSessionAccess().getEventsAssignment_8_1(), "rule__Session__EventsAssignment_8_1");
					put(grammarAccess.getTalkSessionAccess().getNameAssignment_1(), "rule__TalkSession__NameAssignment_1");
					put(grammarAccess.getTalkSessionAccess().getChairAssignment_2_1(), "rule__TalkSession__ChairAssignment_2_1");
					put(grammarAccess.getTalkSessionAccess().getAbstractAssignment_3_1(), "rule__TalkSession__AbstractAssignment_3_1");
					put(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_1(), "rule__TalkSession__PapersAssignment_4_1");
					put(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_2_1(), "rule__TalkSession__PapersAssignment_4_2_1");
					put(grammarAccess.getPanelAccess().getNameAssignment_1(), "rule__Panel__NameAssignment_1");
					put(grammarAccess.getPanelAccess().getAbstractAssignment_2_1(), "rule__Panel__AbstractAssignment_2_1");
					put(grammarAccess.getPanelAccess().getPanelistsAssignment_3_1(), "rule__Panel__PanelistsAssignment_3_1");
					put(grammarAccess.getPanelAccess().getPanelistsAssignment_3_2_1(), "rule__Panel__PanelistsAssignment_3_2_1");
					put(grammarAccess.getPanelAccess().getModeratorsAssignment_4_1(), "rule__Panel__ModeratorsAssignment_4_1");
					put(grammarAccess.getPanelAccess().getModeratorsAssignment_4_2_1(), "rule__Panel__ModeratorsAssignment_4_2_1");
					put(grammarAccess.getPanelAccess().getCancelledAssignment_5(), "rule__Panel__CancelledAssignment_5");
					put(grammarAccess.getSRCAccess().getNameAssignment_1(), "rule__SRC__NameAssignment_1");
					put(grammarAccess.getSRCAccess().getAbstractAssignment_2_1(), "rule__SRC__AbstractAssignment_2_1");
					put(grammarAccess.getSRCAccess().getUrlAssignment_3_1(), "rule__SRC__UrlAssignment_3_1");
					put(grammarAccess.getSRCAccess().getCancelledAssignment_4(), "rule__SRC__CancelledAssignment_4");
					put(grammarAccess.getPosterAccess().getNameAssignment_1(), "rule__Poster__NameAssignment_1");
					put(grammarAccess.getPosterAccess().getAbstractAssignment_2_1(), "rule__Poster__AbstractAssignment_2_1");
					put(grammarAccess.getPosterAccess().getUrlAssignment_3_1(), "rule__Poster__UrlAssignment_3_1");
					put(grammarAccess.getPosterAccess().getCancelledAssignment_4(), "rule__Poster__CancelledAssignment_4");
					put(grammarAccess.getKeynoteAccess().getNameAssignment_1(), "rule__Keynote__NameAssignment_1");
					put(grammarAccess.getKeynoteAccess().getAbstractAssignment_2_1(), "rule__Keynote__AbstractAssignment_2_1");
					put(grammarAccess.getKeynoteAccess().getSpeakerAssignment_3_1(), "rule__Keynote__SpeakerAssignment_3_1");
					put(grammarAccess.getKeynoteAccess().getChairAssignment_4_1(), "rule__Keynote__ChairAssignment_4_1");
					put(grammarAccess.getKeynoteAccess().getCancelledAssignment_5(), "rule__Keynote__CancelledAssignment_5");
					put(grammarAccess.getSponsorKeynoteAccess().getNameAssignment_1(), "rule__SponsorKeynote__NameAssignment_1");
					put(grammarAccess.getSponsorKeynoteAccess().getAbstractAssignment_2_1(), "rule__SponsorKeynote__AbstractAssignment_2_1");
					put(grammarAccess.getSponsorKeynoteAccess().getSpeakerAssignment_3_1(), "rule__SponsorKeynote__SpeakerAssignment_3_1");
					put(grammarAccess.getSponsorKeynoteAccess().getChairAssignment_4_1(), "rule__SponsorKeynote__ChairAssignment_4_1");
					put(grammarAccess.getSponsorKeynoteAccess().getCancelledAssignment_5(), "rule__SponsorKeynote__CancelledAssignment_5");
					put(grammarAccess.getWorkshopAccess().getNameAssignment_1(), "rule__Workshop__NameAssignment_1");
					put(grammarAccess.getWorkshopAccess().getAbstractAssignment_2_1(), "rule__Workshop__AbstractAssignment_2_1");
					put(grammarAccess.getWorkshopAccess().getUrlAssignment_3_1(), "rule__Workshop__UrlAssignment_3_1");
					put(grammarAccess.getWorkshopAccess().getFullNameAssignment_4_1(), "rule__Workshop__FullNameAssignment_4_1");
					put(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_1(), "rule__Workshop__OrganizersAssignment_5_1");
					put(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_2_1(), "rule__Workshop__OrganizersAssignment_5_2_1");
					put(grammarAccess.getWorkshopAccess().getCancelledAssignment_6(), "rule__Workshop__CancelledAssignment_6");
					put(grammarAccess.getTutorialAccess().getNameAssignment_1(), "rule__Tutorial__NameAssignment_1");
					put(grammarAccess.getTutorialAccess().getAbstractAssignment_2_1(), "rule__Tutorial__AbstractAssignment_2_1");
					put(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_1(), "rule__Tutorial__OrganizersAssignment_3_1");
					put(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_2_1(), "rule__Tutorial__OrganizersAssignment_3_2_1");
					put(grammarAccess.getTutorialAccess().getCancelledAssignment_4(), "rule__Tutorial__CancelledAssignment_4");
					put(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_1(), "rule__DoctoralSymposium__NameAssignment_1");
					put(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_2_1(), "rule__DoctoralSymposium__AbstractAssignment_2_1");
					put(grammarAccess.getDoctoralSymposiumAccess().getUrlAssignment_3_1(), "rule__DoctoralSymposium__UrlAssignment_3_1");
					put(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_1(), "rule__DoctoralSymposium__OrganizersAssignment_4_1");
					put(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_2_1(), "rule__DoctoralSymposium__OrganizersAssignment_4_2_1");
					put(grammarAccess.getDoctoralSymposiumAccess().getCancelledAssignment_5(), "rule__DoctoralSymposium__CancelledAssignment_5");
					put(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_1(), "rule__EducatorSymposium__NameAssignment_1");
					put(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_2_1(), "rule__EducatorSymposium__AbstractAssignment_2_1");
					put(grammarAccess.getEducatorSymposiumAccess().getUrlAssignment_3_1(), "rule__EducatorSymposium__UrlAssignment_3_1");
					put(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_1(), "rule__EducatorSymposium__OrganizersAssignment_4_1");
					put(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_2_1(), "rule__EducatorSymposium__OrganizersAssignment_4_2_1");
					put(grammarAccess.getEducatorSymposiumAccess().getCancelledAssignment_5(), "rule__EducatorSymposium__CancelledAssignment_5");
					put(grammarAccess.getReceptionAccess().getNameAssignment_1(), "rule__Reception__NameAssignment_1");
					put(grammarAccess.getReceptionAccess().getAbstractAssignment_2_1(), "rule__Reception__AbstractAssignment_2_1");
					put(grammarAccess.getReceptionAccess().getCancelledAssignment_3(), "rule__Reception__CancelledAssignment_3");
					put(grammarAccess.getClinicAccess().getNameAssignment_1(), "rule__Clinic__NameAssignment_1");
					put(grammarAccess.getClinicAccess().getAbstractAssignment_2_1(), "rule__Clinic__AbstractAssignment_2_1");
					put(grammarAccess.getClinicAccess().getUrlAssignment_3_1(), "rule__Clinic__UrlAssignment_3_1");
					put(grammarAccess.getClinicAccess().getCancelledAssignment_4(), "rule__Clinic__CancelledAssignment_4");
					put(grammarAccess.getLunchAccess().getNameAssignment_1(), "rule__Lunch__NameAssignment_1");
					put(grammarAccess.getLunchAccess().getAbstractAssignment_2_1(), "rule__Lunch__AbstractAssignment_2_1");
					put(grammarAccess.getCoffeeBreakAccess().getNameAssignment_1(), "rule__CoffeeBreak__NameAssignment_1");
					put(grammarAccess.getCoffeeBreakAccess().getAbstractAssignment_2_1(), "rule__CoffeeBreak__AbstractAssignment_2_1");
					put(grammarAccess.getMeetingAccess().getNameAssignment_1(), "rule__Meeting__NameAssignment_1");
					put(grammarAccess.getMeetingAccess().getAbstractAssignment_2_1(), "rule__Meeting__AbstractAssignment_2_1");
					put(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_1(), "rule__Meeting__ParticipantsAssignment_3_1");
					put(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_2_1(), "rule__Meeting__ParticipantsAssignment_3_2_1");
					put(grammarAccess.getMeetingAccess().getCancelledAssignment_4(), "rule__Meeting__CancelledAssignment_4");
					put(grammarAccess.getOpeningAccess().getNameAssignment_1(), "rule__Opening__NameAssignment_1");
					put(grammarAccess.getOpeningAccess().getAbstractAssignment_2_1(), "rule__Opening__AbstractAssignment_2_1");
					put(grammarAccess.getOpeningAccess().getCancelledAssignment_3(), "rule__Opening__CancelledAssignment_3");
					put(grammarAccess.getPaperAccess().getNameAssignment_1(), "rule__Paper__NameAssignment_1");
					put(grammarAccess.getPaperAccess().getAuthorsAssignment_3(), "rule__Paper__AuthorsAssignment_3");
					put(grammarAccess.getPaperAccess().getAuthorsAssignment_4_1(), "rule__Paper__AuthorsAssignment_4_1");
					put(grammarAccess.getPaperAccess().getAbstractAssignment_5_1(), "rule__Paper__AbstractAssignment_5_1");
					put(grammarAccess.getPaperAccess().getPreprintAssignment_6_1(), "rule__Paper__PreprintAssignment_6_1");
					put(grammarAccess.getPaperAccess().getKindAssignment_7_1(), "rule__Paper__KindAssignment_7_1");
					put(grammarAccess.getPaperAccess().getProceedingsAssignment_8_1(), "rule__Paper__ProceedingsAssignment_8_1");
					put(grammarAccess.getPaperAccess().getCancelledAssignment_9(), "rule__Paper__CancelledAssignment_9");
					put(grammarAccess.getPersonAccess().getNameAssignment_1(), "rule__Person__NameAssignment_1");
					put(grammarAccess.getPersonAccess().getEmailAssignment_2_1(), "rule__Person__EmailAssignment_2_1");
					put(grammarAccess.getPersonAccess().getHomepageAssignment_3_1(), "rule__Person__HomepageAssignment_3_1");
					put(grammarAccess.getKindAccess().getNameAssignment_1(), "rule__Kind__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalProgramParser typedParser = (InternalProgramParser) parser;
			typedParser.entryRuleConference();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ProgramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
