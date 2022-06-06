/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public abstract class Hewan {
    String namaHewan;
    String alatGerak;
    String jenisMakanan;

    public Hewan(String namaHewan, String alatGerak, String jenisMakanan) {
        this.namaHewan = namaHewan;
        this.alatGerak = alatGerak;
        this.jenisMakanan = jenisMakanan;
    }
    
   public void makan(){
       System.out.println(this.namaHewan+" Biasanya Makan "+this.jenisMakanan);
   }
   public void bergerak(){
       System.out.println(this.namaHewan+" Bergerak Dengan "+this.alatGerak);
   }
}
