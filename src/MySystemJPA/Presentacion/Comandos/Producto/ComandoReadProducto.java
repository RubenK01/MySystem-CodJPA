package MySystemJPA.Presentacion.Comandos.Producto;

import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoReadProducto   implements Comando {
	
	@Override
	public Contexto execute(Object data) {
		SAProducto sa = FactoriaSA.getInstance().createSAProducto();
		Producto t = (Producto)data;
		Producto s = sa.readProducto(t);
		Contexto responseContext = null;
		if(s != null){
			responseContext = new Contexto(EventoNegocio.READ_PRODUCTO_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_PRODUCTO_FRACASO, null);
		}
		return responseContext;
	}
}