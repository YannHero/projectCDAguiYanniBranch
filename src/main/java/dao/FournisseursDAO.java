package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.FournisseursBean;

public class FournisseursDAO {
    Connection connect = new dao.Database().getConnection();


    public void ecrire(FournisseursBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.fournisseurs (nom)"
                    + "VALUES (?)");

            req.setString(1, object.getNom());



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(FournisseursBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.fournisseurs  SET nom = ? where idFournisseur = ?");
            ps.setString(1, object.getNom());
            ps.setInt(2, object.getIdFournisseur());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<FournisseursBean> read() {
        ArrayList<FournisseursBean> listFourn = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.fournisseurs ");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                Date sqlDate = (rs.getDate("dateV"));
                FournisseursBean FourniB = new FournisseursBean(rs.getInt("idFournisseur"),
                        rs.getString("nom"));

                listFourn.add(FourniB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listFourn;
    }



    public void delete(FournisseursBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.fournisseurs  WHERE idFournisseur=?");
            ps.setInt(1, object.getIdFournisseur());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de "+object.getIdFournisseur()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
