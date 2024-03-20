/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : MLingkaran.java
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Lingkaran l = new Lingkaran(10.2);
        double radius = scan.nextDouble();
        System.out.println("Luas lingkaran dengan jejari " + radius + " adalah " + l.hitungLuas());
        System.out.println("Luas lingkaran dengan " + "jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}
