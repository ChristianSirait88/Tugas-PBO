/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

import Interface.MenghitungRuang;

/**
 *
 * @author Christian Sirait
 */
public class Balok extends BangunRuang implements MenghitungRuang{ 
 //terdapat inheritance dari BangunRuang.java dan implements dariInterface.MenghitungBidang
    public Balok(double panjang, double lebar, double tinggi) {//penggunaan constructor
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // inheritance methods dari BangunRuang.java
    @Override
    void hitungVolume(double panjang, double lebar, double tinggi) {
        super.hitungVolume(panjang, lebar, tinggi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    void hitungLP(double panjang, double lebar, double tinggi) {
        super.hitungLP(panjang, lebar, tinggi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    //penggunaan override dari Interface
    @Override
    public void cetakVolume() {
       hitungVolume(panjang,lebar,tinggi);
       System.out.println("Volume Balok = " + volume);
    }

    @Override
    public void cetakLP() {
       hitungLP(panjang,lebar,tinggi);
       System.out.println("Luas Permukaan Balok = " + lp);
    }
    
}
