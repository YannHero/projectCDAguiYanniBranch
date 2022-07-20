package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.CommentairesBean;
import modele.ProduitsBean;
import modele.UtilisateursBean;

public class CommentairesDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(CommentairesBean commentaire) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO commentaires (commentaire, note, idProduit, idUtilisateur)VALUES (?,?,?,?)");

			statement.setString(1, commentaire.getCommentaire());
			statement.setInt(2, commentaire.getNote());
			statement.setDouble(3, commentaire.getProduit().getIdProduit());
			statement.setInt(4, commentaire.getUtilisateur().getIdUtilisateur());
			
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<CommentairesBean> read() {
		ArrayList<CommentairesBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from commentaires");
			result = statement.executeQuery();
			while (result.next()) {
			
				colsval.add(new CommentairesBean(
						result.getInt("idCommentaire"),
						result.getString("commentaire"),
						result.getInt("note"),
						new ProduitsBean(result.getInt("idProduit")),
						new UtilisateursBean(result.getInt("idUtilisateur"))		
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(CommentairesBean commentaire) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE commentaires SET commentaire = ?, note = ? WHERE idCommentaire = ?");
			statement.setString(1, commentaire.getCommentaire());
			statement.setDouble(2, commentaire.getNote());
			statement.setInt(3, commentaire.getIdCommentaire());
		
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(CommentairesBean commentaire) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE commentaires WHERE idCommentaire = ?");
			statement.setInt(1, commentaire.getIdCommentaire());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
