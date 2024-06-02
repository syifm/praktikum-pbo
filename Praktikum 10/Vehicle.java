/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Vehicle.java
 * Deskripsi : Kelas abstrak Vehicle
 */

public abstract class Vehicle{
    public double calcFuelEfficiency(){
        return 0.0;
    }

    public double calcTripDistance() {
        return 0.0;
    }
    
    public String toString(){
        return this.getClass().getSimpleName();
    }
}