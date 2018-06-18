/**
 * 
 */
package MySystemJPA.Negocio.FactoriaSA;

import MySystemJPA.Negocio.Cliente.SACliente;
import MySystemJPA.Negocio.Cliente.SAClienteImp;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Negocio.Producto.SAProductoImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaSAImp extends FactoriaSA {
	
	@Override
	public SACliente createSACliente() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return new SAClienteImp();
		// end-user-code
	}

	@Override
	public SAProducto createSAProducto() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return new SAProductoImp();
		// end-user-code
	}
}