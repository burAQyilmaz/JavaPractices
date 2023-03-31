package day2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

       //System.out.println("seni seviyorum!!! ".repeat(10) );//defa yazdırma

        //System.out.println("seni seviyorum. ".replace("seni", "beni"));//metnin içindekileri değiştirme

        /*
        1) kullanıcıdan bir metni al
        2) metnin içindeki "a" harflerini "o" ya çevir
        3) bütün harflarini küçük harf yap
        4) son hali ekrana yazdır
         */

        Scanner giris= new Scanner(System.in);

        System.out.print("Write your most like sentence: ");

        String text= giris.nextLine();

        text=text.replace("a","o");//değiştirdiği metni saklaması için text= yazıyoruz

        text=text.toLowerCase();

        System.out.println(text);











    }
}
