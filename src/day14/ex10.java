package day14;

import java.util.stream.IntStream;

public class ex10 {
    public static void main(String[] args) {
        // 30dan 500e kadarki çif sayıların ortalamasını alan program yazın

        int sum=0;
        int sayac=0;

        for (int i = 30; i <=500 ; i+=2) {
            sum+=i;
            sayac++;

        }
        System.out.println((double) sum/sayac);

        System.out.println(IntStream.range(30,501).filter(i->i%2==0).average().getAsDouble());
    }
}
