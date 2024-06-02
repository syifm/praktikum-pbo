/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Superman.java
 * Deskripsi : Kelas Superman yang mewarisi kelas abstrak Kryptonian
 */

public class Superman extends Kryptonian{
    public Superman(String name){
        System.out.println("Superman ini bernama" + name);
    }

    public void takeOff(){
        System.out.println("Superman lepas landas");
    }

    public void land(){
        System.out.println("Superman mendarat");
    }

    public void fly(){
        System.out.println("Superman terbang di langit");
    }

    public void leapBuilding(){
        System.out.println("Superman melompati bangunan-bangunan");
    }
    
    public void stopBullet(){
        System.out.println("Superman menghentikan peluru");
    }

    public void eat(){
        System.out.println("Superman makan");
    }
}
