package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args){
        bukuFiksi fiksi = new bukuFiksi("Hai, Miiko 25", "Ono Eriko", "2013", "Komedi", 192, 28000);
        fiksi.view();
        System.out.println();

        bukuNovel novel = new bukuNovel("Hujan", "Tere Liye", "2014", "Science Fiction (Sci-Fi)", 320, 89000);
        novel.view();
        System.out.println();

        bukuNonFiksi nonfiksi = new bukuNonFiksi("Ikigai: Rahasia Hidup Bahagia dan Panjang Umur Orang Jepang", "Hector Garcia dan Francesc Miralles", "2019", "Psikologi, Perbaikan Diri", 232, 90500);
        nonfiksi.view();
        System.out.println();

        bukuAkademik akademik = new bukuAkademik("Sobotta Atlas Anatomi Manusia Edisi 24 Volume 2: Organ Internal", "Friedrich Paulsen dan Jens Waschke", "2019", "Anatomi Manusia, Kedokteran", 344, 600000);
        akademik.view();

    }    
}
