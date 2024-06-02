/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : RiverBarge.java
 * Deskripsi : Kelas RiverBarge yang mewarisi kelas abstrak Vehicle
 */

public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.001;
    }

    public double calcTripDistance(){
        return calcFuelEfficiency() * 100;
    } 
}
