/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Christian Sirait
 */
public class Lingkaran extends BangunRuang implements Interface.MenghitungBidang{
 //terdapat inheritance dari BangunRuang.java dan implements dariInterface.MenghitungBidang

    public Lingkaran(double jari) {//penggunaan constructor
       this.jari = jari;
    }

    // inheritance methods dari BangunRuang.java
    @Override
    void hitungLuas(double jari) {
        super.hitungLuas(jari); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    void hitungKeliling(double jari) {
        super.hitungKeliling(jari); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    //penggunaan override dari Interface
    @Override
    public void cetakLuas() {
        hitungLuas(jari);  
        System.out.println("Luas Lingkaran = " + luas);
    }

    @Override
    public void cetakKeliling() {
        hitungKeliling(jari);
       System.out.println("Keliling Lingkaran = " + keliling);
    }

    
}
