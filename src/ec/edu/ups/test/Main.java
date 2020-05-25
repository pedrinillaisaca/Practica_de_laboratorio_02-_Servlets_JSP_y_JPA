package ec.edu.ups.test;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Telefono;
import ec.edu.ups.entidad.Usuario;

public class Main {

	public static void main(String[] args) {

		UsuarioDAO usd = DAOFactory.getFactory().getUsuarioDAO();

//		Usuario u = new Usuario("0106655517", "pedro", "illaisaca", "pedro@illaisaca", "pedrin");
//		Telefono t1 = new Telefono("0994090599", "movil", "tuenti", u);
//		u.addTelefono(t1);
//		u.addTelefono(new Telefono("0994090500", "movil", "movistar", u));
//		u.addTelefono(new Telefono("0994090100", "movil", "claro", u));
//		usd.create(u);
//
//		Usuario u2 = new Usuario("0106655516", "natalya", "deleg", "natu@illaisaca", "pedrin");
//		Telefono t2 = new Telefono("0994090200", "fijo", "tuenti", u2);
//		u.addTelefono(t2);
//		u.addTelefono(new Telefono("0994090202", "movil", "movistar", u2));
//		u.addTelefono(new Telefono("0994090203", "movil", "claro", u2));
//		usd.create(u2);

		// System.out.println(usd.read(1));
		// u.removeTelefono(t1);
		// usd.update(u);
		

		//System.out.println(usd.read(1));
		
		TelefonoDAO telefonoDAO=DAOFactory.getFactory().getTelefonoDAO();
		
		
		List<Usuario> u=usd.find();
		
		System.out.println(u);
		
//		/*editar telefono*/
//		Telefono t=telefonoDAO.read(3);
//		System.out.println(t);
//		t.setNumero("2837471293847192");	
//		Usuario u=usd.findByCedula("0106655517");
//		u.addTelefono(t);
//		usd.update(u);
		
//		/*agregar Telefono*/
//		Usuario u=usd.findByCedula("0106655517");
//		Telefono t=new Telefono("2394532345","fijo","cnt",u);
//		telefonoDAO.update(t);		
//		System.out.println(usd.findByCedula("0106655517"));
		
		
		
		Telefono teledit=telefonoDAO.read(2);
		teledit.setNumero("aefskd");
		teledit.setOperadora("ersdafc");
		teledit.setTipo("sdfxc");
		telefonoDAO.update(teledit);
		
		
		System.out.println(usd.findByCedula("0106655517"));
		
		
	}

}
