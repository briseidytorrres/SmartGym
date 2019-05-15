package Gym.Models;

public class Cliente 
{
	private int ID;
	private String Gimnasio_cli;
	private String Nombre_cli;
	private String Genero_cli;
	private String Turno_cli;
	private String Area_cli;
	
	public Cliente(int iD, String gimnasio_cli, String nombre_cli, String genero_cli, String turno_cli,
			String area_cli) 
	{
		this.ID = iD;
		this.Gimnasio_cli = gimnasio_cli;
		this.Nombre_cli = nombre_cli;
		this.Genero_cli = genero_cli;
		this.Turno_cli = turno_cli;
		this.Area_cli = area_cli;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getGimnasio_cli() {
		return Gimnasio_cli;
	}
	public void setGimnasio_cli(String gimnasio_cli) {
		Gimnasio_cli = gimnasio_cli;
	}
	public String getNombre_cli() {
		return Nombre_cli;
	}
	public void setNombre_cli(String nombre_cli) {
		Nombre_cli = nombre_cli;
	}
	public String getGenero_cli() {
		return Genero_cli;
	}
	public void setGenero_cli(String genero_cli) {
		Genero_cli = genero_cli;
	}
	public String getTurno_cli() {
		return Turno_cli;
	}
	public void setTurno_cli(String turno_cli) {
		Turno_cli = turno_cli;
	}
	public String getArea_cli() {
		return Area_cli;
	}
	public void setArea_cli(String area_cli) {
		Area_cli = area_cli;
	}
		
}
