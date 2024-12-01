/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author SALSABILA
 */
public class MatematikaCanggihBeraksi {
   
   public static void main(String[] args) {
        // Membuat objek dari MatematikaCanggihHaikal
        MatematikaCanggihSalsa matCanggih = new MatematikaCanggihSalsa();

        // Memanggil metode pertambahan
        int hasilTambah = matCanggih.tambah(20, 10);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        // Memanggil metode perkalian
        int hasilKali = matCanggih.kali(5, 4);
        System.out.println("Hasil Perkalian: " + hasilKali);

        // Memanggil metode modulus
        int hasilModulus = matCanggih.modulus(23, 7);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
   }
