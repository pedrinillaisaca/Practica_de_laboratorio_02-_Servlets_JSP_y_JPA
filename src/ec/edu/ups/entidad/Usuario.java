package ec.edu.ups.entidad;

import java.io.Serializable;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int level;
	private String cedula;
	private String nombre;
	private String apellido;
	@Column(name="usu_correo",unique = true, nullable = false)
	private String correo;
	private String contrasenia;
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "usuario")
	private Set<Telefono> telefonos;
	
	public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasenia = contrasenia;
		telefonos=new HashSet<Telefono>();

	}

	public Usuario() {
		telefonos=new HashSet<Telefono>();
	}
	
	

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
		
	

	public Set<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void  addTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}
	
	public void removeTelefono(Telefono telefono) {
		this.telefonos.remove(telefono);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correo=" + correo + ", contrasenia=" + contrasenia + ", telefonos=" + telefonos + "]";
	}

	
	
	

	


	
	
	
	
   
}
