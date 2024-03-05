/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 *             jari-jari lingkaran yang bernilai nol
 */
//class lingkaran
import static java.lang.Math.PI;
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }

//class Asersi2
}
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println(("keliling lingkaran = " + kelilingLingkaran));
    }
}

/*Pertanyaan
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * => Letak dari assert di dalam class Asersi2 ini kurang tepat, seharusnya 
 * assert diletakkan dalam konstruktor Lingkaran yaitu pada public Lingkaran(double jariJari) dan 
 * diletakkan sebelum this.jariJari, sehingga ketika jariJarinya bernilai 0, maka objek lingkaran tidak dapat dibuat.
 */