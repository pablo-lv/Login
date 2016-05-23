package com.login.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by paul on 23/05/16.
 */
public class Queries extends Conexion {

    public boolean authentication(String user, String pass) throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String query = "SELECT * FROM Usuarios";
        rs = st.executeQuery(query);

        while (rs.next())
        {
            if (user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena")))
            {
                return true;
            }
        }

        return false;
    }
}
