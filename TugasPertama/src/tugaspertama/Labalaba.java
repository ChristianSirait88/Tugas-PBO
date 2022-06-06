/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public class Labalaba extends Hewan {
    
    public Labalaba(String namaHewan, String alatGerak, String jenisMakanan) {
        super(namaHewan, alatGerak, jenisMakanan);
    }
    public void menagkap(){
        System.out.println(this.namaHewan + " Menangkap "+this.jenisMakanan);
    }
    public void mengikat(){
        System.out.println(this.namaHewan + " dengan " + this.alatGerak + " Dapat mengikat lawannya atau mangsanya");
    }
}
