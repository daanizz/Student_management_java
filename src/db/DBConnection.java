package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.io.FileInputStream;
import java.util.Properties;

public class  DBConnection{
    private static  String URL;
    private static  String USER;
    private static  String PASSWORD;

    static{

        try{
            Properties props=new Properties();
            FileInputStream fis=new FileInputStream("config/db.properties");

            props.load(fis);

            URL=props.getProperty("url");
            USER=props.getProperty("user");
            PASSWORD=props.getProperty("password");

            // Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println("Properties file loading failed");

            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            );
        }
        catch(SQLException e){
            System.out.println("Database connection failed!!");
            e.printStackTrace();
            return null;
        }
    }
}