/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;
import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Christian Sirait
 */
public class aplikasi extends JFrame {
     JLabel labelUsername = new JLabel("Welcome");

    public aplikasi() {
        setTitle("Login");
        setSize(250,150);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        add(labelUsername);
        labelUsername.setBounds(10,10,100,20);
    }
     
     
}
