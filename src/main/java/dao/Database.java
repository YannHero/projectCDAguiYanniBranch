package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public Connection getConnection() {
        String dbName = "projetcdaguiyan";
        String url = "jdbc:mysql://localhost/";
        String user="root";
        String pwd="";

        Connection connect = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                connect = DriverManager.getConnection(url+dbName,user,pwd);
                System.out.println("OK for connect");



            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return connect;
    }
}
