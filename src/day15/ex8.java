package day15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        //*Bir dizideki elemanları tekrarsız şekilde yazdırın (tekrar eden elemanları bir kez yazdırin)

        int[] sayilar = {34, 56, 2, 34, 78, 11, 11, 9};

        for (int i = 0; i < sayilar.length; i++) {
            boolean yazdiralimMi = true;
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    yazdiralimMi = false;

                }
            }
            if (yazdiralimMi) System.out.println(sayilar[i]);

        }

        Arrays.stream(sayilar).distinct().forEach(System.out::println);

    }
}
