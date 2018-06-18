/**
 * 
 */
package MySystemJPA.Negocio.Producto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@DiscriminatorValue("hardware")
@Entity
public class Hardware extends Producto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double peso;

	public Hardware() {}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public double calculaPrecio() {
		
		return this.peso * 10;
	}
	
}