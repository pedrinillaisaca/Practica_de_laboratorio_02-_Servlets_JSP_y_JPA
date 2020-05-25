package ec.edu.ups.jpa;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.entidad.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {

	public JPATelefonoDAO() {
		super(Telefono.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Telefono findbyTelefonoId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
