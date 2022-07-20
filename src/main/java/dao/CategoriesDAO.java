package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Connect;
import modele.CategoriesBean;

public class CategoriesDAO {
	Connection conn = new Connect().getConnection();
	public boolean creat(CategoriesBean categories) {
		try {

			PreparedStatement statement = conn.prepareStatement("INSERT INTO categories (titreCategorie)VALUES (?)");

			statement.setString(1, categories.getTitreCategorie());
			statement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}


	public ArrayList<CategoriesBean> read() {
		ArrayList<CategoriesBean> colsval = new ArrayList<>();

		try {
			
			ResultSet result = null;
			PreparedStatement statement = conn.prepareStatement("SELECT * from categories");
			result = statement.executeQuery();
			while (result.next()) {
				
				colsval.add(new CategoriesBean(
						result.getInt("idCategorie"),
						result.getString("titreCategorie")
					));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colsval;

	}

	
	public boolean update(CategoriesBean categories) {
		try {
			PreparedStatement statement = conn.prepareStatement("UPDATE categories SET titreCategorie = ? WHERE idCategorie = ?");
			statement.setString(1, categories.getTitreCategorie());
			statement.setInt(2, categories.getIdCategorie());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean suppr(CategoriesBean categories) {
		try {
			PreparedStatement statement = conn.prepareStatement("DELETE categories WHERE idCategorie = ?");
			statement.setInt(1, categories.getIdCategorie());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
