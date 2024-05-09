/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Data.java
 * Deskripsi : Kelas konstruksi generic untuk Data
 */

public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}
