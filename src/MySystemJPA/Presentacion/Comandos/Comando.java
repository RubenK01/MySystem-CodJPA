/**
 * 
 */
package MySystemJPA.Presentacion.Comandos;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Presentacion.Controlador.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface Comando {
	
	public Contexto execute(Object data) throws ExcepcionNegocio;
}