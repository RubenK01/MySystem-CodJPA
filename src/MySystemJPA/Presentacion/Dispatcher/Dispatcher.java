/**
 * 
 */
package MySystemJPA.Presentacion.Dispatcher;

import MySystemJPA.Presentacion.Controlador.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Dispatcher {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static Dispatcher instance;

	public static Dispatcher getInstance() {
		// begin-user-code
		if (instance == null)
			instance = new DispatcherImp();
		return instance;
		// end-user-code
	}

	public abstract void dispatch(Contexto responseContext);
}