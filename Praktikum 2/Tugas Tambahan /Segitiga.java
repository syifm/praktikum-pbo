/*
 * Nama       : Asy'syifa Shabrina Munir
 * NIM        : 24060122130055
 * Nama File  : Segitiga.java
 * Deskripsi  : Program class Segitiga
 */

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double getSisiMiringSegitiga(){
        return Math.sqrt(Math.pow(getAlas()/2, 2) + Math.pow(getTinggiSegitiga(), 2));
    }

    public double hitungLuas(){
        return (0.5 * getAlas() * getTinggiSegitiga());
    }
}
