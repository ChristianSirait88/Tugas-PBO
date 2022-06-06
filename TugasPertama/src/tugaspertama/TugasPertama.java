/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public class TugasPertama {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = null, kekuatan = null,makan=null;
        Gatotkaca gatot = new Gatotkaca(nama, kekuatan);
        SpiderMan man = new SpiderMan(nama,kekuatan,makan);
        gatot.setNamaOrang("Andi");
        gatot.setKekuatanSuper("Tenaga Dalam");
        gatot.setTenaga(150);
        gatot.Terbang(); // error disini (nama tidak terdeteksi)
        gatot.berlatih();
        gatot.mengangkat();
        gatot.makan();
        gatot.bergerak();
        gatot.cekTenaga();
        man.setNamaAsli("joni");
        man.setKekuatanSuper("Tenaga Luar");
        man.menagkap(); // error disini (nama tidak terdeteksi)
        man.mengikat(); // error disini (nama tidak terdeteksi)
        man.melompat();
        man.rolling();
        man.makan(); // error disini (nama tidak terdeteksi) dan makanan tidak ada setter dan getter
        man.berlatih();
    }
    
}
