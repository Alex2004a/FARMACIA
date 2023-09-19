/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author labor
 */
public class Conexion {

    private static String clase = "com.mysql.cj.jdbc.Driver";

    private static String url = "jdbc:mysql://localhost:3306/farmacia?serverTimezone=UTC";
    private static String usuario = "root";
    private static String clave = "123456";

    public Conexion() {
    }

    public Connection conectar() {
        Connection link = null;
        try {

            link = DriverManager.getConnection(url, usuario, clave);

        } catch (SQLException e) {

            JOptionPane.showConfirmDialog(null, e);
        }

        return link;

    }
}
