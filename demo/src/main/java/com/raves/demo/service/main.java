package com.raves.demo.service;

import com.raves.demo.model.User;

import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo11?serverTimezone=UTC";
        String user = "admin";
        String password = "admin";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.execute("insert into users values ()");
            //ResultSet rs = statement.executeQuery("select * from users left join roles r on users.id = r.id");

//            int columns = rs.getMetaData().getColumnCount();
//            while (rs.next()){
//                for (int i = 1; i <= columns; i++){
//                    System.out.print(rs.getString(i) + "\t");
//                }
//                System.out.println();
//            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
