package Gym.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Gym.Models.Gimnacio;
import utils.MySQLConexion;

public class GestionGym {

	public Gimnacio ObtenerGym(Gimnacio gimnacio) {
		
		Gimnacio gym = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "SELECT * FROM `gym_detail` WHERE `id` = ?";
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, gimnacio.getId());
			rs=pst.executeQuery();
			
			while(rs.next()) {
				gym = new Gimnacio(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error obteniendo el Gimnacio");
		}
		
		return gym;
	}
}
