/*
 * Nama       : Asy'syifa Shabrina Munir
 * NIM        : 24060122130055
 * Nama File  : MTitik.java
 * Deskripsi  : Main class dari program Titik
 */

public class MTitik {
    public static void main(String[] args){
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(5, 6);

        System.out.println("Jumlah objek titik adalah " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        //getJarakPusat
        System.out.println("Jarak t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ") ke titik pusat adalah " + t3.getJarakPusat());

        //refleksiX
        t2.refleksiX();
        System.out.println("Refleksi terhadap sumbu X adalah t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");

        //refleksiY
        t2.refleksiY();
        System.out.println("Refleksi terhadap sumbu Y adalah t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");

        //refleksiX tanpa mengubah titik asli
        Titik tRefleksiX = t3.getRefleksiX();
        System.out.println("Refleksi terhadap sumbu X adalah t3RefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");

        //refleksiY tanpa mengubah titik asli
        Titik tRefleksiY = t3.getRefleksiY();
        System.out.println(("Refleksi terhadap sumbu Y adalah t3RefleksiY(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")"));
    }
}

/*KESIMPULAN
 * Untuk pemanggilan atribut di main menggunakan getter atau setter karena atribut adalah private jadi tidak dapat diakses langsung dari class lain.
 * Untuk pemanggilan method dan konstruktor dapat langsung memanggil method dan konstruktornya langsung karena method dan konstruktor memiliki access modifier public.
 * 
 * Perbedaan antara refleksiX dan refleksiY dengan getRefleksiX dan getRefleksiY
 * Jika refleksiX dan refleksiY akan langsung merefleksikan titik aslinya, jadi titik asli akan berubah.
 * Jika getRefleksiX dan getRefleksiY maka dapat menghasilkan titik baru hasil refleksi, dengan method ini dapat
 * menghasilkan titik baru hasil refleksi tanpa mengubah titik aslinya yaitu dengan menyimpan dalam variabel baru.
 * 
 * Saat atribut diubah access modifiernya dari private menjadi public maka atribut dapat diakses diakses langsung dari luar class tersebut, 
 * maka tidak dapat menyembunyikan detail dari objeknya sehingga tidak memenuhi data/information hiding yang merupakan 
 * bentuk dari enkapsulasi.
 * Saat konstruktor dan method diubah access modifiernya dari public menjadi private maka tidak dapat diakses di luar class tersebut,
 * sehingga konstruktor dan methodnya tidak dapat digunakan di selain class tersebut. 
 * 
 * Jadi, public adalah access modifier yang dapat menjadikannya dapat diakses langsung dari luar classnya sedangkan
 * private adalah access modifier yang dapat menjadikannya tidak dapat diakses langsung dari luar classnya. 
 * Untuk enkapsulasi maka atribut akan memiliki access modifier private, untuk method dan kontruktor akan memiliki
 * access modifiernya yaitu public. 
 * Untuk atribut karena private tidak dapat diakses langsung, maka dapat diakses melalui methodnya yaitu getter atau setter.
 */
