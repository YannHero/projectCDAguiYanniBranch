package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import controler.Connect;
import modele.EntreesEnStockBean;
import modele.FournisseursBean;
import modele.ProduitsBean;

public class EntreesEnStockDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(EntreesEnStockBean entreesEnStock) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO entreesenstock (idFournisseur, idProduit, dateE, quantite)VALUES (?,?,?,?)");

			statement.setInt(1, entreesEnStock.getFournisseur().getIdFournisseur());
			statement.setInt(2, entreesEnStock.getProduit().getIdProduit());
			statement.setString(3, entreesEnStock.getDateE().toString());
			statement.setInt(4, entreesEnStock.getQuantite());
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<EntreesEnStockBean> read() {
		ArrayList<EntreesEnStockBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from entreesenstock");
			result = statement.executeQuery();
			while (result.next()) {
				LocalDate date = LocalDate.parse((CharSequence) result.getString("DateC"));
				colsval.add(new EntreesEnStockBean(
						result.getInt("idEntree"),
						new FournisseursBean(result.getInt("idFournisseur")),
						new ProduitsBean(result.getInt("idProduit")),
						date,
						result.getInt("quantite")
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(EntreesEnStockBean entreesEnStock) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE entreesenstock SET idFournisseur = ?, idProduit = ?, quantite = ? WHERE idEntree = ?");
			statement.setInt(1, entreesEnStock.getFournisseur().getIdFournisseur());
			statement.setInt(2, entreesEnStock.getProduit().getIdProduit());
			statement.setInt(3, entreesEnStock.getQuantite());
			statement.setInt(3, entreesEnStock.getIdEntree());

		
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(EntreesEnStockBean entreesEnStock) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE entreesenstock WHERE idEntree = ?");
			statement.setInt(1, entreesEnStock.getIdEntree());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
