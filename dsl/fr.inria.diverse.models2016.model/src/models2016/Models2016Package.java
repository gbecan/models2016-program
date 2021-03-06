/**
 */
package models2016;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see models2016.Models2016Factory
 * @model kind="package"
 * @generated
 */
public interface Models2016Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "models2016";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/models2016";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "models2016";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Models2016Package eINSTANCE = models2016.impl.Models2016PackageImpl.init();

	/**
	 * The meta object id for the '{@link models2016.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.DayImpl
	 * @see models2016.impl.Models2016PackageImpl#getDay()
	 * @generated
	 */
	int DAY = 0;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__WEEKDAY = 0;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__SESSIONS = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DATE = 2;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.ProgramImpl
	 * @see models2016.impl.Models2016PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

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
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.SessionImpl
	 * @see models2016.impl.Models2016PackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Starting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__STARTING_TIME = 2;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ENDING_TIME = 3;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.EventImpl
	 * @see models2016.impl.Models2016PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__URL = 2;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CANCELLED = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.TalkSessionImpl <em>Talk Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.TalkSessionImpl
	 * @see models2016.impl.Models2016PackageImpl#getTalkSession()
	 * @generated
	 */
	int TALK_SESSION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Chair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__CHAIR = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Papers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION__PAPERS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Talk Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Talk Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_SESSION_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.PanelImpl
	 * @see models2016.impl.Models2016PackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Panelists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__PANELISTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moderators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__MODERATORS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.WorkshopImpl <em>Workshop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.WorkshopImpl
	 * @see models2016.impl.Models2016PackageImpl#getWorkshop()
	 * @generated
	 */
	int WORKSHOP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Organizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__ORGANIZERS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP__FULL_NAME = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workshop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workshop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHOP_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.TutorialImpl <em>Tutorial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.TutorialImpl
	 * @see models2016.impl.Models2016PackageImpl#getTutorial()
	 * @generated
	 */
	int TUTORIAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Organizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL__ORGANIZERS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tutorial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tutorial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUTORIAL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.DoctoralSymposiumImpl <em>Doctoral Symposium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.DoctoralSymposiumImpl
	 * @see models2016.impl.Models2016PackageImpl#getDoctoralSymposium()
	 * @generated
	 */
	int DOCTORAL_SYMPOSIUM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Organizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM__ORGANIZERS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Doctoral Symposium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Doctoral Symposium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTORAL_SYMPOSIUM_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.EducatorSymposiumImpl <em>Educator Symposium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.EducatorSymposiumImpl
	 * @see models2016.impl.Models2016PackageImpl#getEducatorSymposium()
	 * @generated
	 */
	int EDUCATOR_SYMPOSIUM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Organizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM__ORGANIZERS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Educator Symposium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Educator Symposium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATOR_SYMPOSIUM_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.ResourceImpl
	 * @see models2016.impl.Models2016PackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 10;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.RoomImpl
	 * @see models2016.impl.Models2016PackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.ReceptionImpl <em>Reception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.ReceptionImpl
	 * @see models2016.impl.Models2016PackageImpl#getReception()
	 * @generated
	 */
	int RECEPTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.ClinicImpl <em>Clinic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.ClinicImpl
	 * @see models2016.impl.Models2016PackageImpl#getClinic()
	 * @generated
	 */
	int CLINIC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Clinic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clinic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINIC_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.ConferenceImpl
	 * @see models2016.impl.Models2016PackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Papers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__PAPERS = 4;

	/**
	 * The feature id for the '<em><b>Talk Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__TALK_DURATION = 5;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__KINDS = 6;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.PersonImpl
	 * @see models2016.impl.Models2016PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOMEPAGE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.PaperImpl <em>Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.PaperImpl
	 * @see models2016.impl.Models2016PackageImpl#getPaper()
	 * @generated
	 */
	int PAPER = 16;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__AUTHORS = 0;

	/**
	 * The feature id for the '<em><b>Preprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PREPRINT = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__KIND = 4;

	/**
	 * The feature id for the '<em><b>Proceedings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PROCEEDINGS = 5;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__CANCELLED = 6;

	/**
	 * The number of structural features of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.LunchImpl <em>Lunch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.LunchImpl
	 * @see models2016.impl.Models2016PackageImpl#getLunch()
	 * @generated
	 */
	int LUNCH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Lunch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lunch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNCH_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.CoffeeBreakImpl <em>Coffee Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.CoffeeBreakImpl
	 * @see models2016.impl.Models2016PackageImpl#getCoffeeBreak()
	 * @generated
	 */
	int COFFEE_BREAK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Coffee Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coffee Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREAK_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.MeetingImpl <em>Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.MeetingImpl
	 * @see models2016.impl.Models2016PackageImpl#getMeeting()
	 * @generated
	 */
	int MEETING = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__PARTICIPANTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.SRCImpl <em>SRC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.SRCImpl
	 * @see models2016.impl.Models2016PackageImpl#getSRC()
	 * @generated
	 */
	int SRC = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>SRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.PosterImpl <em>Poster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.PosterImpl
	 * @see models2016.impl.Models2016PackageImpl#getPoster()
	 * @generated
	 */
	int POSTER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Poster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Poster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTER_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.KeynoteImpl <em>Keynote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.KeynoteImpl
	 * @see models2016.impl.Models2016PackageImpl#getKeynote()
	 * @generated
	 */
	int KEYNOTE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__CANCELLED = EVENT__CANCELLED;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__SPEAKER = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE__CHAIR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Keynote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Keynote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYNOTE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.KindImpl
	 * @see models2016.impl.Models2016PackageImpl#getKind()
	 * @generated
	 */
	int KIND = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.impl.SponsorKeynoteImpl <em>Sponsor Keynote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.SponsorKeynoteImpl
	 * @see models2016.impl.Models2016PackageImpl#getSponsorKeynote()
	 * @generated
	 */
	int SPONSOR_KEYNOTE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__NAME = KEYNOTE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__ABSTRACT = KEYNOTE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__URL = KEYNOTE__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__CANCELLED = KEYNOTE__CANCELLED;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__SPEAKER = KEYNOTE__SPEAKER;

	/**
	 * The feature id for the '<em><b>Chair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE__CHAIR = KEYNOTE__CHAIR;

	/**
	 * The number of structural features of the '<em>Sponsor Keynote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE_FEATURE_COUNT = KEYNOTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sponsor Keynote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSOR_KEYNOTE_OPERATION_COUNT = KEYNOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.OpeningImpl <em>Opening</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.OpeningImpl
	 * @see models2016.impl.Models2016PackageImpl#getOpening()
	 * @generated
	 */
	int OPENING = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__URL = EVENT__URL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__CANCELLED = EVENT__CANCELLED;

	/**
	 * The number of structural features of the '<em>Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models2016.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.impl.DateImpl
	 * @see models2016.impl.Models2016PackageImpl#getDate()
	 * @generated
	 */
	int DATE = 26;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 2;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__HOURS = 3;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MINUTES = 4;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models2016.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models2016.WeekDay
	 * @see models2016.impl.Models2016PackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 27;

	/**
	 * Returns the meta object for class '{@link models2016.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see models2016.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Day#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weekday</em>'.
	 * @see models2016.Day#getWeekday()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Weekday();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Day#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see models2016.Day#getDate()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Day#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see models2016.Day#getSessions()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Sessions();

	/**
	 * Returns the meta object for class '{@link models2016.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see models2016.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Program#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see models2016.Program#getDays()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Days();

	/**
	 * Returns the meta object for class '{@link models2016.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see models2016.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference list '{@link models2016.Session#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see models2016.Session#getEvents()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Events();

	/**
	 * Returns the meta object for the reference '{@link models2016.Session#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see models2016.Session#getRoom()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Room();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Session#getStartingTime <em>Starting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting Time</em>'.
	 * @see models2016.Session#getStartingTime()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_StartingTime();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Session#getEndingTime <em>Ending Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ending Time</em>'.
	 * @see models2016.Session#getEndingTime()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_EndingTime();

	/**
	 * Returns the meta object for class '{@link models2016.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see models2016.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Event#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see models2016.Event#getAbstract()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Event#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see models2016.Event#getUrl()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Url();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Event#isCancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelled</em>'.
	 * @see models2016.Event#isCancelled()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Cancelled();

	/**
	 * Returns the meta object for class '{@link models2016.TalkSession <em>Talk Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talk Session</em>'.
	 * @see models2016.TalkSession
	 * @generated
	 */
	EClass getTalkSession();

	/**
	 * Returns the meta object for the reference list '{@link models2016.TalkSession#getPapers <em>Papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Papers</em>'.
	 * @see models2016.TalkSession#getPapers()
	 * @see #getTalkSession()
	 * @generated
	 */
	EReference getTalkSession_Papers();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.TalkSession#getChair <em>Chair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chair</em>'.
	 * @see models2016.TalkSession#getChair()
	 * @see #getTalkSession()
	 * @generated
	 */
	EReference getTalkSession_Chair();

	/**
	 * Returns the meta object for class '{@link models2016.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see models2016.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Panel#getPanelists <em>Panelists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panelists</em>'.
	 * @see models2016.Panel#getPanelists()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Panelists();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Panel#getModerators <em>Moderators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moderators</em>'.
	 * @see models2016.Panel#getModerators()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Moderators();

	/**
	 * Returns the meta object for class '{@link models2016.Workshop <em>Workshop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workshop</em>'.
	 * @see models2016.Workshop
	 * @generated
	 */
	EClass getWorkshop();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Workshop#getOrganizers <em>Organizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizers</em>'.
	 * @see models2016.Workshop#getOrganizers()
	 * @see #getWorkshop()
	 * @generated
	 */
	EReference getWorkshop_Organizers();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Workshop#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see models2016.Workshop#getFullName()
	 * @see #getWorkshop()
	 * @generated
	 */
	EAttribute getWorkshop_FullName();

	/**
	 * Returns the meta object for class '{@link models2016.Tutorial <em>Tutorial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tutorial</em>'.
	 * @see models2016.Tutorial
	 * @generated
	 */
	EClass getTutorial();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Tutorial#getOrganizers <em>Organizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizers</em>'.
	 * @see models2016.Tutorial#getOrganizers()
	 * @see #getTutorial()
	 * @generated
	 */
	EReference getTutorial_Organizers();

	/**
	 * Returns the meta object for class '{@link models2016.DoctoralSymposium <em>Doctoral Symposium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctoral Symposium</em>'.
	 * @see models2016.DoctoralSymposium
	 * @generated
	 */
	EClass getDoctoralSymposium();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.DoctoralSymposium#getOrganizers <em>Organizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizers</em>'.
	 * @see models2016.DoctoralSymposium#getOrganizers()
	 * @see #getDoctoralSymposium()
	 * @generated
	 */
	EReference getDoctoralSymposium_Organizers();

	/**
	 * Returns the meta object for class '{@link models2016.EducatorSymposium <em>Educator Symposium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Educator Symposium</em>'.
	 * @see models2016.EducatorSymposium
	 * @generated
	 */
	EClass getEducatorSymposium();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.EducatorSymposium#getOrganizers <em>Organizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizers</em>'.
	 * @see models2016.EducatorSymposium#getOrganizers()
	 * @see #getEducatorSymposium()
	 * @generated
	 */
	EReference getEducatorSymposium_Organizers();

	/**
	 * Returns the meta object for class '{@link models2016.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see models2016.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link models2016.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see models2016.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see models2016.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for class '{@link models2016.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reception</em>'.
	 * @see models2016.Reception
	 * @generated
	 */
	EClass getReception();

	/**
	 * Returns the meta object for class '{@link models2016.Clinic <em>Clinic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinic</em>'.
	 * @see models2016.Clinic
	 * @generated
	 */
	EClass getClinic();

	/**
	 * Returns the meta object for class '{@link models2016.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see models2016.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Conference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Conference#getName()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Conference#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see models2016.Conference#getResources()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Conference#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see models2016.Conference#getProgram()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Conference#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see models2016.Conference#getEvents()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Conference#getPapers <em>Papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Papers</em>'.
	 * @see models2016.Conference#getPapers()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Papers();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Conference#getTalkDuration <em>Talk Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Talk Duration</em>'.
	 * @see models2016.Conference#getTalkDuration()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_TalkDuration();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Conference#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinds</em>'.
	 * @see models2016.Conference#getKinds()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Kinds();

	/**
	 * Returns the meta object for class '{@link models2016.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see models2016.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see models2016.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Person#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homepage</em>'.
	 * @see models2016.Person#getHomepage()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Homepage();

	/**
	 * Returns the meta object for class '{@link models2016.Paper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper</em>'.
	 * @see models2016.Paper
	 * @generated
	 */
	EClass getPaper();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Paper#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see models2016.Paper#getAuthors()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Authors();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Paper#getPreprint <em>Preprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preprint</em>'.
	 * @see models2016.Paper#getPreprint()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Preprint();

	/**
	 * Returns the meta object for the reference '{@link models2016.Paper#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see models2016.Paper#getKind()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Kind();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Paper#getProceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings</em>'.
	 * @see models2016.Paper#getProceedings()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Proceedings();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Paper#isCancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelled</em>'.
	 * @see models2016.Paper#isCancelled()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Cancelled();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Paper#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see models2016.Paper#getAbstract()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Paper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Paper#getName()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Name();

	/**
	 * Returns the meta object for class '{@link models2016.Lunch <em>Lunch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lunch</em>'.
	 * @see models2016.Lunch
	 * @generated
	 */
	EClass getLunch();

	/**
	 * Returns the meta object for class '{@link models2016.CoffeeBreak <em>Coffee Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Break</em>'.
	 * @see models2016.CoffeeBreak
	 * @generated
	 */
	EClass getCoffeeBreak();

	/**
	 * Returns the meta object for class '{@link models2016.Meeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting</em>'.
	 * @see models2016.Meeting
	 * @generated
	 */
	EClass getMeeting();

	/**
	 * Returns the meta object for the containment reference list '{@link models2016.Meeting#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see models2016.Meeting#getParticipants()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Participants();

	/**
	 * Returns the meta object for class '{@link models2016.SRC <em>SRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRC</em>'.
	 * @see models2016.SRC
	 * @generated
	 */
	EClass getSRC();

	/**
	 * Returns the meta object for class '{@link models2016.Poster <em>Poster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poster</em>'.
	 * @see models2016.Poster
	 * @generated
	 */
	EClass getPoster();

	/**
	 * Returns the meta object for class '{@link models2016.Keynote <em>Keynote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keynote</em>'.
	 * @see models2016.Keynote
	 * @generated
	 */
	EClass getKeynote();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Keynote#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker</em>'.
	 * @see models2016.Keynote#getSpeaker()
	 * @see #getKeynote()
	 * @generated
	 */
	EReference getKeynote_Speaker();

	/**
	 * Returns the meta object for the containment reference '{@link models2016.Keynote#getChair <em>Chair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chair</em>'.
	 * @see models2016.Keynote#getChair()
	 * @see #getKeynote()
	 * @generated
	 */
	EReference getKeynote_Chair();

	/**
	 * Returns the meta object for class '{@link models2016.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see models2016.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Kind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see models2016.Kind#getName()
	 * @see #getKind()
	 * @generated
	 */
	EAttribute getKind_Name();

	/**
	 * Returns the meta object for class '{@link models2016.SponsorKeynote <em>Sponsor Keynote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sponsor Keynote</em>'.
	 * @see models2016.SponsorKeynote
	 * @generated
	 */
	EClass getSponsorKeynote();

	/**
	 * Returns the meta object for class '{@link models2016.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening</em>'.
	 * @see models2016.Opening
	 * @generated
	 */
	EClass getOpening();

	/**
	 * Returns the meta object for class '{@link models2016.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see models2016.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see models2016.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see models2016.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see models2016.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Date#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see models2016.Date#getHours()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Hours();

	/**
	 * Returns the meta object for the attribute '{@link models2016.Date#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see models2016.Date#getMinutes()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Minutes();

	/**
	 * Returns the meta object for enum '{@link models2016.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see models2016.WeekDay
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
	Models2016Factory getModels2016Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link models2016.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.DayImpl
		 * @see models2016.impl.Models2016PackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '<em><b>Weekday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__WEEKDAY = eINSTANCE.getDay_Weekday();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__DATE = eINSTANCE.getDay_Date();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__SESSIONS = eINSTANCE.getDay_Sessions();

		/**
		 * The meta object literal for the '{@link models2016.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.ProgramImpl
		 * @see models2016.impl.Models2016PackageImpl#getProgram()
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
		 * The meta object literal for the '{@link models2016.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.SessionImpl
		 * @see models2016.impl.Models2016PackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__EVENTS = eINSTANCE.getSession_Events();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ROOM = eINSTANCE.getSession_Room();

		/**
		 * The meta object literal for the '<em><b>Starting Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__STARTING_TIME = eINSTANCE.getSession_StartingTime();

		/**
		 * The meta object literal for the '<em><b>Ending Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ENDING_TIME = eINSTANCE.getSession_EndingTime();

		/**
		 * The meta object literal for the '{@link models2016.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.EventImpl
		 * @see models2016.impl.Models2016PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ABSTRACT = eINSTANCE.getEvent_Abstract();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__URL = eINSTANCE.getEvent_Url();

		/**
		 * The meta object literal for the '<em><b>Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CANCELLED = eINSTANCE.getEvent_Cancelled();

		/**
		 * The meta object literal for the '{@link models2016.impl.TalkSessionImpl <em>Talk Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.TalkSessionImpl
		 * @see models2016.impl.Models2016PackageImpl#getTalkSession()
		 * @generated
		 */
		EClass TALK_SESSION = eINSTANCE.getTalkSession();

		/**
		 * The meta object literal for the '<em><b>Papers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK_SESSION__PAPERS = eINSTANCE.getTalkSession_Papers();

		/**
		 * The meta object literal for the '<em><b>Chair</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK_SESSION__CHAIR = eINSTANCE.getTalkSession_Chair();

		/**
		 * The meta object literal for the '{@link models2016.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.PanelImpl
		 * @see models2016.impl.Models2016PackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Panelists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__PANELISTS = eINSTANCE.getPanel_Panelists();

		/**
		 * The meta object literal for the '<em><b>Moderators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__MODERATORS = eINSTANCE.getPanel_Moderators();

		/**
		 * The meta object literal for the '{@link models2016.impl.WorkshopImpl <em>Workshop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.WorkshopImpl
		 * @see models2016.impl.Models2016PackageImpl#getWorkshop()
		 * @generated
		 */
		EClass WORKSHOP = eINSTANCE.getWorkshop();

		/**
		 * The meta object literal for the '<em><b>Organizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSHOP__ORGANIZERS = eINSTANCE.getWorkshop_Organizers();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSHOP__FULL_NAME = eINSTANCE.getWorkshop_FullName();

		/**
		 * The meta object literal for the '{@link models2016.impl.TutorialImpl <em>Tutorial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.TutorialImpl
		 * @see models2016.impl.Models2016PackageImpl#getTutorial()
		 * @generated
		 */
		EClass TUTORIAL = eINSTANCE.getTutorial();

		/**
		 * The meta object literal for the '<em><b>Organizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUTORIAL__ORGANIZERS = eINSTANCE.getTutorial_Organizers();

		/**
		 * The meta object literal for the '{@link models2016.impl.DoctoralSymposiumImpl <em>Doctoral Symposium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.DoctoralSymposiumImpl
		 * @see models2016.impl.Models2016PackageImpl#getDoctoralSymposium()
		 * @generated
		 */
		EClass DOCTORAL_SYMPOSIUM = eINSTANCE.getDoctoralSymposium();

		/**
		 * The meta object literal for the '<em><b>Organizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTORAL_SYMPOSIUM__ORGANIZERS = eINSTANCE.getDoctoralSymposium_Organizers();

		/**
		 * The meta object literal for the '{@link models2016.impl.EducatorSymposiumImpl <em>Educator Symposium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.EducatorSymposiumImpl
		 * @see models2016.impl.Models2016PackageImpl#getEducatorSymposium()
		 * @generated
		 */
		EClass EDUCATOR_SYMPOSIUM = eINSTANCE.getEducatorSymposium();

		/**
		 * The meta object literal for the '<em><b>Organizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATOR_SYMPOSIUM__ORGANIZERS = eINSTANCE.getEducatorSymposium_Organizers();

		/**
		 * The meta object literal for the '{@link models2016.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.ResourceImpl
		 * @see models2016.impl.Models2016PackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link models2016.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.RoomImpl
		 * @see models2016.impl.Models2016PackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '{@link models2016.impl.ReceptionImpl <em>Reception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.ReceptionImpl
		 * @see models2016.impl.Models2016PackageImpl#getReception()
		 * @generated
		 */
		EClass RECEPTION = eINSTANCE.getReception();

		/**
		 * The meta object literal for the '{@link models2016.impl.ClinicImpl <em>Clinic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.ClinicImpl
		 * @see models2016.impl.Models2016PackageImpl#getClinic()
		 * @generated
		 */
		EClass CLINIC = eINSTANCE.getClinic();

		/**
		 * The meta object literal for the '{@link models2016.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.ConferenceImpl
		 * @see models2016.impl.Models2016PackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__NAME = eINSTANCE.getConference_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__RESOURCES = eINSTANCE.getConference_Resources();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__PROGRAM = eINSTANCE.getConference_Program();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__EVENTS = eINSTANCE.getConference_Events();

		/**
		 * The meta object literal for the '<em><b>Papers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__PAPERS = eINSTANCE.getConference_Papers();

		/**
		 * The meta object literal for the '<em><b>Talk Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__TALK_DURATION = eINSTANCE.getConference_TalkDuration();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__KINDS = eINSTANCE.getConference_Kinds();

		/**
		 * The meta object literal for the '{@link models2016.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.PersonImpl
		 * @see models2016.impl.Models2016PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HOMEPAGE = eINSTANCE.getPerson_Homepage();

		/**
		 * The meta object literal for the '{@link models2016.impl.PaperImpl <em>Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.PaperImpl
		 * @see models2016.impl.Models2016PackageImpl#getPaper()
		 * @generated
		 */
		EClass PAPER = eINSTANCE.getPaper();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__AUTHORS = eINSTANCE.getPaper_Authors();

		/**
		 * The meta object literal for the '<em><b>Preprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__PREPRINT = eINSTANCE.getPaper_Preprint();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__KIND = eINSTANCE.getPaper_Kind();

		/**
		 * The meta object literal for the '<em><b>Proceedings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__PROCEEDINGS = eINSTANCE.getPaper_Proceedings();

		/**
		 * The meta object literal for the '<em><b>Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__CANCELLED = eINSTANCE.getPaper_Cancelled();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__ABSTRACT = eINSTANCE.getPaper_Abstract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__NAME = eINSTANCE.getPaper_Name();

		/**
		 * The meta object literal for the '{@link models2016.impl.LunchImpl <em>Lunch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.LunchImpl
		 * @see models2016.impl.Models2016PackageImpl#getLunch()
		 * @generated
		 */
		EClass LUNCH = eINSTANCE.getLunch();

		/**
		 * The meta object literal for the '{@link models2016.impl.CoffeeBreakImpl <em>Coffee Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.CoffeeBreakImpl
		 * @see models2016.impl.Models2016PackageImpl#getCoffeeBreak()
		 * @generated
		 */
		EClass COFFEE_BREAK = eINSTANCE.getCoffeeBreak();

		/**
		 * The meta object literal for the '{@link models2016.impl.MeetingImpl <em>Meeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.MeetingImpl
		 * @see models2016.impl.Models2016PackageImpl#getMeeting()
		 * @generated
		 */
		EClass MEETING = eINSTANCE.getMeeting();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__PARTICIPANTS = eINSTANCE.getMeeting_Participants();

		/**
		 * The meta object literal for the '{@link models2016.impl.SRCImpl <em>SRC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.SRCImpl
		 * @see models2016.impl.Models2016PackageImpl#getSRC()
		 * @generated
		 */
		EClass SRC = eINSTANCE.getSRC();

		/**
		 * The meta object literal for the '{@link models2016.impl.PosterImpl <em>Poster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.PosterImpl
		 * @see models2016.impl.Models2016PackageImpl#getPoster()
		 * @generated
		 */
		EClass POSTER = eINSTANCE.getPoster();

		/**
		 * The meta object literal for the '{@link models2016.impl.KeynoteImpl <em>Keynote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.KeynoteImpl
		 * @see models2016.impl.Models2016PackageImpl#getKeynote()
		 * @generated
		 */
		EClass KEYNOTE = eINSTANCE.getKeynote();

		/**
		 * The meta object literal for the '<em><b>Speaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYNOTE__SPEAKER = eINSTANCE.getKeynote_Speaker();

		/**
		 * The meta object literal for the '<em><b>Chair</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYNOTE__CHAIR = eINSTANCE.getKeynote_Chair();

		/**
		 * The meta object literal for the '{@link models2016.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.KindImpl
		 * @see models2016.impl.Models2016PackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND__NAME = eINSTANCE.getKind_Name();

		/**
		 * The meta object literal for the '{@link models2016.impl.SponsorKeynoteImpl <em>Sponsor Keynote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.SponsorKeynoteImpl
		 * @see models2016.impl.Models2016PackageImpl#getSponsorKeynote()
		 * @generated
		 */
		EClass SPONSOR_KEYNOTE = eINSTANCE.getSponsorKeynote();

		/**
		 * The meta object literal for the '{@link models2016.impl.OpeningImpl <em>Opening</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.OpeningImpl
		 * @see models2016.impl.Models2016PackageImpl#getOpening()
		 * @generated
		 */
		EClass OPENING = eINSTANCE.getOpening();

		/**
		 * The meta object literal for the '{@link models2016.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.impl.DateImpl
		 * @see models2016.impl.Models2016PackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__HOURS = eINSTANCE.getDate_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MINUTES = eINSTANCE.getDate_Minutes();

		/**
		 * The meta object literal for the '{@link models2016.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models2016.WeekDay
		 * @see models2016.impl.Models2016PackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

	}

} //Models2016Package
