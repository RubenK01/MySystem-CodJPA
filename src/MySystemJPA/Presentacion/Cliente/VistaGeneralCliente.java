package MySystemJPA.Presentacion.Cliente;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VistaGeneralCliente extends JPanel{
	private JButton botonAltaCliente;
	
	private JButton botonBajaCliente;
	
	private JButton botonListarCliente;
	
	private JButton botonModificarCliente;
	
	private JButton botonDetalleCliente;
	
	private JButton botonCalculaCoste;
	
	private JPanel PanelDerecha;
	
	private JPanel PanelBotones;

	public VistaGeneralCliente() {
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
		botonAltaCliente = new javax.swing.JButton();
		botonBajaCliente = new javax.swing.JButton();
		botonListarCliente = new javax.swing.JButton();
		botonCalculaCoste = new javax.swing.JButton();
		botonModificarCliente = new javax.swing.JButton();
		botonDetalleCliente = new javax.swing.JButton();
		PanelDerecha = new javax.swing.JPanel();
		PanelBotones = new javax.swing.JPanel();

		botonAltaCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonAltaCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonAltaCliente.setText("Alta");
		botonAltaCliente
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonAltaCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAltaClienteActionPerformed(evt);
					}
				});

		botonBajaCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonBajaCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonBajaCliente.setText("Baja");
		botonBajaCliente
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonBajaCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonBajaClienteActionPerformed(evt);
					}
				});

		botonModificarCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonModificarCliente
				.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonModificarCliente.setText("Modificar");
		botonModificarCliente
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonModificarCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonModificarClienteActionPerformed(evt);
					}
				});

		botonDetalleCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonDetalleCliente.setFont(new java.awt.Font("Comic Sans MS", 1,
				14)); // NOI18N
		botonDetalleCliente.setText("Ver Detalles");
		botonDetalleCliente
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonDetalleCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonDetallesClienteActionPerformed(evt);
					}
				});

		botonListarCliente.setBackground(new java.awt.Color(255, 102, 0));
		botonListarCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonListarCliente.setText("Listar");
		botonListarCliente
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonListarCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarClienteActionPerformed(evt);
					}
				});
		
		
		botonCalculaCoste.setBackground(new java.awt.Color(255, 102, 0));
		botonCalculaCoste.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonCalculaCoste.setText("Calcula Coste");
		botonCalculaCoste
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonCalculaCoste
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonCalculaCosteActionPerformed(evt);
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
																				botonCalculaCoste,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonListarCliente,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonDetalleCliente,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonModificarCliente,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonBajaCliente,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonAltaCliente,
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
																botonAltaCliente,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonBajaCliente,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonModificarCliente,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonDetalleCliente,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonListarCliente,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonCalculaCoste,
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

		javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(
				this);
		this.setLayout(PanelClienteLayout);
		PanelClienteLayout.setHorizontalGroup(PanelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						PanelClienteLayout
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
		PanelClienteLayout
				.setVerticalGroup(PanelClienteLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								PanelClienteLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												PanelClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																PanelBotones,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																PanelClienteLayout
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
	protected void botonAltaClienteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaCreateCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonBajaClienteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaDeleteCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonDetallesClienteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonListarClienteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadAllCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
	
	protected void botonListarClientesPorProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		//PanelDerecha.add(VentanaReadClientesByProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonModificarClienteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaUpdateCliente.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
	
	protected void botonCalculaCosteActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaCalculaCoste.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
}
