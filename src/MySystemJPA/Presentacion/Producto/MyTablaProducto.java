package MySystemJPA.Presentacion.Producto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import MySystemJPA.Negocio.Producto.Producto;

public class MyTablaProducto  extends AbstractTableModel{
	private List<Producto> Productos;
	String[] columnNames = new String [] {
			"ID Producto", "Nombre", "Id Cliente", "Tipo Producto", "Activo"};
	
	public MyTablaProducto(Collection<Producto> Productos) {
		this.Productos = new ArrayList<>();
		for (int i = 0; i < Productos.size(); i++) {
			this.Productos.add((Producto) Productos.toArray()[i]);
		}
	}
	
	public int getRowCount() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return Productos.size();
		// end-user-code
	}

	
	public int getColumnCount() {
		// begin-user-code
		return 5;
		// end-user-code
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		// begin-user-code
		Object value = "??";
		Producto Producto = Productos.get(rowIndex);
		switch (columnIndex) {
		case 0:
			value = Producto.getId();
			break;
		case 1:
			value = Producto.getNombre();
			break;
		case 2:
			value = Producto.getCliente().getId();
			break;
		case 3:
			value = Producto.getTipoProducto();
			break;
		case 4:
			value = Producto.getActivo();
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
	public Producto getUserAt(int row) {
		// begin-user-code
		return Productos.get(row);
		// end-user-code
	}
}
