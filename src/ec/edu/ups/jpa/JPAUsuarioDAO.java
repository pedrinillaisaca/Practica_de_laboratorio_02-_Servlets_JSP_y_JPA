package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Telefono;
import ec.edu.ups.entidad.Usuario;


public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO{
	
	public JPAUsuarioDAO() {
		super(Usuario.class);
	}

	@Override
	public List<Usuario> getByLevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByCedula(String criterio) {
		
		String jpql="SELECT u FROM Usuario u WHERE u.cedula='"+criterio+"'";
		Query query=em.createQuery(jpql);
		Usuario u=(Usuario) query.getSingleResult();
		
		String jpql2="SELECT t FROM Telefono t WHERE t.usuario.id="+u.getId();
		List<?> tele= em.createQuery(jpql2).getResultList();
		Set<Telefono> t=new HashSet<Telefono>();
		for (int i = 0; i < tele.size(); i++) {			
			t.add((Telefono) tele.get(i));
		}
			u.setTelefonos(t);
		return u;
	}

	@Override
	public Usuario findByCorreo(String correo) {
		
		String jpql="SELECT u FROM Usuario u WHERE u.correo='"+correo+"'";
		Query query=em.createQuery(jpql);
		Usuario u=(Usuario) query.getSingleResult();
		
		String jpql2="SELECT t FROM Telefono t WHERE t.usuario.id="+u.getId();
		List<?> tele= em.createQuery(jpql2).getResultList();
		Set<Telefono> t=new HashSet<Telefono>();
		for (int i = 0; i < tele.size(); i++) {			
			t.add((Telefono) tele.get(i));
		}
			u.setTelefonos(t);
		return u;
	}

	@Override
	public List<Usuario> findAllUsers() {
		/**
		 * Este es un metodo que recupera todos los usuarios del 
		 * sistema con sus respectivos telefonos
		 */
		
		String jpql="SELECT u FROM Usuario u";
		List<?> usuarios=em.createQuery(jpql).getResultList();
		List<Usuario> usrs=new ArrayList<Usuario>();
		for (int i = 0; i < usuarios.size(); i++) {
			Usuario u=(Usuario) usuarios.get(i);
			usrs.add(findByIdUser(u.getId()));//redundacia necesaria para recuperar los telefonos		
		}
					
		return usrs;
	}

	@Override
	public Usuario findByIdUser(Integer Id) {
		String jpql="SELECT u FROM Usuario u WHERE u.id="+Id;
		Query query=em.createQuery(jpql);
		Usuario u=(Usuario) query.getSingleResult();
		
		String jpql2="SELECT t FROM Telefono t WHERE t.usuario.id="+u.getId();
		List<?> tele= em.createQuery(jpql2).getResultList();
		Set<Telefono> t=new HashSet<Telefono>();
		for (int i = 0; i < tele.size(); i++) {			
			t.add((Telefono) tele.get(i));
		}
			u.setTelefonos(t);
		return u;
	}

	

	

	

}
