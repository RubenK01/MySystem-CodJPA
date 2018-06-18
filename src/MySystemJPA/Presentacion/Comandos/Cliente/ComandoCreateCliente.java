/**
 * 
 */
package MySystemJPA.Presentacion.Comandos.Cliente;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.Cliente.SACliente;
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
public class ComandoCreateCliente implements Comando {
	
	@Override
	public Contexto execute(Object data) {
		SACliente sa = FactoriaSA.getInstance().createSACliente();
		Cliente t = (Cliente)data;
		int s = sa.createCliente(t);
		Contexto responseContext = null;
		if(s != -1){
			responseContext = new Contexto(EventoNegocio.ALTA_CLIENTE_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.ALTA_CLIENTE_FRACASO, null);
		}
		return responseContext;
	}
}