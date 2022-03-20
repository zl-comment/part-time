package com.zx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {


    public  static String url="jdbc:mysql://localhost:3306/part-time_P";
    public static String  user="root";
    public   static String password="root";

    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public  static Connection getConnection() throws SQLException {
        Connection connection= DriverManager.getConnection(url,user,password);
        return connection;
    }

    public static void close(Connection connection){
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
