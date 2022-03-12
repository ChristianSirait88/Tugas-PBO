/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Christian Sirait
 */
public class Tabung extends BangunRuang implements Interface.MenghitungRuang{
 //terdapat inheritance dari BangunRuang.java dan implements dariInterface.MenghitungBidang
    public Tabung (double jari, double tinggi) {
    this.jari = jari;
    this.tinggi = tinggi;
    }
// inheritance methods dari BangunRuang.java
    @Override
    void hitungVolume(double jari, double tinggi) {
        super.hitungVolume(jari, tinggi);
    }

    @Override
    void hitungLP(double jari, double tinggi) {
        super.hitungLP(jari, tinggi); 
    }
    
    //penggunaan override dari Interface
    @Override
    public void cetakVolume() {
        hitungVolume(jari, tinggi);
        System.out.println("Volume Tabung = " + volume);
    }

    @Override
    public void cetakLP() {
       hitungLP(jari, tinggi);
       System.out.println("Luas Permukaan Tabung = " + lp);
    }
    
}
