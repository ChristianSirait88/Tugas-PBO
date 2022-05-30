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
public class add {
    input frame;
    intBarang intbr;
    Connection connection;
    public add(input frame) {
        this.frame = frame;
        intbr = new dataObject(connection);
    }
    public void tambahData(){
        barang br =new barang();
        br.setNama(frame.getNama().getText());
        br.setMassa(Double.parseDouble(frame.getMassa().getText()));
        br.setHarga(Double.parseDouble(frame.getHargaSatuan().getText()));
        intbr.add(br);
        JOptionPane.showMessageDialog(frame, "Berhasil menambahkan data baru");
        kembali();
    }
    public void reset(){
    frame.setNama("");
    frame.setMassa("");
    frame.setHargaSatuan("");
}
    public void kembali(){
    frame.dispose();
    new mainmenu().setVisible(true);
}
}
