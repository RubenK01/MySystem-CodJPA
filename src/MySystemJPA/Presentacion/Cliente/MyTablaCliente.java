package MySystemJPA.Presentacion.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import MySystemJPA.Negocio.Cliente.Cliente;

public class MyTablaCliente extends AbstractTableModel {
	
	private List<Cliente> clientes;
	String[] columnNames = new String [] {
            "ID cliente", "Nombre", "DNI", "Activo"};
	
	public MyTablaCliente(Collection<Cliente> clientes) {
		this.clientes = new ArrayList<>();
		for (int i = 0; i < clientes.size(); i++) {
			this.clientes.add((Cliente) clientes.toArray()[i]);
		}
	}
	
	public int getRowCount() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return clientes.size();
		// end-user-code
	}

	
	public int getColumnCount() {
		// begin-user-code
		return 4;
		// end-user-code
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		// begin-user-code
		Object value = "??";
		Cliente cliente = clientes.get(rowIndex);
		switch (columnIndex) {
		case 0:
			value = cliente.getId();
			break;
		case 1:
			value = cliente.getNombre();
			break;
		case 2:
			value = cliente.getDni();
			break;
		case 3:
			value = cliente.getActivo();
			break;
		}
		
		return value;
		// end-user-code
	}
	
	public String getColumnName(int col) {
		// begin-user-code
		return columnNames[col];
		// end-user-code
	}
	
	@SuppressWarnings("unused")
	public Cliente getUserAt(int row) {
		// begin-user-code
		return clientes.get(row);
		// end-user-code
	}
}
