package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.CoordonneesBean;

public class CoordonneesDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(CoordonneesBean coordonnees) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO coordonnees (nom, adresse, telephone, email,logo)VALUES (?,?,?,?,?)");

			statement.setString(1, coordonnees.getNom());
			statement.setString(2, coordonnees.getAdresse());
			statement.setString(3, coordonnees.getTelephone());
			statement.setString(4, coordonnees.getEmail());
			statement.setString(5, coordonnees.getLogo());
			
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<CoordonneesBean> read() {
		ArrayList<CoordonneesBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from coordonnees");
			result = statement.executeQuery();
			while (result.next()) {
			
				colsval.add(new CoordonneesBean(
						result.getInt("idCoordonnee"),
						result.getString("nom"),
						result.getString("adresse"),
						result.getString("telephone"),
						result.getString("email"),	
						result.getString("logo")		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(CoordonneesBean coordonnees) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE coordonnees SET nom = ?, adresse = ?, telephone =?, email =?, logo =? WHERE idCoordonnee = ?");
			statement.setString(1, coordonnees.getNom());
			statement.setString(2, coordonnees.getAdresse());
			statement.setString(3, coordonnees.getTelephone());
			statement.setString(4, coordonnees.getEmail());
			statement.setString(5, coordonnees.getLogo());
			statement.setInt(5, coordonnees.getIdCoordonnee());
		
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(CoordonneesBean coordonnees) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE coordonnees WHERE idCoordonnee = ?");
			statement.setInt(1, coordonnees.getIdCoordonnee());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
