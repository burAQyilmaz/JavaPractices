package day3;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //Kullanıcıdan bir metin al. Aldığın metnin bütün karakterlerini büyük harf yap ve son metni ekrana yazdır.

        Scanner scanner=new Scanner(System.in);

        System.out.print("Input a text please: ");

        String txt= scanner.nextLine();

        System.out.println(txt.toUpperCase());


    }



}
