package MySystemJPA.Presentacion.Comandos.Producto;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoUpdateProducto   implements Comando {
	
	@Override
	public Contexto execute(Object data) throws ExcepcionNegocio {
		SAProducto sa = FactoriaSA.getInstance().createSAProducto();
		Producto t = (Producto)data;
		Boolean s = sa.updateProducto(t);
		Contexto responseContext = null;
		if(s){
			responseContext = new Contexto(EventoNegocio.UPDATE_PRODUCTO_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.UPDATE_PRODUCTO_FRACASO, null);
		}
		return responseContext;
	}
}