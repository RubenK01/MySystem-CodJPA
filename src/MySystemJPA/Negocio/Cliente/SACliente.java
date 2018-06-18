/**
 * 
 */
package MySystemJPA.Negocio.Cliente;

import java.util.ArrayList;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SACliente {
	
	public int createCliente(Cliente cl);

	public Cliente readCliente(Cliente cl);

	public Boolean updateCliente(Cliente cl) throws ExcepcionNegocio;

	public Boolean deleteCliente(Cliente cl) throws ExcepcionNegocio;

	public ArrayList<Cliente> readAllCliente();

	public double calculaCoste(Cliente cl);
}