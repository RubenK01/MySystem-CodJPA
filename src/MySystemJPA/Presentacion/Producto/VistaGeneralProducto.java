package MySystemJPA.Presentacion.Producto;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import MySystemJPA.Presentacion.Producto.VentanaCreateProducto;
import MySystemJPA.Presentacion.Producto.VentanaDeleteProducto;
import MySystemJPA.Presentacion.Producto.VentanaReadAllProducto;
import MySystemJPA.Presentacion.Producto.VentanaReadProducto;
import MySystemJPA.Presentacion.Producto.VentanaUpdateProducto;

@SuppressWarnings("serial")
public class VistaGeneralProducto  extends JPanel{
	private JButton botonAltaProducto;
	
	private JButton botonBajaProducto;
	
	private JButton botonListarProducto;
	
	private JButton botonModificarProducto;
	
	private JButton botonDetalleProducto;
	
	private JButton botonProductosPorProyecto;
	
	private JPanel PanelDerecha;
	
	private JPanel PanelBotones;

	public VistaGeneralProducto() {
		// begin-user-code
		initComponents();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initComponents() {
		// begin-user-code
		botonAltaProducto = new javax.swing.JButton();
		botonBajaProducto = new javax.swing.JButton();
		botonListarProducto = new javax.swing.JButton();
		botonProductosPorProyecto = new javax.swing.JButton();
		botonModificarProducto = new javax.swing.JButton();
		botonDetalleProducto = new javax.swing.JButton();
		PanelDerecha = new javax.swing.JPanel();
		PanelBotones = new javax.swing.JPanel();

		botonAltaProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonAltaProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonAltaProducto.setText("Alta");
		botonAltaProducto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonAltaProducto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAltaProductoActionPerformed(evt);
					}
				});

		botonBajaProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonBajaProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonBajaProducto.setText("Baja");
		botonBajaProducto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonBajaProducto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonBajaProductoActionPerformed(evt);
					}
				});

		botonModificarProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonModificarProducto
				.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonModificarProducto.setText("Modificar");
		botonModificarProducto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonModificarProducto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonModificarProductoActionPerformed(evt);
					}
				});

		botonDetalleProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonDetalleProducto.setFont(new java.awt.Font("Comic Sans MS", 1,
				14)); // NOI18N
		botonDetalleProducto.setText("Ver Detalles");
		botonDetalleProducto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonDetalleProducto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonDetallesProductoActionPerformed(evt);
					}
				});

		botonListarProducto.setBackground(new java.awt.Color(255, 102, 0));
		botonListarProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonListarProducto.setText("Listar");
		botonListarProducto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonListarProducto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarProductoActionPerformed(evt);
					}
				});
		
		
		botonProductosPorProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonProductosPorProyecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonProductosPorProyecto.setText("ProductosByEmp");
		botonProductosPorProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonProductosPorProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarProductosPorProyectoActionPerformed(evt);
					}
				});


		javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(
				PanelBotones);
		PanelBotones.setLayout(PanelBotonesLayout);
		PanelBotonesLayout
				.setHorizontalGroup(PanelBotonesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 167, Short.MAX_VALUE)
						.addGroup(
								PanelBotonesLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PanelBotonesLayout
														.createSequentialGroup()
														.addGap(19, 19, 19)
														.addGroup(
																PanelBotonesLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				botonProductosPorProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonListarProducto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonDetalleProducto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonModificarProducto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonBajaProducto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonAltaProducto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE))
														.addContainerGap(19,
																Short.MAX_VALUE))));
		PanelBotonesLayout
				.setVerticalGroup(PanelBotonesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 510, Short.MAX_VALUE)
						.addGroup(
								PanelBotonesLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PanelBotonesLayout
														.createSequentialGroup()
														.addGap(76, 76, 76)
														.addComponent(
																botonAltaProducto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonBajaProducto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonModificarProducto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonDetalleProducto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonListarProducto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonProductosPorProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addContainerGap(185,
																Short.MAX_VALUE))));

		javax.swing.GroupLayout PanelDerechaLayout = new javax.swing.GroupLayout(
				PanelDerecha);
		PanelDerecha.setLayout(PanelDerechaLayout);
		PanelDerechaLayout.setHorizontalGroup(PanelDerechaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 608, Short.MAX_VALUE));
		PanelDerechaLayout.setVerticalGroup(PanelDerechaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 452, Short.MAX_VALUE));

		javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(
				this);
		this.setLayout(PanelProductoLayout);
		PanelProductoLayout.setHorizontalGroup(PanelProductoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						PanelProductoLayout
								.createSequentialGroup()
								.addGap(31, 31, 31)
								.addComponent(PanelBotones,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(PanelDerecha,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(22, Short.MAX_VALUE)));
		PanelProductoLayout
				.setVerticalGroup(PanelProductoLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								PanelProductoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												PanelProductoLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																PanelBotones,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																PanelProductoLayout
																		.createSequentialGroup()
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				PanelDerecha,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonAltaProductoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaCreateProducto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonBajaProductoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaDeleteProducto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonDetallesProductoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadProducto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonListarProductoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadAllProducto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
	
	protected void botonListarProductosPorProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaProductosByCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonModificarProductoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaUpdateProducto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
}