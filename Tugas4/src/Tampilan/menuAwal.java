/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tampilan;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Christian Sirait
 */
public class menuAwal extends JFrame implements ActionListener{
   JLabel judul = new JLabel("Aplikasi Ala ala");
   JButton tombolRegister = new JButton("Register");
   JButton tombolLogin = new JButton("Login");
   
   public menuAwal(){
        setTitle("Login");
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        judul.setFont(new Font("Serif", Font.PLAIN,24));
        add(tombolRegister);
        add(tombolLogin);
        add(judul);
  
        tombolRegister.setBounds(100,170,100,40);
        tombolLogin.setBounds(300,170,100,40);
        judul.setBounds(180,60,200,60);
        tombolLogin.addActionListener(this);
        tombolRegister.addActionListener(this);
   }
   @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == tombolLogin){
            login login = new login();
            login.show();
            dispose();
        }
        else if(e.getSource() == tombolRegister){
            register regis = new register();
            regis.show();
            dispose();
        }
    }
}
