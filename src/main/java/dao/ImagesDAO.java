package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.ImagesBean;
import modele.ProduitsBean;

public class ImagesDAO {
    Connection connect = new dao.Database().getConnection();
    public void ecrire(ImagesBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.images (idProduit,url)"
                    + "VALUES (?,?)");

            req.setInt(1, object.getProduit().getIdProduit());
            req.setString(2, object.getUrl());



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(ImagesBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.images  SET idProduit = ? , url = ? where idImage = ?");
            ps.setInt(1, object.getProduit().getIdProduit());
            ps.setString(2, object.getUrl());
            ps.setInt(3, object.getIdImage());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<ImagesBean> read() {
        ArrayList<ImagesBean> listImg = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.visites"
                    + " INNER JOIN projetcdaguiyan.utilisateurs ON projetcdaguiyan.visites.idUtilisateur = projetcdaguiyan.utilisateurs.idUtilisateur "
                    + "INNER JOIN projetcdaguiyan.produits ON projetcdaguiyan.visites.idProduit = produits.idProduit"
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                ImagesBean imgB = new ImagesBean(rs.getInt("idImage"),
                        new ProduitsBean(rs.getInt("idProduit"),rs.getString("titre"),rs.getDouble("prix"),rs.getString("image")),
                        rs.getString("url")
                );
                listImg.add(imgB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listImg;
    }



    public void delete(ImagesBean object) {

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.images  WHERE idImage=?");
            ps.setInt(1, object.getIdImage());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de l'image ayant l'id "+object.getIdImage()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
