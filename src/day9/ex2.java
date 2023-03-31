package day9;

import java.util.stream.IntStream;

public class ex2 {
    public static void main(String[] args) {
        //Bir den yüze kadarki bütün sayıların karesini alın
        // ve sonuçları toplayın sonucu ekrana yazdırın.

        int sum=0;

        for (int i = 1; i <=100 ; i++) {

            sum+=(i*i);
        }
        System.out.println(sum);

        /*
        IntStream.range(1,101).map(i->i*i).sum();  IntStream.range sayı aralığı, map:dönüştürüyor, sum:topluyor
        System.out.println(IntStream.range(1,101).map(i->i*i).sum());
         */





    }
}
