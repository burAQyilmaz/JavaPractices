package day17;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //*Bir dizideki bütün elemanların çift olup olmadığını kontrol edin bilgi mesajı verin.

        int[] sayilar = {12, 34, 56, 78, 90};

        if (Arrays.stream(sayilar).filter(i -> i % 2 == 0).count() == sayilar.length) {

            System.out.println(" dizinin tüm elemanları çift sayılardan oluşmaktadır");
        } else {
            System.out.println(" dizinin bazı elemanları çift sayılardan oluşmaktadır");
        }

        System.out.println("---------------------------------------------------------------");

        if (Arrays.stream(sayilar).allMatch(i -> i % 2 == 0)) {
            System.out.println(" dizinin tüm elemanları çift sayılardan oluşmaktadır");
        } else {
            System.out.println(" dizinin bazı elemanları çift sayılardan oluşmaktadır");
        }
        System.out.println("---------------------------------------------------------------");

        int sayac = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0)
                sayac++;

        }

        if (sayac == sayilar.length) {
            System.out.println(" dizinin tüm elemanları çift sayılardan oluşmaktadır");
        } else {
            System.out.println(" dizinin bazı elemanları çift sayılardan oluşmaktadır");
        }
        System.out.println("---------------------------------------------------------------");

        boolean hepsiCiftMi = true;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 != 0)
                hepsiCiftMi = false;

        }

        if (hepsiCiftMi) {
            System.out.println(" dizinin tüm elemanları çift sayılardan oluşmaktadır");
        } else {
            System.out.println(" dizinin bazı elemanları çift sayılardan oluşmaktadır");
        }
    }
}
