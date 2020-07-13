/**
 */
package scenario4_v2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import scenario2_v2.Scenario2_v2Package;

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
 * @see scenario4_v2.Scenario4_v2Factory
 * @model kind="package"
 * @generated
 */
public class Scenario4_v2Package extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "scenario4_v2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://ttc2020/scenario4/model/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "scenario4_v2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Scenario4_v2Package eINSTANCE = scenario4_v2.Scenario4_v2Package.init();

	/**
	 * The meta object id for the '{@link scenario4_v2.Person <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario4_v2.Person
	 * @see scenario4_v2.Scenario4_v2Package#getPerson()
	 * @generated
	 */
	public static final int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON__NAME = Scenario2_v2Package.PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Ybirth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON__YBIRTH = Scenario2_v2Package.PERSON__YBIRTH;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_FEATURE_COUNT = Scenario2_v2Package.PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_OPERATION_COUNT = Scenario2_v2Package.PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenario4_v2.Dog <em>Dog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario4_v2.Dog
	 * @see scenario4_v2.Scenario4_v2Package#getDog()
	 * @generated
	 */
	public static final int DOG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOG__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Dog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario4_v2.Container <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario4_v2.Container
	 * @see scenario4_v2.Scenario4_v2Package#getContainer()
	 * @generated
	 */
	public static final int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__PERSON = 0;

	/**
	 * The feature id for the '<em><b>Dog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__DOG = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see scenario4_v2.Scenario4_v2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Scenario4_v2Package() {
		super(eNS_URI, Scenario4_v2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Scenario4_v2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Scenario4_v2Package init() {
		if (isInited) return (Scenario4_v2Package)EPackage.Registry.INSTANCE.getEPackage(Scenario4_v2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredScenario4_v2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Scenario4_v2Package theScenario4_v2Package = registeredScenario4_v2Package instanceof Scenario4_v2Package ? (Scenario4_v2Package)registeredScenario4_v2Package : new Scenario4_v2Package();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Scenario2_v2Package.eNS_URI);
		Scenario2_v2Package theScenario2_v2Package = (Scenario2_v2Package)(registeredPackage instanceof Scenario2_v2Package ? registeredPackage : Scenario2_v2Package.eINSTANCE);

		// Create package meta-data objects
		theScenario4_v2Package.createPackageContents();
		theScenario2_v2Package.createPackageContents();

		// Initialize created meta-data
		theScenario4_v2Package.initializePackageContents();
		theScenario2_v2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenario4_v2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Scenario4_v2Package.eNS_URI, theScenario4_v2Package);
		return theScenario4_v2Package;
	}


	/**
	 * Returns the meta object for class '{@link scenario4_v2.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see scenario4_v2.Person
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * Returns the meta object for class '{@link scenario4_v2.Dog <em>Dog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dog</em>'.
	 * @see scenario4_v2.Dog
	 * @generated
	 */
	public EClass getDog() {
		return dogEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link scenario4_v2.Dog#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenario4_v2.Dog#getName()
	 * @see #getDog()
	 * @generated
	 */
	public EAttribute getDog_Name() {
		return (EAttribute)dogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link scenario4_v2.Dog#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see scenario4_v2.Dog#getOwner()
	 * @see #getDog()
	 * @generated
	 */
	public EReference getDog_Owner() {
		return (EReference)dogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link scenario4_v2.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see scenario4_v2.Container
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link scenario4_v2.Container#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see scenario4_v2.Container#getPerson()
	 * @see #getContainer()
	 * @generated
	 */
	public EReference getContainer_Person() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link scenario4_v2.Container#getDog <em>Dog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dog</em>'.
	 * @see scenario4_v2.Container#getDog()
	 * @see #getContainer()
	 * @generated
	 */
	public EReference getContainer_Dog() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public Scenario4_v2Factory getScenario4_v2Factory() {
		return (Scenario4_v2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);

		dogEClass = createEClass(DOG);
		createEAttribute(dogEClass, DOG__NAME);
		createEReference(dogEClass, DOG__OWNER);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__PERSON);
		createEReference(containerEClass, CONTAINER__DOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Scenario2_v2Package theScenario2_v2Package = (Scenario2_v2Package)EPackage.Registry.INSTANCE.getEPackage(Scenario2_v2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(theScenario2_v2Package.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dogEClass, Dog.class, "Dog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDog_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDog_Owner(), this.getPerson(), null, "owner", null, 1, 1, Dog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, scenario4_v2.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Person(), this.getPerson(), null, "person", null, 1, 1, scenario4_v2.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Dog(), this.getDog(), null, "dog", null, 1, 1, scenario4_v2.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link scenario4_v2.Person <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario4_v2.Person
		 * @see scenario4_v2.Scenario4_v2Package#getPerson()
		 * @generated
		 */
		public static final EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link scenario4_v2.Dog <em>Dog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario4_v2.Dog
		 * @see scenario4_v2.Scenario4_v2Package#getDog()
		 * @generated
		 */
		public static final EClass DOG = eINSTANCE.getDog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOG__NAME = eINSTANCE.getDog_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOG__OWNER = eINSTANCE.getDog_Owner();

		/**
		 * The meta object literal for the '{@link scenario4_v2.Container <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario4_v2.Container
		 * @see scenario4_v2.Scenario4_v2Package#getContainer()
		 * @generated
		 */
		public static final EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTAINER__PERSON = eINSTANCE.getContainer_Person();

		/**
		 * The meta object literal for the '<em><b>Dog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTAINER__DOG = eINSTANCE.getContainer_Dog();

	}

} //Scenario4_v2Package
