/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Senjata.java
 * Deskripsi : Program untuk senjata
 */
package latihanVerEasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        System.out.println("TAR");
        peluru = peluru - 1;
        System.out.println("Sisa Peluru: " + getPeluru());
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
