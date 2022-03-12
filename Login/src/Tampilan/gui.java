/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;
import javax.swing.*;
/**
 *
 * @author Christian Sirait
 */
public class gui extends JFrame {
   JLabel labelUsername = new JLabel("Username : ");
   JLabel labelPasswors = new JLabel("Password : ");
   JTextField formUsername = new JTextField("");
   JTextField formPassword= new JTextField("");
   JButton tombolLogin = new JButton("Login");
   JButton tombolCancel = new JButton("Cancel");
   
   public gui(){
        setTitle("Login");
        setSize(250,150);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(200,400);
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
   }
}
