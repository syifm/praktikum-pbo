/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : KontrolSenjata.java
 * Deskripsi : Program untuk kontrol senjata
 */
package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + senjata.getPeluru());
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()){
            System.out.println("Peluru Habis");
        }
        else{
            for (int i = 0; i < jumlah; i++){
               if (isAdaPeluru()){
                   System.out.println(senjata.getBunyi());
                   senjata.setPeluru(senjata.getPeluru()-1);
                }
                else{
                   System.out.println("Gagal tembak, Peluru Habis");
                }
            } 
            System.out.println(">> Peluru sisa = " + senjata.getPeluru());
        } 
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
