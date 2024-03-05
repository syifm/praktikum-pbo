/*
 * Nama      : Asy'syifa Shabrina Munir
 * NIM       : 24060122130055
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan ekspresi menggunakan class library Java
 */

public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
