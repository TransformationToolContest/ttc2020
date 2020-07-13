/**
 */
package scenario2_v2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario2_v2.Person#getName <em>Name</em>}</li>
 *   <li>{@link scenario2_v2.Person#getYbirth <em>Ybirth</em>}</li>
 * </ul>
 *
 * @see scenario2_v2.Scenario2_v2Package#getPerson()
 * @model kind="class"
 * @generated
 */
public class Person extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYbirth() <em>Ybirth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYbirth()
	 * @generated
	 * @ordered
	 */
	protected static final int YBIRTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYbirth() <em>Ybirth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYbirth()
	 * @generated
	 * @ordered
	 */
	protected int ybirth = YBIRTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenario2_v2Package.Literals.PERSON;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scenario2_v2.Scenario2_v2Package#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link scenario2_v2.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenario2_v2Package.PERSON__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Ybirth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ybirth</em>' attribute.
	 * @see #setYbirth(int)
	 * @see scenario2_v2.Scenario2_v2Package#getPerson_Ybirth()
	 * @model required="true"
	 * @generated
	 */
	public int getYbirth() {
		return ybirth;
	}

	/**
	 * Sets the value of the '{@link scenario2_v2.Person#getYbirth <em>Ybirth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ybirth</em>' attribute.
	 * @see #getYbirth()
	 * @generated
	 */
	public void setYbirth(int newYbirth) {
		int oldYbirth = ybirth;
		ybirth = newYbirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenario2_v2Package.PERSON__YBIRTH, oldYbirth, ybirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Scenario2_v2Package.PERSON__NAME:
				return getName();
			case Scenario2_v2Package.PERSON__YBIRTH:
				return getYbirth();
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
			case Scenario2_v2Package.PERSON__NAME:
				setName((String)newValue);
				return;
			case Scenario2_v2Package.PERSON__YBIRTH:
				setYbirth((Integer)newValue);
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
			case Scenario2_v2Package.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Scenario2_v2Package.PERSON__YBIRTH:
				setYbirth(YBIRTH_EDEFAULT);
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
			case Scenario2_v2Package.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Scenario2_v2Package.PERSON__YBIRTH:
				return ybirth != YBIRTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ybirth: ");
		result.append(ybirth);
		result.append(')');
		return result.toString();
	}

} // Person
