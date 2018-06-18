package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaUpdateClienteImp extends VentanaUpdateCliente{
	private JPanel PanelUpdateEmpleado;
    private JButton botonModificar;
    private JTextField jTextFieldDNIAltaCliente;
    private JLabel jLabelDniEmpleado;
    private JTextField jTextFieldNombreAltaCliente;
    private JLabel jLabelNombreEmpleado;
    private JTextField textField;
    private JTextField textFieldActivo;

	@Override
	public void update(Object datos) {

		if (datos != null){
			JOptionPane.showMessageDialog(null, "Cliente actualizado con exito.");
			PanelUpdateEmpleado.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Cliente buscado.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelUpdateEmpleado = new javax.swing.JPanel();
		jLabelNombreEmpleado = new javax.swing.JLabel();
		jLabelDniEmpleado = new javax.swing.JLabel();

		jTextFieldNombreAltaCliente = new javax.swing.JTextField();
		jTextFieldDNIAltaCliente = new javax.swing.JTextField();
		botonModificar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelUpdateEmpleado.setAlignmentX(1.0F);
		PanelUpdateEmpleado.setAlignmentY(1.0F);
		PanelUpdateEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelUpdateEmpleado.setName(""); // NOI18N


		jTextFieldNombreAltaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreEmpleado.setText("Nombre: ");

		jTextFieldDNIAltaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniEmpleado.setText("DNI: ");
		
		botonModificar.setBackground(new java.awt.Color(255, 102, 0));
		botonModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonModificar.setText("Modificar");
		botonModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		JLabel lblIdCliente = new JLabel("Id Cliente:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblActivo = new JLabel("Activo:");
		
		textFieldActivo = new JTextField();
		textFieldActivo.setColumns(10);
		
		botonModificar.addActionListener(new java.awt.event.ActionListener() {
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
	            	trCliente.setId(Integer.parseInt(textField.getText()));
            		trCliente.setNombre(jTextFieldNombreAltaCliente.getText());
            		trCliente.setDni(jTextFieldDNIAltaCliente.getText());
            		trCliente.setActivo(Boolean.valueOf(textFieldActivo.getText()));		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_UPDATE_CLIENTE, trCliente);
	   				Controlador.getInstance().accion(context);	            	
            	}
			
            }
        });
		
		javax.swing.GroupLayout PanelUpdateEmpleadoLayout = new javax.swing.GroupLayout(PanelUpdateEmpleado);
		PanelUpdateEmpleadoLayout.setHorizontalGroup(
			PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(botonModificar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addGap(52)
							.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblActivo)
								.addComponent(jLabelDniEmpleado)
								.addComponent(jLabelNombreEmpleado)
								.addComponent(lblIdCliente))
							.addGap(39)
							.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreAltaCliente, 198, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldDNIAltaCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
					.addGap(45))
		);
		PanelUpdateEmpleadoLayout.setVerticalGroup(
			PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdCliente)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelNombreEmpleado)
						.addComponent(jTextFieldNombreAltaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniEmpleado)
						.addComponent(jTextFieldDNIAltaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActivo)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(71)
					.addComponent(botonModificar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(341, Short.MAX_VALUE))
		);
		PanelUpdateEmpleado.setLayout(PanelUpdateEmpleadoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelUpdateEmpleado.setVisible(true);
        pack();
		return PanelUpdateEmpleado;
	}

}
