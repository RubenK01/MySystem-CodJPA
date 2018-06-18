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

public class VentanaCalculaCosteImp extends VentanaCalculaCoste{
	
	private JPanel PanelCalculaCosteCliente;
    private JButton botonAceptarCalculaCosteCliente;
    private JLabel lblIdCliente;
    private JTextField textFieldIdCliente;
    private JLabel lblCosteTotal;
    private JTextField textFieldCoste;

	@Override
	public void update(Object datos) {
		
		if(datos != null) {
			
			textFieldCoste.setText(String.valueOf(((Double)datos)));
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al buscar el cliente. Comprobar que el cliente esté dado de alta.");
		}
	}

	@Override
	public Component initGUI() {
		PanelCalculaCosteCliente = new javax.swing.JPanel();
		botonAceptarCalculaCosteCliente = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelCalculaCosteCliente.setAlignmentX(1.0F);
		PanelCalculaCosteCliente.setAlignmentY(1.0F);
		PanelCalculaCosteCliente.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelCalculaCosteCliente.setName("");
		
		botonAceptarCalculaCosteCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarCalculaCosteCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarCalculaCosteCliente.setText("Calcular");
		botonAceptarCalculaCosteCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		textFieldIdCliente = new JTextField();
		textFieldIdCliente.setColumns(10);
		
		lblIdCliente = new JLabel("Id Cliente:");
		
		botonAceptarCalculaCosteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdCliente.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Cliente' es obligatorio.");
    				textFieldIdCliente.requestFocus();
    			}
            	Cliente trCliente = new Cliente();
            	
            	trCliente.setId(Integer.parseInt(textFieldIdCliente.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.CALCULA_COSTE, trCliente);
   				Controlador.getInstance().accion(context);	        
            }
        });
		
		lblCosteTotal = new JLabel("Coste total:");
		
		textFieldCoste = new JTextField();
		textFieldCoste.setEditable(false);
		textFieldCoste.setColumns(10);

		javax.swing.GroupLayout PanelCalculaCosteClienteLayout = new javax.swing.GroupLayout(PanelCalculaCosteCliente);
		PanelCalculaCosteClienteLayout.setHorizontalGroup(
			PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelCalculaCosteClienteLayout.createSequentialGroup()
					.addGap(128)
					.addGroup(PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCosteTotal)
						.addComponent(lblIdCliente))
					.addGroup(PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(PanelCalculaCosteClienteLayout.createSequentialGroup()
							.addGap(68)
							.addComponent(botonAceptarCalculaCosteCliente, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelCalculaCosteClienteLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textFieldCoste, Alignment.LEADING)
								.addComponent(textFieldIdCliente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
					.addGap(60))
		);
		PanelCalculaCosteClienteLayout.setVerticalGroup(
			PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelCalculaCosteClienteLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdCliente)
						.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(PanelCalculaCosteClienteLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCosteTotal)
						.addComponent(textFieldCoste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(148)
					.addComponent(botonAceptarCalculaCosteCliente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelCalculaCosteCliente.setLayout(PanelCalculaCosteClienteLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelCalculaCosteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelCalculaCosteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelCalculaCosteCliente.setVisible(true);
        pack();
		return PanelCalculaCosteCliente;
	}

}
