package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidad.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	
	public List<Usuario> getByLevel(int level);

	public Usuario findByCedula(String cedula);

	public Usuario findByCorreo(String correo);
	
	public Usuario findByIdUser(Integer Id);

	public List<Usuario> findAllUsers();

	
	

}
