/*
 * Nama       : Asy'syifa Shabrina Munir
 * NIM        : 24060122130055
 * Nama File  : MGaris.java
 * Deskripsi  : Main class dari program Garis
 */

public class MGaris {
    public static void main(String[] args){
        Titik t1 = new Titik(4, 5);
        Titik t2 = new Titik(8, 2);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();
        System.out.println("Titik awal adalah (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik akhir adalah (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");

        //getPanjang
        System.out.println("Panjang garis adalah " + G.getPanjang());

        //getGradien
        System.out.println("Gradien garis adalah " + G.getGradien());

        //getRefleksiY
        Garis GRefleksiY = G.getRefleksiY();
        System.out.println("Garis setelah direfleksikan terhadap sumbu Y adalah " + GRefleksiY.getGradien());

        //isTegakLurus
        System.out.println("Garis G tegak lurus dengan garis GRefleksiY? " + G.isTegakLurus(GRefleksiY));
    }
}
