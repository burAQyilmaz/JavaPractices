package day11;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {

        //5000 den küçük 13 ve 17 ile bölünebilen en büyük iki sayıyı yazdırın

        int sayac = 0;

        for (int i = 4999; i >= 0; i--) {
            if (i % 13 == 0 && i % 17 == 0) {
                System.out.println(i);
                sayac++;
                if (sayac == 2) {
                    break;
                }

            }
        }


    }
}
