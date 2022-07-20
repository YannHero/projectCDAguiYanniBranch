package dao;

import static java.time.LocalTime.now;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.RecherchesBean;
import modele.UtilisateursBean;

public class RecherchesDAO {
    Connection connect = new dao.Database().getConnection();


    public void ecrire(RecherchesBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.recherches (idUtilisateur,motClef,dateR)"
                    + "VALUES (?,?,now())");

            req.setObject(1, object.getUtilisateur().getIdUtilisateur());
            req.setObject(2, object.getMotClef());
            now();



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(RecherchesBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.recherches  SET idUtilisateur = ? , motClef = ? where idRecherche = ?");
            ps.setInt(1, object.getUtilisateur().getIdUtilisateur());
            ps.setString(2, object.getMotClef());
            ps.setInt(3, object.getIdRecherche());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<RecherchesBean> read() {
        ArrayList<RecherchesBean> listVisite = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.recherches"
                    + " INNER JOIN projetcdaguiyan.utilisateurs ON projetcdaguiyan.recherches.idUtilisateur = projetcdaguiyan.utilisateurs.idUtilisateur "
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                Date sqlDate = (rs.getDate("dateR"));
                RecherchesBean visiB = new RecherchesBean(rs.getInt("idRecherches"),
                        new UtilisateursBean(rs.getInt("idUtilisateur"), rs.getString("nom"),rs.getString("prenom"),rs.getDate("dateInscription"),rs.getString("Email")),
                        rs.getString("motClef"),
                        sqlDate
                );
                listVisite.add(visiB);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listVisite;
    }



    public void delete(RecherchesBean object) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.recherches  WHERE idRecherche=?");
            ps.setInt(1, object.getIdRecherche());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression de "+object.getIdRecherche()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
