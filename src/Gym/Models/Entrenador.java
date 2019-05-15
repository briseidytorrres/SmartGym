package Gym.Models;

public class Entrenador 
{
	
	private int ID_ent;
	private String Gimnasio_ent;
	private String Nombre_ent;
	private String Genero_ent;
	
	public Entrenador(int iD_ent, String gimnasio_ent, String nombre_ent, String genero_ent) 
	{
		this.ID_ent = iD_ent;
		this.Gimnasio_ent = gimnasio_ent;
		this.Nombre_ent = nombre_ent;
		this.Genero_ent = genero_ent;
	}

	public int getID_ent() {
		return ID_ent;
	}

	public void setID_ent(int iD_ent) {
		ID_ent = iD_ent;
	}

	public String getGimnasio_ent() {
		return Gimnasio_ent;
	}

	public void setGimnasio_ent(String gimnasio_ent) {
		Gimnasio_ent = gimnasio_ent;
	}

	public String getNombre_ent() {
		return Nombre_ent;
	}

	public void setNombre_ent(String nombre_ent) {
		Nombre_ent = nombre_ent;
	}

	public String getGenero_ent() {
		return Genero_ent;
	}

	public void setGenero_ent(String genero_ent) {
		Genero_ent = genero_ent;
	}
		
	
}
