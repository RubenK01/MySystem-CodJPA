/**
 * 
 */
package MySystemJPA.Presentacion.JPrincipal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import MySystemJPA.Presentacion.Cliente.VistaGeneralCliente;
import MySystemJPA.Presentacion.Producto.VistaGeneralProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class JPrincipalMySystem extends JFrame {

	private JTabbedPane PanelPestañas;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel PanelPrincipal;
//	/** 
//	 * <!-- begin-UML-doc -->
//	 * <!-- end-UML-doc -->
//	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
//	 */
	private VistaGeneralCliente PanelCliente;
//	
	private VistaGeneralProducto PanelProducto;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public JPrincipalMySystem() {
		// begin-user-code
		// LOGO Y TÍTULO
		super("MySystem");

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
		initPanelOperaciones();

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initPanelOperaciones() {
		// begin-user-code

		PanelPrincipal = new javax.swing.JPanel();
		PanelPestañas = new javax.swing.JTabbedPane();
		PanelCliente = new VistaGeneralCliente();
		PanelProducto = new VistaGeneralProducto();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

		PanelPestañas.setBackground(new java.awt.Color(204, 204, 204));
		PanelPestañas.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255,
						102, 0), new java.awt.Color(255, 102, 0),
				new java.awt.Color(255, 102, 0),
				new java.awt.Color(255, 102, 0)));
		PanelPestañas.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

		PanelPestañas.addTab("Cliente", PanelCliente);
		PanelPestañas.addTab("Producto", PanelProducto);

		
		javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(
				PanelPrincipal);
		PanelPrincipal.setLayout(PanelPrincipalLayout);
		PanelPrincipalLayout.setHorizontalGroup(PanelPrincipalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
				.addGroup(
						PanelPrincipalLayout.createSequentialGroup()
								.addContainerGap().addComponent(PanelPestañas)
								.addContainerGap()));
		PanelPrincipalLayout.setVerticalGroup(PanelPrincipalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
				.addGroup(
						PanelPrincipalLayout.createSequentialGroup()
								.addContainerGap().addComponent(PanelPestañas)
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.CENTER).addGroup(
				layout.createSequentialGroup().addContainerGap()
						.addComponent(PanelPrincipal).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.CENTER).addGroup(
				layout.createSequentialGroup().addContainerGap()
						.addComponent(PanelPrincipal).addContainerGap()));

		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		// end-user-code
	}
}