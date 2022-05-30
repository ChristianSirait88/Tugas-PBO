/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Christian Sirait
 */
public class db {
    String DBurl = "jdbc:mysql://localhost/barang";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi = null;
    public Statement statement;
    
    public db(){  
        try{  
           Class.forName("com.mysql.jdbc.Driver");
           koneksi = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
        }catch(Exception e){
            System.out.println(e);
        }  
    }
}
