/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.barang;
import dao.*;
import View.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Christian Sirait
 */
public class contrrolleredit {
    update frame;
    intBarang intbr;
    Connection connection;
    public contrrolleredit(update frame) {
        this.frame = frame;
        intbr  =new dataObject(connection);
    }
    public void tampilkanData(barang barang){
        frame.setName(barang.getNama());
        frame.setMassa(Double.toString(barang.getMassa()));
        frame.setHargaSatuan(Double.toString(barang.getHarga()));
    }
    public void simpanEdit(int id){
    barang br = new barang();
    br.setNama(frame.getNama().getText());
    br.setMassa(Double.parseDouble(frame.getMassa().getText()));
    br.setHarga(Double.parseDouble(frame.getHargaSatuan().getText()));
    br.setId(id);
    intbr.update(br);
    JOptionPane.showMessageDialog(frame, "Berhasil mengedit data");
    kembali();
 }
    public void kembali(){
        frame.dispose();
        new mainmenu().setVisible(true);
    }
}
