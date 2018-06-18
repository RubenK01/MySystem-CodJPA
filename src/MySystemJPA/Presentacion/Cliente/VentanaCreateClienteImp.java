package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

import javax.swing.GroupLayout.Alignment;

public class VentanaCreateClienteImp extends VentanaCreateCliente{
	
	private JPanel PanelAltaCliente;
    private JButton botonAceptarAltaCliente;
    private JTextField jTextFieldDNIAltaCliente;
    private JLabel jLabelDniCliente;
    private JTextField jTextFieldNombreAltaCliente;
    private JLabel jLabelNombreCliente;

	@Override
	public void update(Object datos) {
		if (datos != null){
			if(((int)datos) > 0){
				JOptionPane.showMessageDialog(null, "Cliente creado con exito con el ID: " + (int)datos);
			}
			else {
				JOptionPane.showMessageDialog(null, "El cliente con el dni introducido ya existía y se ha procedido a dar de alta con los nuevos datos. ");
			}
			
			PanelAltaCliente.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al crear cliente, verificar si el dni ya está dado de alta.");
		}
	}

	@Override
	public Component initGUI() {
		PanelAltaCliente = new javax.swing.JPanel();
		jLabelNombreCliente = new javax.swing.JLabel();
		jLabelDniCliente = new javax.swing.JLabel();

		jTextFieldNombreAltaCliente = new javax.swing.JTextField();
		jTextFieldDNIAltaCliente = new javax.swing.JTextField();
		botonAceptarAltaCliente = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelAltaCliente.setAlignmentX(1.0F);
		PanelAltaCliente.setAlignmentY(1.0F);
		PanelAltaCliente.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelAltaCliente.setName(""); // NOI18N


		jTextFieldNombreAltaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreCliente.setText("*Nombre: ");

		jTextFieldDNIAltaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniCliente.setText("*DNI: ");
		
		botonAceptarAltaCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarAltaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarAltaCliente.setText("Aceptar");
		botonAceptarAltaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		botonAceptarAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (jTextFieldNombreAltaCliente.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Nombre' es obligatorio.");
    				jTextFieldNombreAltaCliente.requestFocus();
    			}
            	else if (jTextFieldDNIAltaCliente.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'DNI' es obligatorio.");
            		jTextFieldDNIAltaCliente.requestFocus();
            	}
            	else{
	    			Cliente trCliente = null;
	            	
	            	trCliente = new Cliente();
            		trCliente.setNombre(jTextFieldNombreAltaCliente.getText());
            		trCliente.setDni(jTextFieldDNIAltaCliente.getText());
            		trCliente.setActivo(true);		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_CREATE_CLIENTE, trCliente);
	   				Controlador.getInstance().accion(context);	            	
            	}
			
            }
        });
		
		javax.swing.GroupLayout PanelAltaClienteLayout = new javax.swing.GroupLayout(PanelAltaCliente);
		PanelAltaClienteLayout.setHorizontalGroup(
			PanelAltaClienteLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelAltaClienteLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelAltaClienteLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(botonAceptarAltaCliente, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(PanelAltaClienteLayout.createSequentialGroup()
							.addGroup(PanelAltaClienteLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelDniCliente)
								.addComponent(jLabelNombreCliente))
							.addGap(39)
							.addGroup(PanelAltaClienteLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(jTextFieldDNIAltaCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreAltaCliente, 198, 198, Short.MAX_VALUE))))
					.addGap(60))
		);
		PanelAltaClienteLayout.setVerticalGroup(
			PanelAltaClienteLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelAltaClienteLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(PanelAltaClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreAltaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreCliente))
					.addGap(18)
					.addGroup(PanelAltaClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldDNIAltaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelDniCliente))
					.addGap(235)
					.addComponent(botonAceptarAltaCliente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelAltaCliente.setLayout(PanelAltaClienteLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAltaCliente.setVisible(true);
        pack();
		return PanelAltaCliente;
	}

}
