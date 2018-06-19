package MySystemJPA.Presentacion.Producto;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import MySystemJPA.Negocio.Producto.Producto;
import MySystemJPA.Negocio.Producto.Software;
import MySystemJPA.Presentacion.Controlador.Contexto;
import MySystemJPA.Presentacion.Controlador.Controlador;
import MySystemJPA.Presentacion.Controlador.EventoGUI;

public class VentanaDeleteProductoImp extends VentanaDeleteProducto{
	private JPanel PanelDeleteProducto;
    private JButton botonAceptarDeleteProducto;
    private JLabel lblIdProducto;
    private JTextField textFieldIdProducto;

	@Override
	public void update(Object datos) {
		if (datos != null){
			JOptionPane.showMessageDialog(null, "Producto borrado con exito.");
			PanelDeleteProducto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Producto buscado o ya está dado de baja.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelDeleteProducto = new javax.swing.JPanel();
		botonAceptarDeleteProducto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelDeleteProducto.setAlignmentX(1.0F);
		PanelDeleteProducto.setAlignmentY(1.0F);
		PanelDeleteProducto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelDeleteProducto.setName("");
		
		botonAceptarDeleteProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarDeleteProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarDeleteProducto.setText("Aceptar");
		botonAceptarDeleteProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		textFieldIdProducto = new JTextField();
		textFieldIdProducto.setColumns(10);
		
		lblIdProducto = new JLabel("Id Producto:");
		
		botonAceptarDeleteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdProducto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Producto' es obligatorio.");
    				textFieldIdProducto.requestFocus();
    			}
            	Producto trProducto = new Software();
            	
            	trProducto.setId(Integer.parseInt(textFieldIdProducto.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.COMANDO_DELETE_PRODUCTO, trProducto);
   				Controlador.getInstance().accion(context);	        
            }
        });

		javax.swing.GroupLayout PanelDeleteProductoLayout = new javax.swing.GroupLayout(PanelDeleteProducto);
		PanelDeleteProductoLayout.setHorizontalGroup(
			PanelDeleteProductoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelDeleteProductoLayout.createSequentialGroup()
					.addGap(178)
					.addComponent(lblIdProducto)
					.addGap(18)
					.addGroup(PanelDeleteProductoLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldIdProducto, Alignment.TRAILING)
						.addComponent(botonAceptarDeleteProducto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addGap(60))
		);
		PanelDeleteProductoLayout.setVerticalGroup(
			PanelDeleteProductoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelDeleteProductoLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(PanelDeleteProductoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdProducto))
					.addGap(197)
					.addComponent(botonAceptarDeleteProducto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelDeleteProducto.setLayout(PanelDeleteProductoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelDeleteProducto.setVisible(true);
        pack();
		return PanelDeleteProducto;
	}

}
