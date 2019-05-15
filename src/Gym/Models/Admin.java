package Gym.Models;

public class Admin {

	private String Nombre;
	private String Password;
	
	public Admin(String nombre, String password) {
		
		this.Nombre = nombre;
		this.Password = password;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
