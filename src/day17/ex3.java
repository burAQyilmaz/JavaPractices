package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        // *Bir dizideki elemanlardan en az birinin tek olup olmadığını doğrulayın ve dönüt verin

        int[] sayilar = {12, 34, 56, 78, 90, 1};

        boolean enAzBiriTekMi = false;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 != 0)
                enAzBiriTekMi = true;

        }

        if (enAzBiriTekMi) {
            System.out.println("en az biri tek");
        } else {
            System.out.println("en az biri tek değil");
        }


        if (Arrays.stream(sayilar).anyMatch(i -> i % 2 != 0)) {
            System.out.println("en az biri tek");
        } else {
            System.out.println("en az biri tek değil");
        }

    }
}
