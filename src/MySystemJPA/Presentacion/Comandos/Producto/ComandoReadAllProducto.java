package MySystemJPA.Presentacion.Comandos.Producto;

import java.util.ArrayList;

import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoReadAllProducto  implements Comando {
	
	@Override
	public Contexto execute(Object data) {
		SAProducto sa = FactoriaSA.getInstance().createSAProducto();
		Producto t = (Producto)data;
		ArrayList<Producto> s = sa.readAllProductos();
		Contexto responseContext = null;
		if(s.size() > 0){
			responseContext = new Contexto(EventoNegocio.READALL_PRODUCTO_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READALL_PRODUCTO_FRACASO, null);
		}
		return responseContext;
	}
}