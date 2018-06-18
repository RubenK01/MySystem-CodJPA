/**
 * 
 */
package MySystemJPA.Presentacion.Controlador;

import javax.swing.JOptionPane;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Presentacion.Comandos.Comando;
import MySystemJPA.Presentacion.Comandos.FactoriaComandos.FactoriaComandos;
import MySystemJPA.Presentacion.Dispatcher.Dispatcher;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ControladorImp extends Controlador {
	@Override
	public void accion(Contexto c) {
		// begin-user-code
		Comando command = FactoriaComandos.getInstance().creaComando(c);
		Object datos = c.getDatos();
		if (command != null) {
			Contexto responseContext;
			try {
				responseContext = command.execute(datos);
				Dispatcher.getInstance().dispatch(responseContext);
			} catch (ExcepcionNegocio e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
		}
		// end-user-code
	}
}