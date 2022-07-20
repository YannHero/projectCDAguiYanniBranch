package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modele.SlidesBean;

public class SlidesDAO {
    Connection connect = new dao.Database().getConnection();
    public void ecrire(SlidesBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.slides (titre,image,url)"
                    + "VALUES (?,?,?)");

            req.setString(1, object.getTitre());
            req.setString(2, object.getImage());
            req.setString(3, object.getUrl());
            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(SlidesBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.slides  SET titre = ? , image = ? , url = ?  where idSlide = ?");
            ps.setString(1, object.getTitre());
            ps.setString(2, object.getImage());
            ps.setString(3, object.getUrl());
            ps.setInt(4, object.getIdSlide());

            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public List<SlidesBean> read() {
        List<SlidesBean> listeUser = new ArrayList<>();

        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.utilisateurs");
            ResultSet rs = req.executeQuery();
            //rs = sql2.executeQuery();

            while(rs.next()) {


                SlidesBean user = new SlidesBean(
                        rs.getInt("idSlides"),
                        rs.getString("titre"),
                        rs.getString("image"),
                        rs.getString("url")
                );

                listeUser.add(user);
            }
            System.out.println("succès");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("echec?");
        }
        return listeUser;
    }



    public void delete(SlidesBean slide) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.slides  WHERE idSlide=?");
            ps.setInt(1, slide.getIdSlide());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de l'image de "+slide.getTitre()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
