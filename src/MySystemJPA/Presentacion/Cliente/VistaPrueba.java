package MySystemJPA.Presentacion.Cliente;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.Producto.Hardware;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.Software;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VistaPrueba extends JFrame {

	private javax.swing.JScrollPane ListarProdByEmpleadoProductos;
    private javax.swing.JPanel PanelListarProdByEmpleadoProductos;
    private javax.swing.JTable TablaListarProdByEmpleadoProductos;
    private JLabel lblIdCliente;
    private JTextField textFieldIdCliente;

	/**
	 * Create the frame.
	 */
	public VistaPrueba() {
		PanelListarProdByEmpleadoProductos = new javax.swing.JPanel();
		ListarProdByEmpleadoProductos = new javax.swing.JScrollPane();
		TablaListarProdByEmpleadoProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaListarProdByEmpleadoProductos.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TablaListarProdByEmpleadoProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaListarProdByEmpleadoProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

		Contexto context = new Contexto(EventoGUI.COMANDO_PROD_BY_CLIENTE,
				null);
		Controlador.getInstance().accion(context);

        ListarProdByEmpleadoProductos.setViewportView(TablaListarProdByEmpleadoProductos);
        
        lblIdCliente = new JLabel("Id Cliente:");
        
        textFieldIdCliente = new JTextField();
        textFieldIdCliente.setColumns(10);
        
        JButton btnBuscar = new JButton("Buscar");

        javax.swing.GroupLayout PanelListarProdByEmpleadoProductosLayout = new javax.swing.GroupLayout(PanelListarProdByEmpleadoProductos);
        PanelListarProdByEmpleadoProductosLayout.setHorizontalGroup(
        	PanelListarProdByEmpleadoProductosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarProdByEmpleadoProductosLayout.createSequentialGroup()
        			.addGap(144)
        			.addGroup(PanelListarProdByEmpleadoProductosLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(ListarProdByEmpleadoProductos, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
        				.addGroup(PanelListarProdByEmpleadoProductosLayout.createSequentialGroup()
        					.addComponent(lblIdCliente)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(32)
        					.addComponent(btnBuscar)))
        			.addContainerGap(215, Short.MAX_VALUE))
        );
        PanelListarProdByEmpleadoProductosLayout.setVerticalGroup(
        	PanelListarProdByEmpleadoProductosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarProdByEmpleadoProductosLayout.createSequentialGroup()
        			.addGap(30)
        			.addGroup(PanelListarProdByEmpleadoProductosLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblIdCliente)
        				.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBuscar))
        			.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        			.addComponent(ListarProdByEmpleadoProductos, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
        			.addGap(89))
        );
        PanelListarProdByEmpleadoProductos.setLayout(PanelListarProdByEmpleadoProductosLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarProdByEmpleadoProductos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarProdByEmpleadoProductos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
   

	           
	    PanelListarProdByEmpleadoProductos.setVisible(true);
        
        pack();
	}
}
