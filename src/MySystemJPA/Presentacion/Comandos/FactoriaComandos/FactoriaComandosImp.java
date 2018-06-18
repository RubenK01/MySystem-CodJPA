/**
 * 
 */
package MySystemJPA.Presentacion.Comandos.FactoriaComandos;

import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoCalculaCoste;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoCreateCliente;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoDeleteCliente;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoReadAllCliente;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoReadCliente;
import MySystemJPA.Presentacion.Comandos.Cliente.ComandoUpdateCliente;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoCreateProducto;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoDeleteProducto;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoProductosByCliente;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoReadAllProducto;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoReadProducto;
import MySystemJPA.Presentacion.Comandos.Producto.ComandoUpdateProducto;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaComandosImp extends FactoriaComandos {

	@Override
	public Comando creaComando(Contexto request) {
		int evento = request.getEvento();
		Comando command = null;
		switch(evento) {
			//Clientes
			case EventoGUI.COMANDO_CREATE_CLIENTE:{
				command = new ComandoCreateCliente();
				break;
			}
			case EventoGUI.COMANDO_DELETE_CLIENTE:{
				command = new ComandoDeleteCliente();
				break;
			}
			case EventoGUI.COMANDO_READ_CLIENTE:{
				command = new ComandoReadCliente();
				break;
			}
			case EventoGUI.COMANDO_READALL_CLIENTE:{
				command = new ComandoReadAllCliente();
				break;
			}
			case EventoGUI.COMANDO_UPDATE_CLIENTE:{
				command = new ComandoUpdateCliente();
				break;
			}
			//Productos
			case EventoGUI.COMANDO_CREATE_PRODUCTO:{
				command = new ComandoCreateProducto();
				break;
			}
			case EventoGUI.COMANDO_DELETE_PRODUCTO:{
				command = new ComandoDeleteProducto();
				break;
			}
			case EventoGUI.COMANDO_READ_PRODUCTO:{
				command = new ComandoReadProducto();
				break;
			}
			case EventoGUI.COMANDO_READALL_PRODUCTO:{
				command = new ComandoReadAllProducto();
				break;
			}
			case EventoGUI.COMANDO_UPDATE_PRODUCTO:{
				command = new ComandoUpdateProducto();
				break;
			}
			case EventoGUI.CALCULA_COSTE:{
				command = new ComandoCalculaCoste();
				break;
			}
			case EventoGUI.COMANDO_PROD_BY_CLIENTE:{
				command = new ComandoProductosByCliente();
				break;
			}
//			case EventoGUI.COMANDO_READ_ProductoS_TRES_ClienteS:{
//				command = new ComandoProductosTresClientes();
//				break;
//			}
		}
		return command;
	}
}