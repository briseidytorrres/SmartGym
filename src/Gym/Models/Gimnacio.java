package Gym.Models;

public class Gimnacio {
	private int id;
	private String Nombre ;
	private String Direccion;
	
	public Gimnacio(int id, String nombre, String direccion) {
		super();
		this.id = id;
		Nombre = nombre;
		Direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
}
