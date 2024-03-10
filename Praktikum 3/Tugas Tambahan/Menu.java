/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Menu.java
 * Deskripsi : Program untuk Menu
 */

public class Menu {
    private String nama;
    private double harga;
    private int stok;


    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public double getHarga() {
        return harga;
    }


    public void setHarga(double harga) {
        this.harga = harga;
    }


    public int getStok() {
        return stok;
    }


    public void setStok(int stok) {
        this.stok = stok;
    }


    public void kurangiStok(int jumlah) {
       // TO DO 1: Tambahkan metode untuk mengurangi stok
       stok = stok-jumlah;
    }
}
