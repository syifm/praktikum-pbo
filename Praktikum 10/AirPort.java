/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Airport.java
 * Deskripsi : Kelas Airport
 */

public class AirPort{
    private Airplane airplane;
    private String name;

    public AirPort(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return airplane.toString() + "mendarat";
        }
        else{
            return airplane.toString() + "tidak mendarat";
        }
    }
}