/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : AngkaSialExcpetion.java
 * Deskripsi : Ekspresi buatan sendiri, menolak masukan angka 13!
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!!!");
    }
}
