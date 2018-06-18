package MySystemJPA.Presentacion.Producto;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaUpdateProducto extends JFrame {
	
	private static VentanaUpdateProducto uniqueInstance;
	
	public static VentanaUpdateProducto getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaUpdateProductoImp();
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
