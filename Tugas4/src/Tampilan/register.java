/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Christian Sirait
 */
public class register extends JFrame implements ActionListener{
   JLabel labelUsername = new JLabel("Username : ");
   JLabel labelPasswors = new JLabel("Password : ");
   JTextField formUsername = new JTextField("");
   JPasswordField formPassword= new JPasswordField("");
   JButton tombolRegister = new JButton("Register");
   JButton tombolCancel = new JButton("Cancel");
   
   public register(){
        setTitle("Register");
        setSize(250,150);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        add(labelUsername);
        add(labelPasswors);
        add(formUsername);
        add(formPassword);
        add(tombolRegister);
        add(tombolCancel);
   
        labelUsername.setBounds(10,10,100,20);
        labelPasswors.setBounds(10,30,100,20);
        formUsername.setBounds(100,10,100,20);
        formPassword.setBounds(100,30,100,20);
        tombolRegister.setBounds(15,60,100,20);
        tombolCancel.setBounds(125,60,100,20);
        tombolCancel.addActionListener(this);
        tombolRegister.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e){
    if(e.getSource() == tombolCancel){
             menuAwal awal = new menuAwal();
             awal.show();
             dispose();
         }
    else if (e.getSource() == tombolRegister){
        try {
            String DBurl = "jdbc:mysql://localhost/tugasjdbc";
            String DBusername = "root";
            String DBpassword = "";
            Connection koneksi= null;
            Statement statement;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            String username = formUsername.getText();
            String pass = formPassword.getText();
            Statement stm = koneksi.createStatement();
            int len=pass.length();
            
            String sql = "select * from users where username='"+username+"'";
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Username Already Used");
                formUsername.setText("");
                formPassword.setText("");
                
            }
            else if(len<8) {
                JOptionPane.showMessageDialog(this, "Password too Short");
                formUsername.setText("");
                formPassword.setText("");
      
            }
            else if (username.isEmpty() || pass.isEmpty()){
             JOptionPane.showMessageDialog(null, "Enter Your Username", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
            }
            else {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
              sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            pass = sb.toString();
            stm.executeUpdate("INSERT INTO users(username, password) " + "VALUES ('"+username+"', '"+pass+"')");
            JOptionPane.showMessageDialog(this, "Account Succesfully Created");
            login awal = new login();
            awal.show();
            dispose();
            
            }
            
        } catch (Exception d) {
            System.out.println(d.getMessage());
        }
        
    }
    
   }
}
