package ec.edu.ups.entidad;

import java.io.Serializable;


import javax.persistence.*;



/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private int level;
	private String numero="";
	private String tipo="";
	private String operadora="";
	@ManyToOne
	@JoinColumn
	private Usuario usuario;

	public Telefono(String numero, String tipo, String operadora, Usuario usuario) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.operadora = operadora;
		this.usuario=usuario;
	}

	public Telefono() {
		
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}


	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", level=" + level + ", numero=" + numero + ", tipo=" + tipo + ", operadora="
				+ operadora + "]";
	}
	

	
	
	
}