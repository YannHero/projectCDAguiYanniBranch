package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modele.UtilisateursBean;

public class UtilisateursDAO {
    Connection connect = new dao.Database().getConnection();

    public void ecrire(UtilisateursBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.utilisateurs (nom,prenom,email,dateInscription,motDePasse)"
                    + "VALUES (?,?,?,?,PASSWORD(?))");

            req.setString(1, object.getNom());
            req.setString(2, object.getPrenom());
            req.setString(3, object.getEmail());
            req.setString(4, LocalDate.now().toString());
            req.setString(5, object.getMotDePasse());

            req.executeUpdate();

            System.out.println( object.getPrenom()+ "  " +object.getNom() +" a été bien ajouté en base");


        } catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
            System.out.println("Insertion KO");
        }

    }


    public void update(UtilisateursBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.utilisateurs  SET nom = ? , prenom = ? , Email = ?  where idUtilisateur = ?");
            ps.setString(1, object.getNom());
            ps.setString(2, object.getPrenom());
            ps.setString(3, object.getEmail());
            ps.setInt(4, object.getIdUtilisateur());

            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public List<UtilisateursBean> read() {
        List<UtilisateursBean> listeUser = new ArrayList<>();

        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.utilisateurs");
            ResultSet rs = req.executeQuery();
            //rs = sql2.executeQuery();

            while(rs.next()) {


                UtilisateursBean user = new UtilisateursBean(
                        rs.getInt("idUtilisateur"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getDate("dateInscription"),
                        rs.getString("email")

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



    public void delete(UtilisateursBean user) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.utilisateurs  WHERE idUtilisateur=?");
            ps.setInt(1, user.getIdUtilisateur());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression du compte de "+user.getEmail()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//le commentaire
    public UtilisateursBean Connection(String Mail, String MDP) {
     try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.utilisateurs WHERE Email = ? AND motDePasse =PASSWORD(?)");
            req.setString(1, Mail);
            req.setString(2, MDP);
            
            ResultSet rs = req.executeQuery();
            //rs = sql2.executeQuery();

            if(rs.next()) {


                UtilisateursBean user = new UtilisateursBean(
                        rs.getInt("idUtilisateur"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getDate("dateInscription"),
                        rs.getString("email")

                );
                return user;
            }
            System.out.println("succès");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("echec?");
        }
        return null;
    }
}
