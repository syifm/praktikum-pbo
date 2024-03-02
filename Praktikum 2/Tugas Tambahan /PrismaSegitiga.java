/*
 * Nama       : Asy'syifa Shabrina Munir
 * NIM        : 24060122130055
 * Nama File  : PrismaSegitiga.java
 * Deskripsi  : Program class Prisma Segitiga
 */

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return (alas.hitungLuas() * tinggiPrisma);
    }

    public double hitungLuasPermukaan(){
        return (2 * alas.hitungLuas() + ((alas.getAlas() + alas.getAlas() + alas.getAlas()) * tinggiPrisma));
    }
}
