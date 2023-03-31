package day11;

import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        // *1000 den başlayarak yirmi dörder azalan 25 elemanlı bir dizi oluşturun ve diziyi ekrana yazdırın.

        int[] sayilar = new int[25];

        int sayac = 0;

        for (int i =1000; i >=0 ; i-=24) {

            sayilar[sayac]=i;
            sayac++;
            System.out.println(i);
            if(sayac==25){
                break;
            }

        }


    }
}
