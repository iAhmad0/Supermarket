/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany1.supermarket;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class LoginClass {
    
    public void connect () {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket-database",
                "root", "root");

            Statement stmt = con.createStatement();
            String query = "SELECT * FROM `supermarket-database`.admin WHERE Username='"+username.getText()
            +"' AND Password='"+password.getText()+"'";
            ResultSet rs = stmt.executeQuery(query);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
