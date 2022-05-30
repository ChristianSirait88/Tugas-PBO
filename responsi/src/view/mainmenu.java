/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.*;
/**
 *
 * @author Christian Sirait
 */
public class mainmenu extends JFrame implements ActionListener {
   JLabel labelJudul = new JLabel("Main Menu");
   JButton tombolTambah = new JButton("Tambah Barang");
   JButton tombolLihat = new JButton("Lihat Barang");

    public mainmenu(){
        setTitle("Main Menu");
        setSize(250,170);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        add(labelJudul);
        add(tombolLihat);
        add(tombolTambah);
   
        labelJudul.setBounds(90,10,300,50);
        tombolTambah.setBounds(15,60,100,20);
        tombolLihat.setBounds(125,60,100,20);
        tombolLihat.addActionListener(this);
        tombolTambah.addActionListener(this);
    }
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == tombolLihat){
             lihat lihat = new lihat();
             lihat.show();
             dispose();
         }
       else if (e.getSource() == tombolTambah){
           tambah add =new tambah();
           add.show();
           dispose();
       }
    }
    
}
