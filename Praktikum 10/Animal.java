/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Animal.java
 * Deskripsi : Kelas abstrak Animal
 */

public abstract class Animal {
    public abstract void eat();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
