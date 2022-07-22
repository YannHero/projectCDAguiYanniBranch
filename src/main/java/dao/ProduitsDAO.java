package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.ProduitsBean;
import modele.SousCategoriesBean;

public class ProduitsDAO {
    Connection connect = new dao.Database().getConnection();

    public void ecrire(ProduitsBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO produits (titre,description,prix,image,idSousCategorie,stock,stockMinimum)"
                    + "VALUES (?,?,?,?,?,?,?)");

            req.setString(1, object.getTitre());
            req.setString(2, object.getDescription());
            req.setDouble(3, object.getPrix());
            req.setString(4, object.getImage());
            req.setInt(5, object.getSousCategorie().getIdSousCategorie());
            req.setInt(6, object.getStock());
            req.setInt(7, object.getStockMinimum());



            System.out.println("insert succès");

            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Echec de l'insertion");
        }

    }
    public void inserTest(ProduitsBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.produits (titre,description,prix,image,stock,stockMinimum)"
                    + "VALUES (?,?,?,?,?,?,?)");

            req.setString(1, object.getTitre());
            req.setString(2, object.getDescription());
            req.setDouble(3, object.getPrix());
            req.setString(4, object.getImage());
            req.setInt(6, object.getStock());
            req.setInt(7, object.getStockMinimum());



            System.out.println("insert succès");

            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Echec de l'insertion");
        }

    }


    public void update(ProduitsBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.produits  SET titre = ? , description = ?, prix = ?, image = ?, idSousCategorie = ?, stock = ?, stockMinimum = ? where idProduit = ?");
            ps.setString(1, object.getTitre());
            ps.setString(2, object.getDescription());
            ps.setDouble(3, object.getPrix());
            ps.setString(4, object.getImage());
            ps.setObject(5, object.getSousCategorie().getIdSousCategorie());
            ps.setInt(6, object.getStock());
            ps.setInt(7, object.getStockMinimum());
            ps.setInt(8, object.getIdProduit());


            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<ProduitsBean> read() {
        ArrayList<ProduitsBean> listSCatgeorie = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.souscategories"
                    + " INNER JOIN projetcdaguiyan.categories ON projetcdaguiyan.souscategories.idCategorie = projetcdaguiyan.categories.idCategorie"
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                ProduitsBean SCategorieB = new ProduitsBean(rs.getInt("idProduit"),
                        rs.getString("titre"),
                        rs.getString("description"),
                        rs.getDouble("prix"),
                        rs.getString("image"),
                        new SousCategoriesBean(rs.getInt("idSousCategorie"),rs.getString("titreSousCategorie")),
                        rs.getInt("stock"),
                        rs.getInt("stockMinimum")

                );
                listSCatgeorie.add(SCategorieB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listSCatgeorie;
    }



    public void delete(ProduitsBean object) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.produits  WHERE idProduit=?");
            ps.setInt(1, object.getIdProduit());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression "+object.getIdProduit()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
