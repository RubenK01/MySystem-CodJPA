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

import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.Software;
import MySystemJPA.Negocio.Producto.Hardware;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaReadProductoImp extends VentanaReadProducto {
	
	private JPanel PanelReadProducto;
    private JButton botonBuscarProducto;
    private JLabel jLabelDniProducto;
    private JTextField jTextFieldNombreReadProducto;
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


	@Override
	public void update(Object datos) {
		if(datos != null) {
			Producto miProducto = (Producto)datos;
			
			if(miProducto.getTipoProducto().compareTo("software") == 0) {
				textFieldLDC.setText(String.valueOf(((Software)miProducto).getLineasDeCodigo()));
				textFieldPeso.setText("");
				rdbtnHardware.setSelected(false);
				rdbtnSoftware.setSelected(true);
			}
			else if (miProducto.getTipoProducto().compareTo("hardware") == 0) {
				textFieldLDC.setText("");
				textFieldPeso.setText(String.valueOf(((Hardware)miProducto).getPeso()));
				rdbtnHardware.setSelected(true);
				rdbtnSoftware.setSelected(false);
			}
			
			jTextFieldNombreReadProducto.setText(miProducto.getNombre());
			textFieldIdCliente.setText(String.valueOf(miProducto.getCliente().getId()));
			textField_Activo.setText(String.valueOf(miProducto.getActivo()));
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Producto buscado.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelReadProducto = new javax.swing.JPanel();
		jLabelNombreProducto = new javax.swing.JLabel();
		jLabelDniProducto = new javax.swing.JLabel();

		jTextFieldNombreReadProducto = new javax.swing.JTextField();
		jTextFieldNombreReadProducto.setEditable(false);
		botonBuscarProducto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelReadProducto.setAlignmentX(1.0F);
		PanelReadProducto.setAlignmentY(1.0F);
		PanelReadProducto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelReadProducto.setName(""); // NOI18N


		jTextFieldNombreReadProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProducto.setText("Nombre: ");
		jLabelDniProducto.setText("Tipo Producto: ");
		
		botonBuscarProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonBuscarProducto.setText("Buscar");
		botonBuscarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

		
		rdbtnSoftware = new JRadioButton("Software");
		
		rdbtnHardware = new JRadioButton("Hardware");
		
		rdbtnHardware.setEnabled(false);
		rdbtnSoftware.setEnabled(false);
		
//		rdbtnSoftware.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//            	if(rdbtnSoftware.isSelected()) {
//            		tipoProducto = "interno";
//            		rdbtnHardware.setSelected(false);
//            		textFieldLDC.setEnabled(true);
//            		textFieldPeso.setEnabled(false);
//            	}
//            	if(!rdbtnSoftware.isSelected()) {
//            		rdbtnHardware.setSelected(false);
//            		textFieldLDC.setEnabled(false);
//            		textFieldPeso.setEnabled(false);
//            	}
//            	
//            }
//		});
//		
//		rdbtnHardware.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//            	if(rdbtnHardware.isSelected()) {
//            		tipoProducto = "interno";
//            		rdbtnSoftware.setSelected(false);
//            		textFieldPeso.setEnabled(true);
//            		textFieldLDC.setEnabled(false);
//            	}
//            	if(!rdbtnHardware.isSelected()) {
//            		rdbtnSoftware.setSelected(false);
//            		textFieldPeso.setEnabled(false);
//            		textFieldLDC.setEnabled(false);
//            	}
//            	
//            }
//		});
		
		JLabel lblpeso = new JLabel("Peso:");
		
		textFieldPeso = new JTextField();
		textFieldPeso.setEditable(false);
		textFieldPeso.setColumns(10);
		
		JLabel lbllineasDeCdigo = new JLabel("Lineas de C\u00F3digo:");
		
		textFieldLDC = new JTextField();
		textFieldLDC.setEditable(false);
		textFieldLDC.setColumns(10);
		
		lblidCliente = new JLabel("Id Cliente:");
		
		textFieldIdCliente = new JTextField();
		textFieldIdCliente.setEditable(false);
		textFieldIdCliente.setColumns(10);
		
		
		
		
		lblid = new JLabel("*Id Producto:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		botonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(java.awt.event.ActionEvent evt) {
		      	
		      	if (textField.getText().compareTo("") == 0) {
						JOptionPane.showMessageDialog(null,
								"El campo 'Id Producto' es obligatorio.");
						textField.requestFocus();
				}
		      	else{
		  			Producto trProducto = new Software();
		  			
		  			trProducto.setId(Integer.parseInt(textField.getText()));
		  			
	      		
	 				Contexto context = new Contexto(
	 						EventoGUI.COMANDO_READ_PRODUCTO, trProducto);
	 				Controlador.getInstance().accion(context);	            	
		      	}
				
		      }
		  });
		
		lblActivo = new JLabel("Activo:");
		
		textField_Activo = new JTextField();
		textField_Activo.setEditable(false);
		textField_Activo.setColumns(10);
		
		
		
		javax.swing.GroupLayout PanelReadProductoLayout = new javax.swing.GroupLayout(PanelReadProducto);
		PanelReadProductoLayout.setHorizontalGroup(
			PanelReadProductoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, PanelReadProductoLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblActivo)
						.addComponent(jLabelDniProducto)
						.addComponent(jLabelNombreProducto)
						.addComponent(lblpeso)
						.addComponent(lbllineasDeCdigo)
						.addComponent(lblidCliente)
						.addComponent(lblid))
					.addGap(39)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_Activo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addGroup(PanelReadProductoLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
							.addComponent(botonBuscarProducto, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addComponent(textFieldIdCliente, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(textFieldLDC, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(textFieldPeso, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addGroup(PanelReadProductoLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(rdbtnSoftware)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addComponent(rdbtnHardware)
							.addGap(20))
						.addComponent(jTextFieldNombreReadProducto, 198, 198, Short.MAX_VALUE))
					.addGap(60))
		);
		PanelReadProductoLayout.setVerticalGroup(
			PanelReadProductoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelReadProductoLayout.createSequentialGroup()
					.addGap(8)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblid)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonBuscarProducto, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreReadProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProducto))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniProducto)
						.addComponent(rdbtnSoftware)
						.addComponent(rdbtnHardware))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblpeso)
						.addComponent(textFieldPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldLDC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbllineasDeCdigo))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblidCliente)
						.addComponent(textFieldIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActivo)
						.addComponent(textField_Activo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(384, Short.MAX_VALUE))
		);
		PanelReadProducto.setLayout(PanelReadProductoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelReadProducto.setVisible(true);
        pack();
		return PanelReadProducto;
	}

}
