/**
 * 
 */
package MySystemJPA.Presentacion.Comandos.Cliente;

import java.util.ArrayList;

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
public class ComandoReadAllCliente implements Comando {

	@Override
	public Contexto execute(Object data) {
		SACliente sa = FactoriaSA.getInstance().createSACliente();
		Cliente t = (Cliente)data;
		ArrayList<Cliente> rs = sa.readAllCliente();
		Contexto responseContext = null;
		if(rs.size() > 0){
			responseContext = new Contexto(EventoNegocio.READALL_CLIENTE_EXITO, rs);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READALL_CLIENTE_EXITO, null);
		}
		return responseContext;
	}
	
}