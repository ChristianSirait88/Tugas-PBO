/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public class SpiderMan extends Labalaba implements Parkour {
    
    String namaAsli;
    String kekuatanSuper;
    public SpiderMan(String namaAsli, String kekuatanSuper, String jenisMakanan) {
        super(namaAsli, kekuatanSuper, jenisMakanan);
        this.kekuatanSuper = kekuatanSuper;
        this.namaAsli = namaAsli;
    }

    public String getNamaAsli() {
        return namaAsli;
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    public String getKekuatanSuper() {
        return kekuatanSuper;
    }

    public void setKekuatanSuper(String kekuatanSuper) {
        this.kekuatanSuper = kekuatanSuper;
    }

    @Override
    public void mengikat() {
        super.mengikat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void menagkap() {
        super.menagkap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    @Override
    public void melompat() {
        System.out.println(this.namaAsli + " dapat Melompat jauh karena "+this.kekuatanSuper);
    }

    @Override
    public void rolling() {
        System.out.println(this.namaAsli + " rolling tiap hari");
    }

    @Override
    public void berlatih() {
        System.out.println("agar Bugar "+this.namaAsli + " Berlatih tiap hari");
    }
    
}
