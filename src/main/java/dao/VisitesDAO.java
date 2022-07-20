package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.ProduitsBean;
import modele.UtilisateursBean;
import modele.VisitesBean;

public class VisitesDAO {
    Connection connect = new dao.Database().getConnection();

    private void test(PreparedStatement statement) throws SQLException {
        ResultSet rs = statement.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbColonnes = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= nbColonnes; i++) {
                String laValeur = rs.getString(i);
                System.out.print(laValeur + " ");
            }
            System.out.println("");
        }
    }	

    public void ecrire(VisitesBean object) {

        try {
            PreparedStatement req = connect.prepareStatement("INSERT INTO projetcdaguiyan.visites (idProduit,idUtilisateur,dateV)"
                    + "VALUES (?,?,now())");

            req.setInt(1, object.getProduit().getIdProduit());
            req.setInt(2, object.getUtilisateur().getIdUtilisateur());



            req.executeUpdate();



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Insertion KO");
        }

    }


    public void update(VisitesBean object) {
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE projetcdaguiyan.visites  SET idUtilisateur = ? , idProduit = ? where idVisite = ?");
            ps.setInt(1, object.getProduit().getIdProduit());
            ps.setInt(2, object.getUtilisateur().getIdUtilisateur());
            ps.setInt(3, object.getIdVisite());
            ps.executeUpdate();
            System.out.println(ps);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public ArrayList<VisitesBean> read() {
        ArrayList<VisitesBean> listVisite = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM projetcdaguiyan.visites"
                    + " INNER JOIN projetcdaguiyan.utilisateurs ON projetcdaguiyan.visites.idUtilisateur = projetcdaguiyan.utilisateurs.idUtilisateur "
                    + "INNER JOIN projetcdaguiyan.produits ON projetcdaguiyan.visites.idProduit = produits.idProduit"
                    + "");
            System.out.println(req);

            ResultSet rs = req.executeQuery();

            while (rs.next()) {
                Date sqlDate = (rs.getDate("dateV"));
                VisitesBean visiB = new VisitesBean(rs.getInt("idVisites"),
                        new ProduitsBean(rs.getInt("idProduit"),rs.getString("titre"),rs.getDouble("prix"),rs.getString("image")),
                        new UtilisateursBean(rs.getInt("idUtilisateur"), rs.getString("nom"),rs.getString("prenom"),rs.getDate("dateInscription"),rs.getString("Email")),
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



    public void delete(VisitesBean object) {
        //this.read();

        try {
            PreparedStatement ps = connect.prepareStatement("Delete FROM projetcdaguiyan.visites  WHERE idVisite=?");
            ps.setInt(1, object.getIdVisite());
            //	ps.setString(2, user.getPassword());

            ps.execute();
            System.out.println(ps);
            ps.close();
            System.out.println("Succès de la suppression du compte de "+object.getIdVisite()+" !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
