package ec.edu.ups.dao;

import ec.edu.ups.entidad.Telefono;


public interface TelefonoDAO extends GenericDAO<Telefono, Integer>{

	Telefono findbyTelefonoId(Integer id);
	
	
	

}
