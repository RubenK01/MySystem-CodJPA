package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaDeleteClienteImp extends VentanaDeleteCliente{

	private JPanel PanelDeleteCliente;
    private JButton botonAceptarDeleteCliente;
    private JLabel lblIdCliente;
    private JTextField textFieldIdCliente;

	@Override
	public void update(Object datos) {
		
		if (datos != null){
			JOptionPane.showMessageDialog(null, "Cliente borrado con exito.");
			PanelDeleteCliente.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Cliente buscado o ya está dado de baja.");
		}
	}

	@Override
	public Component initGUI() {
		PanelDeleteCliente = new javax.swing.JPanel();
		botonAceptarDeleteCliente = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelDeleteCliente.setAlignmentX(1.0F);
		PanelDeleteCliente.setAlignmentY(1.0F);
		PanelDeleteCliente.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelDeleteCliente.setName("");
		
		botonAceptarDeleteCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarDeleteCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarDeleteCliente.setText("Aceptar");
		botonAceptarDeleteCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		textFieldIdCliente = new JTextField();
		textFieldIdCliente.setColumns(10);
		
		lblIdCliente = new JLabel("Id Cliente:");
		
		botonAceptarDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdCliente.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Cliente' es obligatorio.");
    				textFieldIdCliente.requestFocus();
    			}
            	Cliente trCliente = new Cliente();
            	
            	trCliente.setId(Integer.parseInt(textFieldIdCliente.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.COMANDO_DELETE_CLIENTE, trCliente);
   				Controlador.getInstance().accion(context);	        
            }
        });

		javax.swing.GroupLayout PanelDeleteClienteLayout = new javax.swing.GroupLayout(PanelDeleteCliente);
		PanelDeleteClienteLayout.setHorizontalGroup(
			PanelDeleteClienteLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelDeleteClienteLayout.createSequentialGroup()
					.addGap(178)
					.addComponent(lblIdCliente)
					.addGap(18)
					.addGroup(PanelDeleteClienteLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldIdCliente, Alignment.TRAILING)
						.addComponent(botonAceptarDeleteCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addGap(60))
		);
		PanelDeleteClienteLayout.setVerticalGroup(
			PanelDeleteClienteLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelDeleteClienteLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(PanelDeleteClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdCliente))
					.addGap(197)
					.addComponent(botonAceptarDeleteCliente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelDeleteCliente.setLayout(PanelDeleteClienteLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelDeleteCliente.setVisible(true);
        pack();
		return PanelDeleteCliente;
	}
}
