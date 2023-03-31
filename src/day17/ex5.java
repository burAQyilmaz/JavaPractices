package day17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex5 {
    public static void main(String[] args) {

    //*4 basamaklı ve rakamları arasında 4,5 ve 9 olmayan olmayan bütün sayıları yazdırın.

    int[] rakam = {0,1,2,3,6,7,8};

        for (int i = 1; i < rakam.length; i++) {
            for (int j = 0; j < rakam.length; j++) {
                for (int k = 0; k < rakam.length; k++) {
                    for (int l = 0; l < rakam.length; l++) {

                        System.out.println(rakam[i]*1000+rakam[j]*100+rakam[k]*10+rakam[l]);

                    }

                }

            }

        }


    }
}
