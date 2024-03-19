/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : bukuNovel.java
 * Deskripsi : Representasi dasar dari buku novel, turunan dari buku fiksi dan buku
 */

package bk.bukuFiksi;

public class bukuNovel extends bukuFiksi{
    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}
