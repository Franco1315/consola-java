package banco.copia;

public class Clientes{

	private Integer id;
	private String usuario;
	private String password;
	private String correo;
	
	public Clientes() {
		
	}

	public Clientes(Integer id, String usuario, String password, String correo) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String toString() {
		return "Gestor{id: " + this.id + ", usuario: " + this.usuario + "}";
	}

	public boolean equals(Object o) {
		Clientes c = (Clientes) o;
		boolean mismoId = this.id == c.id;
		return mismoId;
	}
	
}
