package day9;

import java.util.stream.IntStream;

public class ex6 {
    public static void main(String[] args) {
        // *[1000-2000] aralığındaki yüzler basamağı 6 olan sayıların ortalamasını bulan bir program yazın.

        double sum=0;
        double sayac=0;

        for (int i = 1000; i <=2000 ; i++) {
            if((i/100)%10==6){
                sum+=i;
                sayac++;

            }

        }
        double mean=sum/sayac;
        System.out.println(mean);

        // System.out.println(IntStream.range(1000,2001).filter(i-> i/100 % 10 ==6).average());
    }
}
