package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaUpdateCliente  extends JFrame{
	private static VentanaUpdateCliente uniqueInstance;
	
	public static VentanaUpdateCliente getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaUpdateClienteImp();
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
