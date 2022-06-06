/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

/**
 *
 * @author Christian Sirait
 */
public class Gatotkaca extends Burung implements Manusia,Mesin {

    String namaOrang;
    String kekuatanSuper;
    int Tenaga = batasTenaga;
    public Gatotkaca(String namaOrang, String kekuatanSuper) {
        super(namaOrang);
        this.namaOrang=namaOrang;
        this.kekuatanSuper=kekuatanSuper;
    }



    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    public String getKekuatanSuper() {
        return kekuatanSuper;
    }

    public void setKekuatanSuper(String kekuatanSuper) {
        this.kekuatanSuper = kekuatanSuper;
    }

    public int getTenaga() {
        return Tenaga;
    }

    public void setTenaga(int Tenaga) {
        this.Tenaga = Tenaga;
    }

    @Override
    void Terbang() {
        System.out.println("Karena " + this.kekuatanSuper+" "+this.namaOrang +" dapat terbang melintasi langit");
    }

    
    public void makan() {
        Tenaga=Tenaga+20;
        System.out.println(this.namaOrang + " Makan Untuk menambah tenaga");
    }

    @Override
    public void berlatih() {
        Tenaga=Tenaga*2;
        System.out.println("Agar Kuat " + this.namaOrang + " Selalu Berlatih");
    }

    @Override
    public void bergerak() {
        System.out.println(this.namaOrang + " Dapat bergerak dengan cepat");
    }

    @Override
    public void mengangkat() {
        Tenaga=Tenaga-200;
        System.out.println("dengan "+this.kekuatanSuper+ " "+this.namaOrang+" dapat mengangkat benda berat" );
    }
    void cekTenaga(){
        System.out.println(Tenaga);
    }

    @Override
    public void bekerja() {
        System.out.println("dalam penyamarannya " + this.namaOrang + " Bekerja sebagai pegawai");
    }
    
}
