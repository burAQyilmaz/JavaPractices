package day11;

import java.util.stream.IntStream;

public class ex10 {
    public static void main(String[] args) {
        //*[10-99] aralığında rakamlarının kareleri toplamı kendine eşit olan kaç sayı olduğunu bulan bir program yazın.

        int sayac = 0;

        for (int i = 10; i <100 ; i++) {
            if((i % 10)*(i % 10)+(i / 10)*(i / 10)==i){
                sayac++;

            }

        }
        System.out.println(sayac);

        // System.out.println(IntStream.range(10,100).filter(i->(i % 10)*(i % 10)+(i / 10)*(i / 10)==i).count());
    }
}
