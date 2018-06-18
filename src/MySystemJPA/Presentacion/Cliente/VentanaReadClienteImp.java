package MySystemJPA.Presentacion.Cliente;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaReadClienteImp extends VentanaReadCliente{
	
	private JPanel PanelReadCliente;
    private JButton botonBuscar;
    private JTextField jTextFieldDNIReadCliente;
    private JLabel jLabelDniCliente;
    private JTextField jTextFieldNombreReadCliente;
    private JLabel jLabelNombreCliente;
    private JTextField textField;
    private JTextField textFieldActivo;


	@Override
	public void update(Object datos) {
		if(datos != null) {
			Cliente miCliente = (Cliente)datos;
			
			jTextFieldDNIReadCliente.setText(miCliente.getDni());
			jTextFieldNombreReadCliente.setText(miCliente.getNombre());
			textFieldActivo.setText(String.valueOf(miCliente.getActivo()));
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Cliente buscado.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelReadCliente = new javax.swing.JPanel();
		jLabelNombreCliente = new javax.swing.JLabel();
		jLabelDniCliente = new javax.swing.JLabel();

		jTextFieldNombreReadCliente = new javax.swing.JTextField();
		jTextFieldNombreReadCliente.setEditable(false);
		jTextFieldDNIReadCliente = new javax.swing.JTextField();
		jTextFieldDNIReadCliente.setEditable(false);
		botonBuscar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelReadCliente.setAlignmentX(1.0F);
		PanelReadCliente.setAlignmentY(1.0F);
		PanelReadCliente.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelReadCliente.setName(""); // NOI18N


		jTextFieldNombreReadCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreCliente.setText("Nombre: ");

		jTextFieldDNIReadCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniCliente.setText("DNI: ");
		
		botonBuscar.setBackground(new java.awt.Color(255, 102, 0));
		botonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonBuscar.setText("Buscar");
		botonBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		JLabel lblIdCliente = new JLabel("Id Cliente:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblActivo = new JLabel("Activo:");
		
		textFieldActivo = new JTextField();
		textFieldActivo.setEditable(false);
		textFieldActivo.setColumns(10);
		
		botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	

            	if (textField.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Cliente' es obligatorio.");
    				textField.requestFocus();
    			}
            	Cliente trCliente = new Cliente();
            	
            	trCliente.setId(Integer.parseInt(textField.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.COMANDO_READ_CLIENTE, trCliente);
   				Controlador.getInstance().accion(context);	    
			
            }
        });
		
		javax.swing.GroupLayout PanelReadClienteLayout = new javax.swing.GroupLayout(PanelReadCliente);
		PanelReadClienteLayout.setHorizontalGroup(
			PanelReadClienteLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, PanelReadClienteLayout.createSequentialGroup()
					.addGap(52)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblActivo)
						.addComponent(jLabelDniCliente)
						.addComponent(jLabelNombreCliente)
						.addComponent(lblIdCliente))
					.addGap(39)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addGroup(PanelReadClienteLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addComponent(jTextFieldNombreReadCliente, 198, 198, Short.MAX_VALUE)
						.addComponent(jTextFieldDNIReadCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
					.addGap(45))
		);
		PanelReadClienteLayout.setVerticalGroup(
			PanelReadClienteLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelReadClienteLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdCliente)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelNombreCliente)
						.addComponent(jTextFieldNombreReadCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniCliente)
						.addComponent(jTextFieldDNIReadCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActivo)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(447, Short.MAX_VALUE))
		);
		PanelReadCliente.setLayout(PanelReadClienteLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelReadCliente.setVisible(true);
        pack();
		return PanelReadCliente;
	}

}
