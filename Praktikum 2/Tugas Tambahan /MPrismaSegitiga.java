/*
 * Nama       : Asy'syifa Shabrina Munir
 * NIM        : 24060122130055
 * Nama File  : MPrismaSegitiga.java
 * Deskripsi  : Main class dari program Prisma Segitiga
 */

public class MPrismaSegitiga {
    public static void main (String[] args){
        Segitiga segitiga1 = new Segitiga(3, 4);
        PrismaSegitiga prisma1 = new PrismaSegitiga(segitiga1, 5);

        System.out.println("Volume prisma segitiga ini adalah " + prisma1.hitungVolume());
        System.out.println("Luas permukaan prisma segitiga ini adalah " + prisma1.hitungLuasPermukaan());
    }
}
