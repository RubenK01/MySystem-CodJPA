/**
 * 
 */
package MySystemJPA.Presentacion.Dispatcher;

import MySystemJPA.Presentacion.Cliente.VentanaCalculaCoste;
import MySystemJPA.Presentacion.Cliente.VentanaCreateCliente;
import MySystemJPA.Presentacion.Cliente.VentanaDeleteCliente;
import MySystemJPA.Presentacion.Cliente.VentanaReadAllCliente;
import MySystemJPA.Presentacion.Cliente.VentanaReadCliente;
import MySystemJPA.Presentacion.Cliente.VentanaUpdateCliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;
import MySystemJPA.Presentacion.Producto.VentanaCreateProducto;
import MySystemJPA.Presentacion.Producto.VentanaDeleteProducto;
import MySystemJPA.Presentacion.Producto.VentanaProductosByCliente;
import MySystemJPA.Presentacion.Producto.VentanaReadAllProducto;
import MySystemJPA.Presentacion.Producto.VentanaReadProducto;
import MySystemJPA.Presentacion.Producto.VentanaUpdateProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DispatcherImp extends Dispatcher {

	@Override
	public void dispatch(Contexto responseContext) {
		int evento = responseContext.getEvento();
		switch (evento) {
			case EventoNegocio.ALTA_CLIENTE_EXITO:{
				VentanaCreateCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_CLIENTE_FRACASO:{
				VentanaCreateCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_CLIENTE_EXITO:{
				VentanaDeleteCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_CLIENTE_FRACASO:{
				VentanaDeleteCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_CLIENTE_EXITO:{
				VentanaReadCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_CLIENTE_FRACASO:{
				VentanaReadCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_CLIENTE_EXITO:{
				VentanaUpdateCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_CLIENTE_FRACASO:{
				VentanaUpdateCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_CLIENTE_EXITO:{
				VentanaReadAllCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_CLIENTE_FRACASO:{
				VentanaReadAllCliente.getInstance().update(responseContext.getDatos());
				break;
			}
			
			//Productos
			case EventoNegocio.READ_PRODUCTO_EXITO:{
				VentanaReadProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_PRODUCTO_FRACASO:{
				VentanaReadProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_PRODUCTO_EXITO:{
				VentanaCreateProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_PRODUCTO_FRACASO:{
				VentanaCreateProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_PRODUCTO_EXITO:{
				VentanaUpdateProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_PRODUCTO_FRACASO:{
				VentanaUpdateProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_PRODUCTO_EXITO:{
				VentanaDeleteProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_PRODUCTO_FRACASO:{
				VentanaDeleteProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_PRODUCTO_EXITO:{
				VentanaReadAllProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_PRODUCTO_FRACASO:{
				VentanaReadAllProducto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.CALCULA_COSTE:{
				VentanaCalculaCoste.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_PROD_BY_CLIENTE:{
				VentanaProductosByCliente.getInstance().update(responseContext.getDatos());
			}
		}
	}
}