/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : bukuAkademik.java
 * Deskripsi : Representasi dasar dari buku akademik, turunan dari buku non fiksi dan buku
 */

package bk.bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi{
    public bukuAkademik(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }
}
