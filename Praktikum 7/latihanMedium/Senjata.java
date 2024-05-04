/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Senjata.java
 * Deskripsi : Program untuk senjata
 */
package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
