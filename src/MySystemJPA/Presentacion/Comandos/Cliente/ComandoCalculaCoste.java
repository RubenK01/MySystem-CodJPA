package MySystemJPA.Presentacion.Comandos.Cliente;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.Cliente.SACliente;
import MySystemJPA.Negocio.FactoriaSA.FactoriaSA;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.EventoNegocio;

public class ComandoCalculaCoste implements Comando {
	
	@Override
	public Contexto execute(Object data) {
		SACliente sa = FactoriaSA.getInstance().createSACliente();
		Cliente t = (Cliente)data;
		Double s = sa.calculaCoste(t);
		Contexto responseContext = null;
		if(s != -1.0){
			responseContext = new Contexto(EventoNegocio.CALCULA_COSTE, s);
		}
		else{
			responseContext = new Contexto(EventoNegocio.CALCULA_COSTE, null);
		}
		return responseContext;
	}
}