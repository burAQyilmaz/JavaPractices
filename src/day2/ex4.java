package day2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        /*
        1. kullanıcıdan ismini al
        2. ekrana 100 defa sıralı şekilde ismini yazdır
        örnek:
        1. ahmet
        2. ahmet
        .
        .
        .
        100. ahmet
         */

        Scanner giris=new Scanner(System.in);

        System.out.print("Input your name please: ");

        String name= giris.nextLine();

        for (int i = 1; i <101 ; i++) {

            System.out.println(i+". "+name);

        }




    }
}
