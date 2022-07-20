package dao;

import modele.*;

import java.sql.*;
import java.util.ArrayList;

public class SousCategoriesDAO {
    Connection connect = new dao.Database().getConnection();


    public void ecrire(SousCategoriesBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.souscategories (titreSousCategorie,idCategorie)"
                    + "VALUES (?,?)");

            req.setObject(1, object.getTitreSousCategorie());
            req.setInt(2, object.getCategorie().getIdCategorie());



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(SousCategoriesBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.souscategories  SET titreSousCategorie = ? , idCategorie = ? where idSousCategorie = ?");
            ps.setObject(1, object.getTitreSousCategorie());
            ps.setInt(2, object.getCategorie().getIdCategorie());
            ps.setInt(3, object.getIdSousCategorie());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<SousCategoriesBean> read() {
        ArrayList<SousCategoriesBean> listSCatgeorie = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.souscategories"
                    + " INNER JOIN projetcdaguiyan.categories ON projetcdaguiyan.souscategories.idCategorie = projetcdaguiyan.categories.idCategorie"
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                SousCategoriesBean SCategorieB = new SousCategoriesBean(rs.getInt("idSousCategorie"),
                        rs.getString("titreSousCategorie"),
                        new CategoriesBean(rs.getInt("idCategorie"),rs.getString("titreCategorie"))

                );
                listSCatgeorie.add(SCategorieB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listSCatgeorie;
    }



    public void delete(SousCategoriesBean object) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.souscategories  WHERE idSousCategorie=?");
            ps.setInt(1, object.getIdSousCategorie());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de "+object.getIdSousCategorie()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
