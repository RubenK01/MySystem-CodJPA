/**
 * 
 */
package MySystemJPA.Negocio.Cliente;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;
import MySystemJPA.Negocio.Producto.Producto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAClienteImp implements SACliente {


	@Override
	public Cliente readCliente(Cliente cl) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cliente miCliente = null;
		if(et != null){
			et.begin();
			
			miCliente = em.find(Cliente.class, cl.getId(), LockModeType.OPTIMISTIC);
			
			if(miCliente != null){
				et.commit();
			}
			else{
				et.rollback();
			}
		}
		
		em.close();
		emf.close();
		
		
		return miCliente;
	}

	@Override
	public Boolean updateCliente(Cliente cl) throws ExcepcionNegocio {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cliente miCliente = null;
		Boolean resul = false;
		
		if(et != null){
			et.begin();
			
			Query query = em.createNamedQuery("Negocio.Cliente.Cliente.findByDNI").setParameter("DNI", cl.getDni());
			List<Cliente> l = query.getResultList();
			
			if(l.size()>0 && l.get(0).getId()!=cl.getId()){
				et.rollback();
			}
			else {
				miCliente = em.find(Cliente.class, cl.getId(), LockModeType.OPTIMISTIC);
				
				if(cl.getActivo() == false) {
					Boolean prodInactivos = true;
					
					for(Producto prod : miCliente.getProductos()) {
						if(prod.getActivo())
							prodInactivos = false;
					}
					
					if(prodInactivos) {
						if(miCliente != null){
							miCliente.setActivo(cl.getActivo());
							miCliente.setDni(cl.getDni());
							miCliente.setNombre(cl.getNombre());
							resul = true;
							et.commit();
						}
						else{
							et.rollback();
						}
					}
					else {
						et.rollback();
						throw new ExcepcionNegocio("No se puede dar de baja el cliente (" + miCliente.getId()+") porque tiene productos activos asociados.");
					}
				}
				else {
					if(miCliente != null){
						miCliente.setActivo(cl.getActivo());
						miCliente.setDni(cl.getDni());
						miCliente.setNombre(cl.getNombre());
						resul = true;
						et.commit();
					}
					else{
						et.rollback();
					}
				}
			}
			
			
		}
		
		em.close();
		emf.close();
		
		
		return resul;
	}

	@Override
	public Boolean deleteCliente(Cliente cl) throws ExcepcionNegocio {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cliente miCliente = null;
		Boolean resul = false;
		
		if(et != null){
			et.begin();
			
			miCliente = em.find(Cliente.class, cl.getId(), LockModeType.OPTIMISTIC);
			
			if(miCliente != null){
				Boolean prodInactivos = true;
				
				for(Producto prod : miCliente.getProductos()) {
					if(prod.getActivo())
						prodInactivos = false;
				}
				
				if(prodInactivos) {
					miCliente.setActivo(false);
					resul = true;
					et.commit();
				}
				else {
					et.rollback();
					throw new ExcepcionNegocio("No se puede dar de baja el cliente (" + miCliente.getId()+") porque tiene productos activos asociados.");
				}
				
				
			}
			else{
				et.rollback();
			}
		}
		
		em.close();
		emf.close();
		
		
		return resul;
	}

	@Override
	public ArrayList<Cliente> readAllCliente() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		ArrayList<Cliente> resul = new ArrayList();
		
		if(et != null){
			et.begin();
			
			Query query = em.createNamedQuery("Negocio.Cliente.Cliente.findAll");
			 List<Cliente> l = query.getResultList();
			
			if(l.size()>0) {
				for(Cliente cl : l)
					resul.add(cl);
				
				et.commit();
			}
			else 
				et.rollback();
		}
		
		em.close();
		emf.close();
		
		
		return resul;
	}

	@Override
	public double calculaCoste(Cliente cl) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Double resul = -1.0;
		Cliente miCliente = null;
		
		if(et != null) {
			et.begin();
			
			 miCliente = em.find(Cliente.class, cl.getId(), LockModeType.OPTIMISTIC);
			if (miCliente != null && miCliente.getActivo()) {
				resul = 0.0;
				
				List<Producto> misProductos = miCliente.getProductos();
				
				for(Producto prod : misProductos) {
					em.lock(prod, LockModeType.OPTIMISTIC);
					
					if(prod.getActivo())
						resul += prod.calculaPrecio();
				}
				et.commit();
			}
			else {
				et.rollback();
			}
			
		}
		em.close();
		emf.close();
		
		return resul;
	}

	@Override
	public int createCliente(Cliente cl) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cliente miCliente = null;
		int resul = -1;
		
		if(et != null){
			et.begin();
			
			Query query = em.createNamedQuery("Negocio.Cliente.Cliente.findByDNI").setParameter("DNI", cl.getDni());
			List<Cliente> l = query.getResultList();
			
			if(l.size()>0){
				if(l.get(0).getActivo()) {
					et.rollback();
				}
				else {
					
					miCliente = l.get(0);
					
					em.lock(miCliente,LockModeType.OPTIMISTIC);
					
					miCliente.setActivo(true);
					miCliente.setDni(cl.getDni());
					miCliente.setNombre(cl.getNombre());
					
					resul = 0;
					
					et.commit();
				}
			}
			else{
				miCliente = new Cliente();
				miCliente.setActivo(true);
				miCliente.setDni(cl.getDni());
				miCliente.setNombre(cl.getNombre());
				
				em.persist(miCliente);
				et.commit();
				
				resul = miCliente.getId();
			}	
		}

		em.close();
		emf.close();
		return resul;
	}
}