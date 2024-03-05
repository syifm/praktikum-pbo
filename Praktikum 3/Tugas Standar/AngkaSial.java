/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*Pertanyaan
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * => Ketika terjadi eksepsi seperti pada as.cobaAngka(13) karena termasuk angka sial maka, akan langsung
 * menuju ke AngkaSialException lalu menuju ke catch sehingga baris ke 12 tidak dieksekusi.
 * 
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * => Baris ke 21 ini hanya akan dieksekusi ketika terjadi eksepsi dan ketika tidak terjadi eksepsi 
 * maka tidak akan dieksekusi dan hanya akan mengeksekusi baris ke 12.
 */