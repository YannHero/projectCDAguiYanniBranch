package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.FavorisBean;
import modele.ProduitsBean;
import modele.UtilisateursBean;

public class FavorisDAO {
    Connection connect = new dao.Database().getConnection();

    public void ecrire(FavorisBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.favoris (idProduit,idUtilisateur)"
                    + "VALUES (?,?)");

            req.setInt(1, object.getProduit().getIdProduit());
            req.setInt(2, object.getUtilisateur().getIdUtilisateur());



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(FavorisBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.favoris  SET idUtilisateur = ? , idProduit = ? where idFavori = ?");
            ps.setInt(1, object.getUtilisateur().getIdUtilisateur());
            ps.setInt(2, object.getProduit().getIdProduit());
            ps.setInt(3, object.getIdFavori());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<FavorisBean> read() {
        ArrayList<FavorisBean> listFav = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.favoris"
                    + " INNER JOIN projetcdaguiyan.utilisateurs ON projetcdaguiyan.favoris.idUtilisateur = projetcdaguiyan.utilisateurs.idUtilisateur "
                    + "INNER JOIN projetcdaguiyan.produits ON projetcdaguiyan.favoris.idProduit = produits.idProduit"
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {

                FavorisBean favB = new FavorisBean(rs.getInt("idFavori"),
                        new ProduitsBean(rs.getInt("idProduit"),rs.getString("titre"),rs.getDouble("prix"),rs.getString("image")),
                        new UtilisateursBean(rs.getInt("idUtilisateur"), rs.getString("nom"),rs.getString("prenom"),rs.getDate("dateInscription"),rs.getString("Email"))

                );
                listFav.add(favB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listFav;
    }



    public void delete(FavorisBean object) {

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.favoris  WHERE idFavori=?");
            ps.setInt(1, object.getIdFavori());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de "+object.getIdFavori()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
