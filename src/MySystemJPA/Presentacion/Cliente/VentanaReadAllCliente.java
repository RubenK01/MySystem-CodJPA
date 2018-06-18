package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaReadAllCliente  extends JFrame{
	private static VentanaReadAllCliente uniqueInstance;
	
	public static VentanaReadAllCliente getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaReadAllClienteImp();
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
