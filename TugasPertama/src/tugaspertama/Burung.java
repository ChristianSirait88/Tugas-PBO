/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public class Burung {
    String jenisBurung;

    public Burung(String jenisBurung) {
        this.jenisBurung = jenisBurung;
    }
    
    void Terbang(){
        System.out.println(this.jenisBurung + "Dapat terbang tinggi");
    }
}
