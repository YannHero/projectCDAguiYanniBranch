package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.AdministrateursBean;

public class AdministrateursDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(AdministrateursBean administrateur) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO administrateurs (nom, email, motDePasse, privileges)VALUES (?,?,PASSWORD(?),?)");

			statement.setString(1, administrateur.getNom());
			statement.setString(2, administrateur.getEmail());
			statement.setString(3, administrateur.getMotDePasse());
			statement.setString(4, administrateur.getPrivileges());
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<AdministrateursBean> read() {
		ArrayList<AdministrateursBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from administrateurs");
			result = statement.executeQuery();
			while (result.next()) {
				
				colsval.add(new AdministrateursBean(
						result.getInt("idAdministrateur"),
						result.getString("nom"),
						result.getString("email"),
						result.getString("privileges")		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(AdministrateursBean Administrateur) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE administrateurs SET nom = ?, email = ?, motDePasse = PASSWORD(?), privileges = ? WHERE idAdministrateur = ?");
			statement.setString(1, Administrateur.getNom());
			statement.setString(2, Administrateur.getEmail());
			statement.setString(3, Administrateur.getMotDePasse());
			statement.setString(4, Administrateur.getMotDePasse());
			statement.setInt(5, Administrateur.getIdAdministrateur());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(AdministrateursBean Administrateur) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE administrateurs WHERE idAdministrateur = ?");
			statement.setInt(1, Administrateur.getIdAdministrateur());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
