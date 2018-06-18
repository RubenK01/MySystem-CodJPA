/**
 * 
 */
package MySystemJPA.Negocio.Producto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import MySystemJPA.Negocio.Cliente.Cliente;

@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipoProducto")
@Entity
@Table(name="Producto")
@NamedQueries({
	@NamedQuery(name = "Negocio.Producto.Producto.findByName", query = "select obj from Producto obj where obj.nombre = :NAME"),
	@NamedQuery(name = "Negocio.Producto.Producto.findAll", query = "select data from Producto data")
	})
public abstract class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5548600898342669381L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Cliente cliente;
	
	@Column(unique=true)
	private String nombre;
	
	private String tipoProducto;
	
	private Boolean activo;
	
	@Version
	protected int version;

	
	public Producto() {}
	
	public Producto(int id) {
		this.id = id;
	}
	
	public abstract double calculaPrecio();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipoProducto() {
		return tipoProducto;
	}


	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	public Boolean getActivo() {
		return activo;
	}


	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	
}