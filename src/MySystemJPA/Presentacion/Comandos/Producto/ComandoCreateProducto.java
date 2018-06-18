package MySystemJPA.Presentacion.Comandos.Producto;

import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.SAProducto;
import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoCreateProducto implements Comando {
	
	@Override
	public Contexto execute(Object data) throws ExcepcionNegocio {
		SAProducto sa = FactoriaSA.getInstance().createSAProducto();
		Producto t = (Producto)data;
		int s = sa.createProducto(t);
		Contexto responseContext = null;
		if(s > -1){
			responseContext = new Contexto(EventoNegocio.ALTA_PRODUCTO_EXITO, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.ALTA_PRODUCTO_FRACASO, null);
		}
		return responseContext;
	}
}
