/**
 * 
 */
package MySystemJPA.Negocio.FactoriaSA;

import MySystemJPA.Negocio.Cliente.SACliente;
import MySystemJPA.Negocio.Producto.SAProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaSA {

	private static FactoriaSA instance;

	public static FactoriaSA getInstance() {
		// begin-user-code
		if (instance == null)
			instance = new FactoriaSAImp();
		return instance;
		// end-user-code
	}

	public abstract SACliente createSACliente();

	public abstract SAProducto createSAProducto();
}