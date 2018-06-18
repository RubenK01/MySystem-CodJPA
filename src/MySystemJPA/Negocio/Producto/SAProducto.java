/**
 * 
 */
package MySystemJPA.Negocio.Producto;

import java.util.ArrayList;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAProducto {

	public int createProducto(Producto prod) throws ExcepcionNegocio;

	public Producto readProducto(Producto prod);

	public boolean updateProducto(Producto prod) throws ExcepcionNegocio;

	public boolean deleteProducto(Producto prod);

	public ArrayList<Producto> readAllProductos();
	public ArrayList<Producto> readProductosByCliente(Producto prod);

}