package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import controler.Connect;
import modele.AdressesLivraisonBean;
import modele.CommandesBean;
import modele.UtilisateursBean;

public class CommandesDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(CommandesBean commande) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO commandes (idUtilisateur, DateC, Total, idAdresse, Etat)VALUES (?,?,?,?,?)");

			statement.setInt(1, commande.getUtilisateur().getIdUtilisateur());
			statement.setString(2, commande.getDateC().toString());
			statement.setDouble(3, commande.getTotal());
			statement.setInt(4, commande.getAdresse().getIdAdresse());
			statement.setInt(5, commande.getEtat());
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<CommandesBean> read() {
		ArrayList<CommandesBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from commandes");
			result = statement.executeQuery();
			while (result.next()) {
				LocalDate date = LocalDate.parse((CharSequence) result.getString("DateC"));

				colsval.add(new CommandesBean(
						result.getInt("idCommande"),
						new UtilisateursBean(result.getInt("idUtilisateur")),
						date,
						result.getDouble("Total"),
						new AdressesLivraisonBean(result.getInt("idAdresse")),	
						result.getInt("Etat")		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(CommandesBean commande) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE commandes SET DateC = ?, Total = ?, idAdresse = ?, Etat = ? WHERE idCommande = ?");
			statement.setString(1, commande.getDateC().toString());
			statement.setDouble(2, commande.getTotal());
			statement.setInt(3, commande.getAdresse().getIdAdresse());
			statement.setInt(4, commande.getEtat());
			statement.setInt(5, commande.getIdCommande());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(CommandesBean commande) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE commandes WHERE idCommande = ?");
			statement.setInt(1, commande.getIdCommande());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
