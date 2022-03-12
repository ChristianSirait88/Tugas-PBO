package BangunDatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Christian Sirait
 */
public class Main {
    
    public static void main(String[] args) {
        boolean cek =true;
        
        do {
            System.out.println("===================");
            System.out.println(" Menu Utama ");
            System.out.println("===================");
            System.out.println(" 1. Hitung Balok ");
            System.out.println(" 2. Hitung Tabung ");
            System.out.println(" 0. exit ");
            System.out.print(" Pilih :  ");
            Scanner inputMenu = new Scanner(System.in);
            int menu = inputMenu.nextInt(); // implementasi instalasi 
            switch(menu){ // penggunaan braching
                case 1 : 
                    System.out.println("Hitung Balok");
                    System.out.print("Masukan Panjang : ");
                    Scanner inputPanjang = new Scanner(System.in); 
                    double panjang = inputPanjang.nextInt();
                    System.out.print("Masukan Lebar : ");
                    Scanner inputLebar = new Scanner(System.in);
                    double lebar = inputLebar.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    Scanner inputTinggiBalok = new Scanner(System.in);// implementasi instalasi 
                    double tinggiBalok = inputTinggiBalok.nextInt();
                    PersegiPanjang persegi = new PersegiPanjang(panjang,lebar);// implementasi instalasi 
                    Balok balok = new Balok(panjang, lebar, tinggiBalok);
                    persegi.cetakLuas();
                    persegi.cetakKeliling();
                    balok.cetakVolume();
                    balok.cetakLP();
                    System.out.print("Apakah Anda Ingin Kembali ?(1 / 0) : ");
                    Scanner pilihanKembali2 = new Scanner(System.in);// implementasi instalasi 
                    int pilihan = pilihanKembali2.nextInt();
                    if (pilihan == 1) {
                        
                    }
                    else {
                        System.out.println("Terima Kasih Telah Menggunakan Program");
                        cek = false;
                    }
                    break;
                case 2 : 
                    System.out.println("Hitung Tabung");
                    System.out.print("Masukan Jari-Jari : ");
                    Scanner inputJari = new Scanner(System.in);// implementasi instalasi 
                    double jari = inputJari.nextDouble();
                    System.out.print("Masukan Tinggi : ");
                    Scanner inputTinggi = new Scanner(System.in);// implementasi instalasi 
                    double tinggi = inputTinggi.nextDouble();
                    Tabung tabung = new Tabung(jari, tinggi);// implementasi instalasi 
                    Lingkaran lingkaran = new Lingkaran(jari);// implementasi instalasi 
                    lingkaran.cetakLuas();
                    lingkaran.cetakKeliling();
                    tabung.cetakVolume();
                    tabung.cetakLP();
                    System.out.print("Apakah Anda Ingin Kembali ?(1 / 0) : "); // 1 jika ingin kembali, 0 jika inggin keluar
                    Scanner pilihanKembali = new Scanner(System.in);// implementasi instalasi 
                    int pilihan2 = pilihanKembali.nextInt();
                    if (pilihan2 == 1) {
                        
                    }
                    else {
                        System.out.println("Terima Kasih Telah Menggunakan Program");
                        cek = false;
                    }
                    break;
                case 0 : 
                    System.out.println("Terima Kasih Telah Menggunakan Program");
                    cek =false;
            }
        } while (cek);
       }
}
