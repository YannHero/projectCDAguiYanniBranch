package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.ContactBean;
import modele.UtilisateursBean;

public class ContactDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(ContactBean contact) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO contact (idUtilisateur, Sujet, Message, etat,email)VALUES (?,?,?,?,?)");

			statement.setInt(1, contact.getUtilisateur().getIdUtilisateur());
			statement.setString(2, contact.getSujet());
			statement.setString(3, contact.getMessage());
			statement.setInt(4, contact.getEtat());
			statement.setString(5, contact.getEmail());
			
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<ContactBean> read() {
		ArrayList<ContactBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from contact");
			result = statement.executeQuery();
			while (result.next()) {
			
				colsval.add(new ContactBean(
						result.getInt("idContact"),
						new UtilisateursBean(result.getInt("idUtilisateur")),
						result.getString("Sujet"),
						result.getString("Message"),
						result.getInt("etat"),	
						result.getString("email")		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(ContactBean contact) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE contact SET Sujet = ?, Message = ?, etat =?,email =? WHERE idContact = ?");
			statement.setString(1, contact.getSujet());
			statement.setString(2, contact.getMessage());
			statement.setInt(3, contact.getEtat());
			statement.setString(4, contact.getEmail());
			statement.setInt(5, contact.getIdContact());
		
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(ContactBean contact) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE contact WHERE idContact = ?");
			statement.setInt(1, contact.getIdContact());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
