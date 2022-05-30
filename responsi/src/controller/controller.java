/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.JOptionPane;
import model.*; //pakenya crud
/**
 *
 * @author Christian Sirait
 */
public class controller extends konek {
    crud operasi;
    Object[][] barang = new Object[50][4];

    public controller(crud operasi) {
        this.operasi = operasi;
    }
    
    
    public void simpan(String nama,int massa, long harga){
        boolean cekData = false;
        for (int i = 0; barang[i][0] != null; i++) {
            if(barang[i][0].toString().equals(nama)){
                cekData = true;
                break;
            }
        }
        if(cekData){
            JOptionPane.showMessageDialog(null,"data Sudah ada dalam database!");
        } else {
            operasi.create(nama, massa, harga);
            JOptionPane.showMessageDialog(null,"Berhasil Menambahkan Barang!");
        }
    }
    
    public void update(String nama,int jumlah, long harga){
        boolean cekData = false;
        int index = -1;
        for (int i = 0; barang[i][0] != null; i++) {
            if(barang[i][0].toString().equals(nama)){
                index = i;
                cekData = true;
                break;
            }
        }
        if(cekData){
             operasi.update(nama, jumlah, harga);
                JOptionPane.showMessageDialog(null,"Berhasil Update Barang!");
        }
        else{
           JOptionPane.showMessageDialog(null,"Barang tidak ditemukan!"); 
        }
    }
    
    public void hapus(String nama){
        boolean ketemu = false;
        int index = -1;
        for (int i = 0; barang[i][0] != null; i++) {
            if(barang[i][0].toString().equals(nama)){
                index = i;
                ketemu = true;
                break;
            }
        }
        if(ketemu){
            operasi.delete(nama);
            JOptionPane.showMessageDialog(null,"Berhasil Menghapus data!");
        }else{
           JOptionPane.showMessageDialog(null,"Nama tidak ditemukan!"); 
        }
    }
}
