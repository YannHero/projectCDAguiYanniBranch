package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.AdressesLivraisonBean;
import modele.UtilisateursBean;

public class AdressesLivraisonDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(AdressesLivraisonBean adressesLivraison) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO adresseslivraison (idUtilisateur, adresse, codePostale, Ville, Pays)VALUES (?,?,?,?,?)");

			statement.setInt(1, adressesLivraison.getUtilisateur().getIdUtilisateur());
			statement.setString(2, adressesLivraison.getAdresse());
			statement.setInt(3, adressesLivraison.getCodePostale());
			statement.setString(4, adressesLivraison.getville());
			statement.setString(5, adressesLivraison.getpays());
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<AdressesLivraisonBean> read() {
		ArrayList<AdressesLivraisonBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from adresseslivraison");
			result = statement.executeQuery();
			while (result.next()) {
				
				colsval.add(new AdressesLivraisonBean(
						result.getInt("idAdresse"),
						new UtilisateursBean(result.getInt("idUtilisateur")),
						result.getString("adresse"),
						result.getInt("codePostale"),
						result.getString("Ville"),	
						result.getString("Pays")		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(AdressesLivraisonBean adressesLivraison) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE adresseslivraison SET adresse = ?, codePostale = ?, Ville = ?, Pays = ? WHERE idAdresse = ?");
			statement.setString(1, adressesLivraison.getAdresse());
			statement.setInt(2, adressesLivraison.getCodePostale());
			statement.setString(3, adressesLivraison.getville());
			statement.setString(4, adressesLivraison.getville());
			statement.setInt(5, adressesLivraison.getIdAdresse());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(AdressesLivraisonBean adressesLivraison) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE adresseslivraison WHERE idAdresse = ?");
			statement.setInt(1, adressesLivraison.getIdAdresse());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
