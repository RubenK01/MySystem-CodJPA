/**
 * 
 */
package MySystemJPA.Negocio.Cliente;

import java.util.List;
import java.util.Set;
import MySystemJPA.Negocio.Producto.Producto;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@Entity
@Table(name="Cliente")
@NamedQueries({
	@NamedQuery(name = "Negocio.Cliente.Cliente.findByDNI", query = "select obj from Cliente obj where obj.dni = :DNI"),
	@NamedQuery(name = "Negocio.Cliente.Cliente.findAll", query = "select data from Cliente data")
	})
public class Cliente  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9067236847639457598L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy="cliente")
	private List<Producto> productos;
	
	private String nombre;
	
	@Column(unique=true)
	private String dni;
	
	private Boolean activo;
	
	@Version
	protected int version;

	public void Cliente() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}