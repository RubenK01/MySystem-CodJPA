package MySystemJPA.Presentacion.Comandos.Producto;

import java.util.ArrayList;

import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoProductosByCliente  implements Comando {
	
	@Override
	public Contexto execute(Object data) {
		SAProducto sa = FactoriaSA.getInstance().createSAProducto();
		Producto t = (Producto)data;
		ArrayList<Producto> s = sa.readProductosByCliente(t);
		Contexto responseContext = null;
		if(s.size() > 0){
			responseContext = new Contexto(EventoNegocio.READ_PROD_BY_CLIENTE, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_PROD_BY_CLIENTE, null);
		}
		return responseContext;
	}
}
