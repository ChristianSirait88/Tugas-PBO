/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import View.*;
import dao.*;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Christian Sirait
 */
public class controllerBarang {
    lihat frame;
    intBarang intbr;
    Connection connection;
    List<barang>  list_barang;

    public controllerBarang(lihat frame) {
        this.frame = frame;
        intbr = new dataObject(connection);
        list_barang=intbr.getBarang(); 
    }
    public void load_table() {
    tabel tbl = new tabel(list_barang);
    frame.getTableData().setModel(tbl);
}
    public void halaman_tambah(){
    frame.dispose();
    new input().setVisible(true);
}
    public void halaman_detail(int row){
    barang get = list_barang.get(row);
    frame.dispose();
    new update(get).setVisible(true);
 }
}
