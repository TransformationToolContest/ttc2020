/**
 */
package scenario4_v2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario4_v2.Container#getPerson <em>Person</em>}</li>
 *   <li>{@link scenario4_v2.Container#getDog <em>Dog</em>}</li>
 * </ul>
 *
 * @see scenario4_v2.Scenario4_v2Package#getContainer()
 * @model kind="class"
 * @generated
 */
public class Container extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getDog() <em>Dog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDog()
	 * @generated
	 * @ordered
	 */
	protected Dog dog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenario4_v2Package.Literals.CONTAINER;
	}

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see scenario4_v2.Scenario4_v2Package#getContainer_Person()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenario4_v2Package.CONTAINER__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link scenario4_v2.Container#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = person.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenario4_v2Package.CONTAINER__PERSON, null, msgs);
			if (newPerson != null)
				msgs = newPerson.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenario4_v2Package.CONTAINER__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenario4_v2Package.CONTAINER__PERSON, newPerson, newPerson));
	}

	/**
	 * Returns the value of the '<em><b>Dog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dog</em>' containment reference.
	 * @see #setDog(Dog)
	 * @see scenario4_v2.Scenario4_v2Package#getContainer_Dog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Dog getDog() {
		return dog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDog(Dog newDog, NotificationChain msgs) {
		Dog oldDog = dog;
		dog = newDog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenario4_v2Package.CONTAINER__DOG, oldDog, newDog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link scenario4_v2.Container#getDog <em>Dog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dog</em>' containment reference.
	 * @see #getDog()
	 * @generated
	 */
	public void setDog(Dog newDog) {
		if (newDog != dog) {
			NotificationChain msgs = null;
			if (dog != null)
				msgs = dog.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenario4_v2Package.CONTAINER__DOG, null, msgs);
			if (newDog != null)
				msgs = newDog.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenario4_v2Package.CONTAINER__DOG, null, msgs);
			msgs = basicSetDog(newDog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenario4_v2Package.CONTAINER__DOG, newDog, newDog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenario4_v2Package.CONTAINER__PERSON:
				return basicSetPerson(null, msgs);
			case Scenario4_v2Package.CONTAINER__DOG:
				return basicSetDog(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Scenario4_v2Package.CONTAINER__PERSON:
				return getPerson();
			case Scenario4_v2Package.CONTAINER__DOG:
				return getDog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Scenario4_v2Package.CONTAINER__PERSON:
				setPerson((Person)newValue);
				return;
			case Scenario4_v2Package.CONTAINER__DOG:
				setDog((Dog)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Scenario4_v2Package.CONTAINER__PERSON:
				setPerson((Person)null);
				return;
			case Scenario4_v2Package.CONTAINER__DOG:
				setDog((Dog)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Scenario4_v2Package.CONTAINER__PERSON:
				return person != null;
			case Scenario4_v2Package.CONTAINER__DOG:
				return dog != null;
		}
		return super.eIsSet(featureID);
	}

} // Container
