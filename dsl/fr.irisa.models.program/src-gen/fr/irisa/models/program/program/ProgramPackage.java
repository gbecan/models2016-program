/**
 */
package fr.irisa.models.program.program;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.irisa.models.program.program.ProgramFactory
 * @model kind="package"
 * @generated
 */
public interface ProgramPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "program";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.irisa.fr/models/program/Program";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "program";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProgramPackage eINSTANCE = fr.irisa.models.program.program.impl.ProgramPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.impl.ProgramImpl
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Days</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DAYS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.impl.DayImpl <em>Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.impl.DayImpl
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getDay()
   * @generated
   */
  int DAY = 1;

  /**
   * The feature id for the '<em><b>Week Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY__WEEK_DAY = 0;

  /**
   * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY__SESSIONS = 1;

  /**
   * The number of structural features of the '<em>Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.impl.SessionImpl <em>Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.impl.SessionImpl
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getSession()
   * @generated
   */
  int SESSION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__START = 1;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__END = 2;

  /**
   * The feature id for the '<em><b>Talks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__TALKS = 3;

  /**
   * The number of structural features of the '<em>Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.impl.TalkImpl <em>Talk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.impl.TalkImpl
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getTalk()
   * @generated
   */
  int TALK = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__TYPE = 0;

  /**
   * The feature id for the '<em><b>Tilte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__TILTE = 1;

  /**
   * The feature id for the '<em><b>Room</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__ROOM = 2;

  /**
   * The feature id for the '<em><b>Speakers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__SPEAKERS = 3;

  /**
   * The number of structural features of the '<em>Talk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.TalkType <em>Talk Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.TalkType
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getTalkType()
   * @generated
   */
  int TALK_TYPE = 4;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.Room <em>Room</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.Room
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getRoom()
   * @generated
   */
  int ROOM = 5;

  /**
   * The meta object id for the '{@link fr.irisa.models.program.program.WeekDay <em>Week Day</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.irisa.models.program.program.WeekDay
   * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getWeekDay()
   * @generated
   */
  int WEEK_DAY = 6;


  /**
   * Returns the meta object for class '{@link fr.irisa.models.program.program.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see fr.irisa.models.program.program.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link fr.irisa.models.program.program.Program#getDays <em>Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Days</em>'.
   * @see fr.irisa.models.program.program.Program#getDays()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Days();

  /**
   * Returns the meta object for class '{@link fr.irisa.models.program.program.Day <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day</em>'.
   * @see fr.irisa.models.program.program.Day
   * @generated
   */
  EClass getDay();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Day#getWeekDay <em>Week Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Week Day</em>'.
   * @see fr.irisa.models.program.program.Day#getWeekDay()
   * @see #getDay()
   * @generated
   */
  EAttribute getDay_WeekDay();

  /**
   * Returns the meta object for the containment reference list '{@link fr.irisa.models.program.program.Day#getSessions <em>Sessions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sessions</em>'.
   * @see fr.irisa.models.program.program.Day#getSessions()
   * @see #getDay()
   * @generated
   */
  EReference getDay_Sessions();

  /**
   * Returns the meta object for class '{@link fr.irisa.models.program.program.Session <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session</em>'.
   * @see fr.irisa.models.program.program.Session
   * @generated
   */
  EClass getSession();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Session#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.irisa.models.program.program.Session#getName()
   * @see #getSession()
   * @generated
   */
  EAttribute getSession_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Session#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see fr.irisa.models.program.program.Session#getStart()
   * @see #getSession()
   * @generated
   */
  EAttribute getSession_Start();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Session#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see fr.irisa.models.program.program.Session#getEnd()
   * @see #getSession()
   * @generated
   */
  EAttribute getSession_End();

  /**
   * Returns the meta object for the containment reference list '{@link fr.irisa.models.program.program.Session#getTalks <em>Talks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Talks</em>'.
   * @see fr.irisa.models.program.program.Session#getTalks()
   * @see #getSession()
   * @generated
   */
  EReference getSession_Talks();

  /**
   * Returns the meta object for class '{@link fr.irisa.models.program.program.Talk <em>Talk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Talk</em>'.
   * @see fr.irisa.models.program.program.Talk
   * @generated
   */
  EClass getTalk();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Talk#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.irisa.models.program.program.Talk#getType()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Talk#getTilte <em>Tilte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tilte</em>'.
   * @see fr.irisa.models.program.program.Talk#getTilte()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Tilte();

  /**
   * Returns the meta object for the attribute '{@link fr.irisa.models.program.program.Talk#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Room</em>'.
   * @see fr.irisa.models.program.program.Talk#getRoom()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Room();

  /**
   * Returns the meta object for the attribute list '{@link fr.irisa.models.program.program.Talk#getSpeakers <em>Speakers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Speakers</em>'.
   * @see fr.irisa.models.program.program.Talk#getSpeakers()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Speakers();

  /**
   * Returns the meta object for enum '{@link fr.irisa.models.program.program.TalkType <em>Talk Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Talk Type</em>'.
   * @see fr.irisa.models.program.program.TalkType
   * @generated
   */
  EEnum getTalkType();

  /**
   * Returns the meta object for enum '{@link fr.irisa.models.program.program.Room <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Room</em>'.
   * @see fr.irisa.models.program.program.Room
   * @generated
   */
  EEnum getRoom();

  /**
   * Returns the meta object for enum '{@link fr.irisa.models.program.program.WeekDay <em>Week Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Week Day</em>'.
   * @see fr.irisa.models.program.program.WeekDay
   * @generated
   */
  EEnum getWeekDay();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProgramFactory getProgramFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.impl.ProgramImpl
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__DAYS = eINSTANCE.getProgram_Days();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.impl.DayImpl <em>Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.impl.DayImpl
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getDay()
     * @generated
     */
    EClass DAY = eINSTANCE.getDay();

    /**
     * The meta object literal for the '<em><b>Week Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY__WEEK_DAY = eINSTANCE.getDay_WeekDay();

    /**
     * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAY__SESSIONS = eINSTANCE.getDay_Sessions();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.impl.SessionImpl <em>Session</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.impl.SessionImpl
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getSession()
     * @generated
     */
    EClass SESSION = eINSTANCE.getSession();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION__NAME = eINSTANCE.getSession_Name();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION__START = eINSTANCE.getSession_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION__END = eINSTANCE.getSession_End();

    /**
     * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SESSION__TALKS = eINSTANCE.getSession_Talks();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.impl.TalkImpl <em>Talk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.impl.TalkImpl
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getTalk()
     * @generated
     */
    EClass TALK = eINSTANCE.getTalk();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__TYPE = eINSTANCE.getTalk_Type();

    /**
     * The meta object literal for the '<em><b>Tilte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__TILTE = eINSTANCE.getTalk_Tilte();

    /**
     * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__ROOM = eINSTANCE.getTalk_Room();

    /**
     * The meta object literal for the '<em><b>Speakers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__SPEAKERS = eINSTANCE.getTalk_Speakers();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.TalkType <em>Talk Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.TalkType
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getTalkType()
     * @generated
     */
    EEnum TALK_TYPE = eINSTANCE.getTalkType();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.Room <em>Room</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.Room
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getRoom()
     * @generated
     */
    EEnum ROOM = eINSTANCE.getRoom();

    /**
     * The meta object literal for the '{@link fr.irisa.models.program.program.WeekDay <em>Week Day</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.irisa.models.program.program.WeekDay
     * @see fr.irisa.models.program.program.impl.ProgramPackageImpl#getWeekDay()
     * @generated
     */
    EEnum WEEK_DAY = eINSTANCE.getWeekDay();

  }

} //ProgramPackage