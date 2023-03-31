package day17;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        //*Bir dizideki hiç bir sayının 50 den büyük olmadığını kontrol edin. Bilgi mesajı verin

        int[] sayilar = {23, 45, 32, 41, 49, 11};

        if (Arrays.stream(sayilar).allMatch(i -> i <= 50)) {
            System.out.println("bütün sayılar 50den küçüktür");
        } else {
            System.out.println("50den küçük olamyan sayılar vardır");
        }

        boolean hepsiKucukMu = true;
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > 50)
                hepsiKucukMu = false;

        }
        if (hepsiKucukMu) {
            System.out.println("bütün sayılar 50den küçüktür");
        } else {
            System.out.println("50den küçük olamyan sayılar vardır");
        }
    }
}
