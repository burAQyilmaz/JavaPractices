package day8;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //*Bir dizideki en küçük ve en büyük sayıyı çarpan program yapın.

        int[]dizi= {23,4,6,12,87,345,78,99,5,2};

        Arrays.sort(dizi);

        int carp=dizi[0]*dizi[dizi.length-1];

        System.out.println("carp = " + carp);

    }
}
