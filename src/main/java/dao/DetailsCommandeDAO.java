package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.CommandesBean;
import modele.DetailsCommandeBean;
import modele.ProduitsBean;

public class DetailsCommandeDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(DetailsCommandeBean detailsCommande) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO detailscommande (idCommande, idProduit, Quantite, Prix)VALUES (?,?,?,?)");

			statement.setInt(1, detailsCommande.getCommande().getIdCommande());
			statement.setInt(2, detailsCommande.getProduit().getIdProduit());
			statement.setInt(3, detailsCommande.getQuantite());
			statement.setDouble(4, detailsCommande.getPrix());
		
			
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<DetailsCommandeBean> read() {
		ArrayList<DetailsCommandeBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from detailscommande");
			result = statement.executeQuery();
			while (result.next()) {
			
				colsval.add(new DetailsCommandeBean(
						result.getInt("idDetailsCommande"),
						new CommandesBean(result.getInt("idCommande")),
						new ProduitsBean(result.getInt("idProduit")),
						result.getInt("Quantite"),
						result.getDouble("Prix")
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(DetailsCommandeBean detailsCommande) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE detailscommande SET Quantite = ?, Prix = ?, WHERE idDetailsCommande = ?");
			statement.setInt(1, detailsCommande.getQuantite());
			statement.setDouble(2, detailsCommande.getPrix());
			statement.setInt(3, detailsCommande.getIdDetailsCommande());

		
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(DetailsCommandeBean detailsCommande) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE detailscommande WHERE idDetailsCommande = ?");
			statement.setInt(1, detailsCommande.getIdDetailsCommande());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
