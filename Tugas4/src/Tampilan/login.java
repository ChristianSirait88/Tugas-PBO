/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.*;
/**
 *
 * @author Christian Sirait
 */
public class login extends JFrame implements ActionListener{
   JLabel labelUsername = new JLabel("Username : ");
   JLabel labelPasswors = new JLabel("Password : ");
   JTextField formUsername = new JTextField("");
   JPasswordField formPassword= new JPasswordField("");
   JButton tombolLogin = new JButton("Login");
   JButton tombolCancel = new JButton("Cancel");
   
   public login(){
        setTitle("Login");
        setSize(250,150);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        add(labelUsername);
        add(labelPasswors);
        add(formUsername);
        add(formPassword);
        add(tombolLogin);
        add(tombolCancel);
   
        labelUsername.setBounds(10,10,100,20);
        labelPasswors.setBounds(10,30,100,20);
        formUsername.setBounds(100,10,100,20);
        formPassword.setBounds(100,30,100,20);
        tombolLogin.setBounds(20,60,75,20);
        tombolCancel.setBounds(110,60,75,20);
        tombolCancel.addActionListener(this);
        tombolLogin.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e){
    if(e.getSource() == tombolCancel){
             menuAwal awal = new menuAwal();
             awal.show();
             dispose();
         }
    else if (e.getSource() == tombolLogin){
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
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
              sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            pass = sb.toString();
            String sql = "select * from users where username='"+username+"' and password='"+pass+"'";
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next()){
            aplikasi aplikasi = new aplikasi();
            aplikasi.show();
            }
            else {
            JOptionPane.showMessageDialog(this, "Username Or Password Wrong");
            formUsername.setText("");
            formPassword.setText("");
            }
            
        } catch (Exception d) {
            System.out.println(d.getMessage());
        }
        
    }
   }
}
