package MySystemJPA.Presentacion.Producto;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.Producto.Hardware;
import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.Software;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaCreateProductoImp extends VentanaCreateProducto{
	
	private JPanel PanelAltaProducto;
    private JButton botonAceptarAltaProducto;
    private JLabel jLabelDniProducto;
    private JTextField jTextFieldNombreAltaProducto;
    private JLabel jLabelNombreProducto;
    private JTextField textFieldPeso;
    private JTextField textFieldLDC;
    private String tipoProducto = "";
    private JRadioButton rdbtnSoftware;	
	private JRadioButton rdbtnHardware;
	private JLabel lblidCliente;
	private JTextField textFieldIdCliente;

	@Override
	public void update(Object datos) {
		if (datos != null){
			if(((int)datos) > 0){
				JOptionPane.showMessageDialog(null, "Producto creado con exito con el ID: " + (int)datos);
			}
			else {
				JOptionPane.showMessageDialog(null, "El producto con el nombre introducido ya existía y se ha procedido a dar de alta con los nuevos datos. ");
			}
			
			PanelAltaProducto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al crear producto, verificar si el nombre ya está dado de alta y el id del cliente existe.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelAltaProducto = new javax.swing.JPanel();
		jLabelNombreProducto = new javax.swing.JLabel();
		jLabelDniProducto = new javax.swing.JLabel();

		jTextFieldNombreAltaProducto = new javax.swing.JTextField();
		botonAceptarAltaProducto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelAltaProducto.setAlignmentX(1.0F);
		PanelAltaProducto.setAlignmentY(1.0F);
		PanelAltaProducto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelAltaProducto.setName(""); // NOI18N


		jTextFieldNombreAltaProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProducto.setText("*Nombre: ");
		jLabelDniProducto.setText("*Tipo Producto: ");
		
		botonAceptarAltaProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarAltaProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarAltaProducto.setText("Aceptar");
		botonAceptarAltaProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

		
		rdbtnSoftware = new JRadioButton("Software");
		
		rdbtnHardware = new JRadioButton("Hardware");
		
		rdbtnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(rdbtnSoftware.isSelected()) {
            		tipoProducto = "software";
            		rdbtnHardware.setSelected(false);
            		textFieldLDC.setEnabled(true);
            		textFieldPeso.setEnabled(false);
            	}
            	if(!rdbtnSoftware.isSelected()) {
            		rdbtnHardware.setSelected(false);
            		textFieldLDC.setEnabled(false);
            		textFieldPeso.setEnabled(false);
            	}
            	
            }
		});
		
		rdbtnHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(rdbtnHardware.isSelected()) {
            		tipoProducto = "hardware";
            		rdbtnSoftware.setSelected(false);
            		textFieldPeso.setEnabled(true);
            		textFieldLDC.setEnabled(false);
            	}
            	if(!rdbtnHardware.isSelected()) {
            		rdbtnSoftware.setSelected(false);
            		textFieldPeso.setEnabled(false);
            		textFieldLDC.setEnabled(false);
            	}
            	
            }
		});
		
		JLabel lblpeso = new JLabel("*Peso:");
		
		textFieldPeso = new JTextField();
		textFieldPeso.setEnabled(false);
		textFieldPeso.setColumns(10);
		
		JLabel lbllineasDeCdigo = new JLabel("*Lineas de C\u00F3digo:");
		
		textFieldLDC = new JTextField();
		textFieldLDC.setEnabled(false);
		textFieldLDC.setColumns(10);
		
		lblidCliente = new JLabel("*Id Cliente:");
		
		textFieldIdCliente = new JTextField();
		textFieldIdCliente.setColumns(10);
		
		
		botonAceptarAltaProducto.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(java.awt.event.ActionEvent evt) {
	      	
	      	if (jTextFieldNombreAltaProducto.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null,
							"El campo 'Nombre' es obligatorio.");
					jTextFieldNombreAltaProducto.requestFocus();
			}
	      	else if (rdbtnHardware.isSelected() == false && rdbtnSoftware.isSelected() == false){
	    		JOptionPane.showMessageDialog(null,
						"Debes seleccionar un tipo de Producto.");
	    	}
	    	else if (rdbtnHardware.isSelected() && textFieldPeso.getText().compareTo("") == 0 ){
	    		JOptionPane.showMessageDialog(null,
						"El campo 'Peso' es obligatorio.");
	    		textFieldPeso.requestFocus();
	    	}
	    	else if (rdbtnSoftware.isSelected() && textFieldLDC.getText().compareTo("") == 0 ){
	    		JOptionPane.showMessageDialog(null,
						"El campo 'Lineas de Código' es obligatorio.");
	    		textFieldLDC.requestFocus();
	    	}
	    	else if(textFieldIdCliente.getText().compareTo("") == 0) {
	    		JOptionPane.showMessageDialog(null,
						"El campo 'Id Cliente' es obligatorio.");
	    		textFieldIdCliente.requestFocus();
	    	}
	      	else{
	  			Producto trProducto = null;
	  			
	  			if("software".equalsIgnoreCase(tipoProducto)) {
	  				trProducto = new Software();
	  				((Software)trProducto).setLineasDeCodigo(Integer.parseInt(textFieldLDC.getText()));
	  			}
	  			else if ("hardware".equalsIgnoreCase(tipoProducto)) {
	  				trProducto = new Hardware();
	  				
	  				((Hardware)trProducto).setPeso(Double.valueOf(textFieldPeso.getText()));
	  			}
	          	
	      		trProducto.setNombre(jTextFieldNombreAltaProducto.getText());	      		
	      		trProducto.setActivo(true);		
	      		trProducto.setTipoProducto(tipoProducto);
	      		
	      		Cliente cl = new Cliente();
	      		
	      		cl.setId(Integer.parseInt(textFieldIdCliente.getText()));
	      		
	      		trProducto.setCliente(cl);
	      		
 				Contexto context = new Contexto(
 						EventoGUI.COMANDO_CREATE_PRODUCTO, trProducto);
 				Controlador.getInstance().accion(context);	            	
	      	}
			
	      }
	  });
		
		
		
		javax.swing.GroupLayout PanelAltaProductoLayout = new javax.swing.GroupLayout(PanelAltaProducto);
		PanelAltaProductoLayout.setHorizontalGroup(
			PanelAltaProductoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelAltaProductoLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(botonAceptarAltaProducto, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(PanelAltaProductoLayout.createSequentialGroup()
							.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelDniProducto)
								.addComponent(jLabelNombreProducto)
								.addComponent(lblpeso)
								.addComponent(lbllineasDeCdigo)
								.addComponent(lblidCliente))
							.addGap(39)
							.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldIdCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldLDC, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldPeso, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addGroup(PanelAltaProductoLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(rdbtnSoftware)
									.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
									.addComponent(rdbtnHardware)
									.addGap(20))
								.addComponent(jTextFieldNombreAltaProducto, 198, 198, Short.MAX_VALUE))))
					.addGap(60))
		);
		PanelAltaProductoLayout.setVerticalGroup(
			PanelAltaProductoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelAltaProductoLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreAltaProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProducto))
					.addGap(18)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniProducto)
						.addComponent(rdbtnSoftware)
						.addComponent(rdbtnHardware))
					.addGap(18)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblpeso)
						.addComponent(textFieldPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldLDC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbllineasDeCdigo))
					.addGap(18)
					.addGroup(PanelAltaProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblidCliente)
						.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(139)
					.addComponent(botonAceptarAltaProducto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelAltaProducto.setLayout(PanelAltaProductoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAltaProducto.setVisible(true);
        pack();
		return PanelAltaProducto;
	}

}
