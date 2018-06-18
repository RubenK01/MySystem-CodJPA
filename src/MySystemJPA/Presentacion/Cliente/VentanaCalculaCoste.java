package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaCalculaCoste  extends JFrame {
	private static VentanaCalculaCoste uniqueInstance;
	
	public static VentanaCalculaCoste getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaCalculaCosteImp();
		return uniqueInstance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void update(Object datos);
	public abstract Component initGUI();
}
