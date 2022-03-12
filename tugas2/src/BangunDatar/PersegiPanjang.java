/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Christian Sirait
 */
public class PersegiPanjang extends BangunRuang implements Interface.MenghitungBidang {
 //terdapat inheritance dari BangunRuang.java dan implements dariInterface.MenghitungBidang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    
// inheritance methods dari BangunRuang.java
    @Override
    void hitungKeliling(double panjang, double lebar) {
        super.hitungKeliling(panjang, lebar); 
    }

    @Override
    void hitungLuas(double panjang, double lebar) {
        super.hitungLuas(panjang, lebar); 
    }
    
    //penggunaan override dari Interface
    @Override
    public void cetakLuas() {
        hitungLuas(panjang, lebar);
        System.out.println("Luas Persegi = " + luas);
    }

    @Override
    public void cetakKeliling() {
        hitungKeliling(panjang, lebar);
         System.out.println("Keliling Persegi = " + keliling);
    }
         
}



  
  
