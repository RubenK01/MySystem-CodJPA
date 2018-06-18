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
public class ComandoReadCliente implements Comando {



	@Override
	public Contexto execute(Object data) {
		SACliente sa = FactoriaSA.getInstance().createSACliente();
		Cliente t = (Cliente)data;
		Cliente rs = sa.readCliente(t);
		Contexto responseContext = null;
		if(rs != null){
			responseContext = new Contexto(EventoNegocio.READ_CLIENTE_EXITO, rs);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_CLIENTE_FRACASO, null);
		}
		return responseContext;
	}}