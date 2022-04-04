/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis;
import Interface.Animal;
import java.util.Scanner;
/**
 *
 * @author Christian Sirait
 */
public class Kuis {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal cetak = null;
        System.out.print("Masukan Nama Hewan : ");
        Scanner inputNama = new Scanner(System.in); 
        String nama = inputNama.next();
        System.out.print("Masukan Jenis Hewan : ");
        Scanner inputJenis = new Scanner(System.in); 
        String jenis = inputJenis.next();
        printAnimal an = new printAnimal(nama,jenis);
        an.makeSound();
        an.printAnimal(cetak);
        an.setName("cucuk");
        an.setType("kambing");
        an.makeSound();
        an.printAnimal(cetak);
        // TODO code application logic here
    }
    
}

