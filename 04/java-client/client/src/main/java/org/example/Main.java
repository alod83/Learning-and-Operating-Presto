package org.example;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String sql = "SELECT * FROM customer LIMIT 5";
        String url = "jdbc:presto://presto-coordinator:8080/tpch/sf1";

        try{
            Class.forName("com.facebook.presto.jdbc.PrestoDriver");

            Connection connection =
                     DriverManager.getConnection(url, "test", null);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}