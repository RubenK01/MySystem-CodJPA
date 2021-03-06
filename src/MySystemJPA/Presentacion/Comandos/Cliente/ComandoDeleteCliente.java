/**
 * 
 */
package MySystemJPA.Presentacion.Comandos.Cliente;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.Cliente.SACliente;
import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ComandoDeleteCliente implements Comando {

	@Override
	public Contexto execute(Object data) throws ExcepcionNegocio {
		SACliente sa = FactoriaSA.getInstance().createSACliente();
		Cliente t = (Cliente)data;
		Boolean s = sa.deleteCliente(t);
		Contexto responseContext = null;
		if(s){
			responseContext = new Contexto(EventoNegocio.DELETE_CLIENTE_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.DELETE_CLIENTE_FRACASO, null);
		}
		return responseContext;
	}
	
}