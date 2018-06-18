package MySystemJPA.Presentacion.Producto;

import java.awt.Component;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;

import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaReadAllProductoImp extends VentanaReadAllProducto{
	private javax.swing.JScrollPane ListarProductos;
    private javax.swing.JPanel PanelListarProductos;
    private javax.swing.JTable TablaListarProductos;

	@Override
	public void update(Object datos) {
		// TODO Auto-generated method stub
		if(datos != null ) {
			MyTablaProducto tiModel = new MyTablaProducto( (Collection<Producto>) datos);
			TablaListarProductos.setModel(tiModel);
			repaint();
			revalidate();	
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontraron registros.");
			PanelListarProductos.setVisible(false);
		}
		
	}

	@SuppressWarnings("serial")
	@Override
	public Component initGUI() {
		PanelListarProductos = new javax.swing.JPanel();
		ListarProductos = new javax.swing.JScrollPane();
		TablaListarProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaListarProductos.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TablaListarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Id Cliente", "Tipo Producto", "Activo"}
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListarProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

		Contexto context = new Contexto(EventoGUI.COMANDO_READALL_PRODUCTO,
				null);
		Controlador.getInstance().accion(context);

        ListarProductos.setViewportView(TablaListarProductos);

        javax.swing.GroupLayout PanelListarProductosLayout = new javax.swing.GroupLayout(PanelListarProductos);
        PanelListarProductosLayout.setHorizontalGroup(
        	PanelListarProductosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarProductosLayout.createSequentialGroup()
        			.addGap(160)
        			.addComponent(ListarProductos, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(199, Short.MAX_VALUE))
        );
        PanelListarProductosLayout.setVerticalGroup(
        	PanelListarProductosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarProductosLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(ListarProductos, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(140, Short.MAX_VALUE))
        );
        PanelListarProductos.setLayout(PanelListarProductosLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarProductos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarProductos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
   

	           
	    PanelListarProductos.setVisible(true);
        
        pack();
		return PanelListarProductos;
	}

}
