/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : ArmadaKendaraan.java
 * Deskripsi : Kelas ArmadaKendaraan
 */

import java.util.*;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> kumpulanarmada;

    public ArmadaKendaraan(){
        kumpulanarmada = new ArrayList<>(); 
    }

    public void tambahArmada(Collection<? extends Vehicle> armada){
        kumpulanarmada.addAll(armada);
    }

    public ArrayList<Vehicle> getAllArmada(){
        return kumpulanarmada;
    }
}
