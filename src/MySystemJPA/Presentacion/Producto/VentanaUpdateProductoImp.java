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

public class VentanaUpdateProductoImp extends VentanaUpdateProducto {
	
	private JPanel PanelUpdateProducto;
    private JButton botonBuscarProducto;
    private JLabel jLabelDniProducto;
    private JTextField jTextFieldNombreUpdateProducto;
    private JLabel jLabelNombreProducto;
    private JTextField textFieldPeso;
    private JTextField textFieldLDC;
    private JRadioButton rdbtnSoftware;	
	private JRadioButton rdbtnHardware;
	private JLabel lblidCliente;
	private JTextField textFieldIdCliente;
	private JLabel lblid;
	private JTextField textField;
	private JLabel lblActivo;
	private JTextField textField_Activo;
	private String tipoProducto = "";

	@Override
	public void update(Object datos) {

		if (datos != null){
			JOptionPane.showMessageDialog(null, "Producto actualizado con exito.");
			PanelUpdateProducto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al actualizar. Comprobar que no existe ningún nombre igual y que el id existe.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelUpdateProducto = new javax.swing.JPanel();
		jLabelNombreProducto = new javax.swing.JLabel();
		jLabelDniProducto = new javax.swing.JLabel();

		jTextFieldNombreUpdateProducto = new javax.swing.JTextField();
		botonBuscarProducto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelUpdateProducto.setAlignmentX(1.0F);
		PanelUpdateProducto.setAlignmentY(1.0F);
		PanelUpdateProducto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelUpdateProducto.setName(""); // NOI18N


		jTextFieldNombreUpdateProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProducto.setText("*Nombre: ");
		jLabelDniProducto.setText("*Tipo Producto: ");
		
		botonBuscarProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonBuscarProducto.setText("Modificar");
		botonBuscarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

		
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
		textFieldPeso.setColumns(10);
		
		JLabel lbllineasDeCdigo = new JLabel("*Lineas de C\u00F3digo:");
		
		textFieldLDC = new JTextField();
		textFieldLDC.setColumns(10);
		
		lblidCliente = new JLabel("*Id Cliente:");
		
		textFieldIdCliente = new JTextField();
		textFieldIdCliente.setColumns(10);
		
		
		
		
		lblid = new JLabel("*Id Producto:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lblActivo = new JLabel("*Activo:");
		
		textField_Activo = new JTextField();
		textField_Activo.setColumns(10);
		
		botonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(java.awt.event.ActionEvent evt) {
		      	
		      	if (textField.getText().compareTo("") == 0) {
						JOptionPane.showMessageDialog(null,
								"El campo 'Id Producto' es obligatorio.");
						textField.requestFocus();
				}
		      	else{
		      		Producto trProducto = null;
		      		if(tipoProducto.compareTo("software") == 0) {
		      			trProducto = new Software();
		      			((Software)trProducto).setLineasDeCodigo(Integer.parseInt(textFieldLDC.getText()));
		      		}
		      			
		      		else if(tipoProducto.compareTo("hardware") == 0) {
		      			trProducto = new Hardware();
		      			((Hardware)trProducto).setPeso(Double.valueOf(textFieldPeso.getText()));
		      		}
		      			
		  			
		  			trProducto.setId(Integer.parseInt(textField.getText()));
		  			trProducto.setActivo(Boolean.valueOf(textField_Activo.getText()));
		  			trProducto.setNombre(jTextFieldNombreUpdateProducto.getText());
		  			trProducto.setTipoProducto(tipoProducto);
		  			
		  			Cliente cl = new Cliente();
		  			
		  			cl.setId(Integer.valueOf(textFieldIdCliente.getText()));
		  			
		  			trProducto.setCliente(cl);
		  			
	      		
	 				Contexto context = new Contexto(
	 						EventoGUI.COMANDO_UPDATE_PRODUCTO, trProducto);
	 				Controlador.getInstance().accion(context);	            	
		      	}
				
		      }
		  });
		
		
		
		
		
		javax.swing.GroupLayout PanelUpdateProductoLayout = new javax.swing.GroupLayout(PanelUpdateProducto);
		PanelUpdateProductoLayout.setHorizontalGroup(
			PanelUpdateProductoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelUpdateProductoLayout.createSequentialGroup()
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(PanelUpdateProductoLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(botonBuscarProducto, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelUpdateProductoLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblActivo)
								.addComponent(jLabelDniProducto)
								.addComponent(jLabelNombreProducto)
								.addComponent(lblpeso)
								.addComponent(lbllineasDeCdigo)
								.addComponent(lblidCliente)
								.addComponent(lblid))
							.addGap(39)
							.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_Activo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldLDC, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldPeso, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addGroup(PanelUpdateProductoLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(rdbtnSoftware)
									.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
									.addComponent(rdbtnHardware)
									.addGap(20))
								.addComponent(jTextFieldNombreUpdateProducto, 198, 198, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
					.addGap(60))
		);
		PanelUpdateProductoLayout.setVerticalGroup(
			PanelUpdateProductoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelUpdateProductoLayout.createSequentialGroup()
					.addGap(8)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblid)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreUpdateProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProducto))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniProducto)
						.addComponent(rdbtnSoftware)
						.addComponent(rdbtnHardware))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblpeso)
						.addComponent(textFieldPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldLDC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbllineasDeCdigo))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblidCliente)
						.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActivo)
						.addComponent(textField_Activo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(botonBuscarProducto, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(320, Short.MAX_VALUE))
		);
		PanelUpdateProducto.setLayout(PanelUpdateProductoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelUpdateProducto.setVisible(true);
        pack();
		return PanelUpdateProducto;
	}

}
