package day15;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {

        //*Bir diziyi yan yana bulunan elemanlar küçükten büyüğe sıralanmayacak şekilde düzenleyin ve yazdırın

        int[] sayilar= {4, 67, 54, 2, 90, 28, 18, 3};


        for (int j = 0; j < sayilar.length; j++) {

            for (int i = 1; i < sayilar.length; i++) {

                if (sayilar[i - 1] < sayilar[i]) { //ikisini yer değiştir

                    int temp = sayilar[i];
                    sayilar[i] = sayilar[i - 1];
                    sayilar[i - 1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(sayilar));


    }
}
