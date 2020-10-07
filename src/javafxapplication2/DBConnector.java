/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBConnector {
    public static Connection getConnection() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Victory");
        return con;
        
    }
}
