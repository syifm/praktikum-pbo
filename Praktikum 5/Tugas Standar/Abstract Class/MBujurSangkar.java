/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : MBujurSangkar.java
 * Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }    
}

//Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? Jelaskan!
//Jawab : Akan terjadi error, karena ada metode abstrak yang belum diimplentasikan karena kelas BujurSangkar adalah kelas non abstract maka tidak boleh ada metode abstrak,
//        jadi seharusnya semua metode abstrak yang ada pada kelas BangunDatar yang diwarisi oleh kelas BujurSangkar diimplementasikan semua di kelas BujurSangkar.