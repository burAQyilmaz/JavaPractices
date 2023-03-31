package day13;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        //Bubble Sort: bir dizideki sayıları bubble sort yöntemiyle büyükten küçüğe sıralayan bir Java programı yazın.

        int[] sayilar = {4, 67, 54, 32, 1, 90, 27, 15};

        for (int j = 0; j < sayilar.length-1; j++) { // bu for u da, en sona en küçüğü sona attırdıktan sonra bunu tekrarlatarak tüm elemanları sıralamak

            for (int i = 1; i < sayilar.length; i++) {

                if (sayilar[i - 1] < sayilar[i]) {
                    int temp = sayilar[i - 1];
                    sayilar[i - 1] = sayilar[i];
                    sayilar[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(sayilar));

    }
}
