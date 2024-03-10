/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : MenuTidakTersediaException.java
 * Deskripsi : Eksepsi yang dihasilkan ketika pengguna memilih menu yang tersedia
 */

public class MenuTidakTersediaException extends Exception {
    public MenuTidakTersediaException(String message) {
        super(message);
    }
}
