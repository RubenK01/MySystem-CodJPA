package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaReadAllClienteImp extends VentanaReadAllCliente{
	private javax.swing.JScrollPane ListarClientes;
    private javax.swing.JPanel PanelListarClientes;
    private javax.swing.JTable TablaListarClientes;

	@Override
	public void update(Object datos) {
		// TODO Auto-generated method stub
		if(datos != null ) {
			MyTablaCliente tiModel = new MyTablaCliente( (Collection<Cliente>) datos);
			TablaListarClientes.setModel(tiModel);
			repaint();
			revalidate();	
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontraron registros.");
			PanelListarClientes.setVisible(false);
		}
	}

	@SuppressWarnings("serial")
	@Override
	public Component initGUI() {
		PanelListarClientes = new javax.swing.JPanel();
		ListarClientes = new javax.swing.JScrollPane();
		TablaListarClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaListarClientes.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TablaListarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "DNI", "Activo"}
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListarClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

		Contexto context = new Contexto(EventoGUI.COMANDO_READALL_CLIENTE,
				null);
		Controlador.getInstance().accion(context);

        ListarClientes.setViewportView(TablaListarClientes);

        javax.swing.GroupLayout PanelListarClientesLayout = new javax.swing.GroupLayout(PanelListarClientes);
        PanelListarClientesLayout.setHorizontalGroup(
        	PanelListarClientesLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarClientesLayout.createSequentialGroup()
        			.addGap(160)
        			.addComponent(ListarClientes, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(274, Short.MAX_VALUE))
        );
        PanelListarClientesLayout.setVerticalGroup(
        	PanelListarClientesLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarClientesLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(ListarClientes, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(140, Short.MAX_VALUE))
        );
        PanelListarClientes.setLayout(PanelListarClientesLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarClientes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelListarClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
   

	           
	    PanelListarClientes.setVisible(true);
        
        pack();
		return PanelListarClientes;
	}

}
