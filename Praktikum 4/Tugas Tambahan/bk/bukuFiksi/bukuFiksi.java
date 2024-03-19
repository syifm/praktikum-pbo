/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : bukuFiksi.java
 * Deskripsi : Representasi dasar dari buku fiksi, turunan dari buku
 */

package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku{
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre(){
        return genre;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        super.view();
        System.out.println("Genre: " + getGenre());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
        System.out.println("Harga: Rp " + getHarga());
    }
}
