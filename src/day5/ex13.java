package day5;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        //kullanıcıdan beş tane sayı al, bu sayıları bir dizi içinde tut, en küçük elemanı yazdır

        int[] sayilar = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input number " + (i+1) + ":");

            sayilar[i] = scanner.nextInt();

        }
        int enKucuk = sayilar[0];

        for (int i = 0; i < 5; i++) {
            if (enKucuk > sayilar[i]) {
                enKucuk = sayilar[i];
            }


        }
        System.out.println(enKucuk);

    }
}
