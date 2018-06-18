/**
 * 
 */
package MySystemJPA.Negocio.Producto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import MySystemJPA.Negocio.Cliente.Cliente;
import MySystemJPA.Negocio.ExcepcionNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAProductoImp implements SAProducto {

	@Override
	public int createProducto(Producto prod) throws ExcepcionNegocio {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Producto miProducto = null;
		int resul = -1;
		
		if(et != null){
			et.begin();
			
			Query query = em.createNamedQuery("Negocio.Producto.Producto.findByName").setParameter("NAME", prod.getNombre());
			List<Producto> l = query.getResultList();
			
			if(l.size()>0){
				miProducto = l.get(0);

				resul = 0;
			}

			Cliente cl = em.find(Cliente.class, prod.getCliente().getId(), LockModeType.OPTIMISTIC_FORCE_INCREMENT) ;
			
			if(cl != null && !cl.getActivo()) {
				et.rollback();
				throw new ExcepcionNegocio("El Cliente asociado a este producto debe estar dado de alta.");
			}
			else {
				if (miProducto != null) {
					if(miProducto.getActivo() == false) {
						
						if(cl == null) {
							resul = -2;
							et.rollback();
						}
						else {
							
							if("software".equalsIgnoreCase(prod.getTipoProducto())) {
								try {
									((Software)miProducto).setLineasDeCodigo(((Software)prod).getLineasDeCodigo());
								}
								catch(Exception e) {
									throw new ExcepcionNegocio("El nombre introducido ya existe y es tipo 'Hardware', debe darse de alta con este tipo.");
								}
								
							}
							else if ("hardware".equalsIgnoreCase(prod.getTipoProducto())) {
								try {
									((Hardware)miProducto).setPeso(((Hardware)prod).getPeso());
								}
								catch(Exception e) {
									throw new ExcepcionNegocio("El nombre introducido ya existe y es tipo 'Software', debe darse de alta con este tipo.");
								}
								
							}

							miProducto.setActivo(true);
							miProducto.setNombre(prod.getNombre());
							miProducto.setTipoProducto(prod.getTipoProducto());
							miProducto.setCliente(cl);
							
							resul = 0;
							
							et.commit();
						}
					}
					else {
						et.rollback();
					}
				}
				else {
					if(cl == null) {
						resul = -2;
						et.rollback();
					}
					else {
						if("software".equalsIgnoreCase(prod.getTipoProducto())) {
							miProducto = new Software();
							
							((Software)miProducto).setLineasDeCodigo(((Software)prod).getLineasDeCodigo());
						}
						else if ("hardware".equalsIgnoreCase(prod.getTipoProducto())) {
							miProducto = new Hardware();
							
							((Hardware)miProducto).setPeso(((Hardware)prod).getPeso());
						}
						
						miProducto.setActivo(true);
						miProducto.setNombre(prod.getNombre());
						miProducto.setTipoProducto(prod.getTipoProducto());
						miProducto.setCliente(cl);
						
						em.persist(miProducto);
						et.commit();
						
						
						resul = miProducto.getId();
					}
				}		
			}
		}
		
		em.close();
		emf.close();
		
		return resul;
	}

	@Override
	public Producto readProducto(Producto prod) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Producto miProducto = null;
		
		if(et != null) {
			et.begin();
			
			miProducto = em.find(Producto.class, prod.getId());
			
			if(miProducto != null) {
				et.commit();
			}
			else {
				et.rollback();
			}
		}		

		em.close();
		emf.close();
		
		return miProducto;
	}

	@Override
	public boolean updateProducto(Producto prod) throws ExcepcionNegocio {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Producto miProducto = null;
		boolean resul = false;
		
		if(et != null){
			et.begin();
			
			Cliente cl = em.find(Cliente.class, prod.getCliente().getId(), LockModeType.OPTIMISTIC_FORCE_INCREMENT) ;
			if(cl != null && !cl.getActivo()) {
				et.rollback();
				throw new ExcepcionNegocio("El Cliente asociado a este producto debe estar dado de alta.");
			}
			else {			
				miProducto = em.find(Producto.class, prod.getId());
				if (miProducto != null) {		
					Query query = em.createNamedQuery("Negocio.Producto.Producto.findByName").setParameter("NAME", prod.getNombre());
					List<Producto> l = query.getResultList();
					
					if(l.size() == 0 || l.get(0).getId()==prod.getId()) {
						
						if(cl == null) {
							et.rollback();
						}
						else {
							if(!cl.getActivo() && prod.getActivo()) {
								et.rollback();
								throw new ExcepcionNegocio("El Cliente asociado a este producto debe estar dado de alta.");
								
							}
							else {
								if("software".equalsIgnoreCase(prod.getTipoProducto())) {
									try {
										((Software)miProducto).setLineasDeCodigo(((Software)prod).getLineasDeCodigo());
									}
									catch(Exception e) {
										throw new ExcepcionNegocio("El tipo de producto debe ser 'Hardware'");
									}
									
								}
								else if ("hardware".equalsIgnoreCase(prod.getTipoProducto())) {
									try {
										((Hardware)miProducto).setPeso(((Hardware)prod).getPeso());
									}
									catch(Exception e) {
										throw new ExcepcionNegocio("El tipo de producto debe ser 'Software'");
									}
									
								}	
								
								miProducto.setActivo(prod.getActivo());
								miProducto.setNombre(prod.getNombre());
								miProducto.setTipoProducto(prod.getTipoProducto());
								miProducto.setCliente(cl);
								
								et.commit();
	
								resul = true;
							}
						}
					}
					else {
						et.rollback();
					}
				}
				else {
					et.rollback();
				}
			}	
		}

		em.close();
		emf.close();
		
		return resul;
	}

	@Override
	public boolean deleteProducto(Producto prod) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Producto miProducto = null;
		boolean resul = false;
		
		if(et != null){
			et.begin();
			
			miProducto = em.find(Producto.class, prod.getId());

			if (miProducto != null) {				
					em.lock(miProducto.getCliente(), LockModeType.OPTIMISTIC_FORCE_INCREMENT);
				
					miProducto.setActivo(false);				
					
					et.commit();
					resul = true;
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
	public ArrayList<Producto> readAllProductos() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		ArrayList<Producto> misProductos = new ArrayList<Producto>();
		if(et != null) {
			et.begin();
			
			Query query = em.createNamedQuery("Negocio.Producto.Producto.findAll");
			List<Producto> l = query.getResultList();
			
			for(Producto prod : l) {
				misProductos.add(prod);
			}
			
			et.commit();
			
		}
		

		em.close();
		emf.close();
		
		return misProductos;
	}

	@Override
	public ArrayList<Producto> readProductosByCliente(Producto prod) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySystemJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		ArrayList<Producto> misProductos = new ArrayList<Producto>();
		
		if(et != null) {
			et.begin();
			

			Cliente cl = em.find(Cliente.class, prod.getCliente().getId(), LockModeType.OPTIMISTIC);
			if(cl != null) {
				List<Producto> l =  cl.getProductos();
				
				for(Producto producto : l)
					misProductos.add(producto);
				
				et.commit();
			}
			else {
				et.rollback();
			}
		}
		

		em.close();
		emf.close();
		
		return misProductos;
	}

}