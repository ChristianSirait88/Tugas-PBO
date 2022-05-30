/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.*;
import model.crud;
/**
 *
 * @author Christian Sirait
 */
public class lihat extends JFrame implements ActionListener {
    JTable tabel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"No MK","Nama MK","NIP","Kelas"};
    public lihat(){
      String[][] barang = null;
      setLayout(null);
      setSize(550,600);
      //  window.setDefaultCloseOperation(3);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
     tabel = new JTable(barang,namaKolom);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
