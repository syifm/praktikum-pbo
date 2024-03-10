/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : JumlahPesananMelebihiStokException.java
 * Deskripsi : Eksepsi yang dihasilkan ketika jumlah pesanan lebih dari stok yang tersedia
 */

public class JumlahPesananMelebihiStokException extends Exception {
    // TO DO 2: Buat konstructor dengan parameter message dan panggil konstruktor parent dengan keyword super
    public JumlahPesananMelebihiStokException(String message) {
        super(message);
    }
}

