/**
 * 
 */
package MySystemJPA.Negocio.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@DiscriminatorValue("software")
@Entity
public class Software extends Producto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
	
	private int lineasDeCodigo;
	
	public Software() {}

	@Override
	public double calculaPrecio() {
		// TODO Auto-generated method stub
		return this.lineasDeCodigo * 0.5;
	}

//	public int getId() {
//		return id;
//	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public int getLineasDeCodigo() {
		return lineasDeCodigo;
	}

	public void setLineasDeCodigo(int lineasDeCodigo) {
		this.lineasDeCodigo = lineasDeCodigo;
	}

	
}