package com.login.modelo;

/**
 * Created by paul on 23/05/16.
 */


import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{

    public static final String USERNAME = "root";
    public static final String PASSWORD = "secret";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "javaee";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;

    public java.sql.Connection con;

    public Conexion() {

        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error Class Not Found");
        } catch (SQLException e) {
            System.out.println("Error SQLException");
        }
    }

}
