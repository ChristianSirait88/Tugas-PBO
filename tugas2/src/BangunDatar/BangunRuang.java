/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Christian Sirait
 */
public class BangunRuang {
    double panjang,lebar, tinggi,jari;
    double luas, keliling, volume, lp;
    private final double phi = 3.14; //encapsulation

// penggunaan overload methods hitungLuas 
    void hitungLuas(double panjang, double lebar){
        luas = panjang * lebar;
    }
    
    void hitungLuas(double jari){
        luas = jari * phi * jari;
    }
    // penggunaan overload methods hitungKeliling 
    void hitungKeliling(double panjang, double lebar){
        keliling = (2*panjang) + (2 * lebar);
    }
 
    void hitungKeliling(double jari){
        keliling = 2 * phi * jari;
    }
    
    // penggunaan overload methods hitungVolume 
    void hitungVolume(double panjang, double lebar, double tinggi){
        volume = panjang * lebar * tinggi;
    }
    
    void hitungVolume(double jari, double tinggi){
        volume = (phi * jari * jari * tinggi);
    }
    
    // penggunaan overload methods hitungLP (Luas Permukaan)  
    void hitungLP(double panjang, double lebar, double tinggi){
        lp = (2*panjang*lebar) + (2 * lebar*tinggi) + (2*tinggi*lebar);
    }
 
    void hitungLP(double jari, double tinggi){
        lp = 2 * phi * jari *(jari + tinggi);
    }
}
