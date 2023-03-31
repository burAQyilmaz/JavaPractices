package day16;

import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        // *Bir dizideki çift elemanların ortalamasını bulan bir program yazın

        int[] numbers = {23, 44, 3, 7, 56, 128, 27, 9};

        int sum = 0;

        int sayac = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                sum += numbers[i];
                sayac++;

            }

        }
        System.out.println((double) sum / sayac);

        System.out.println(Arrays.stream(numbers).filter(i->i % 2 == 0).average().getAsDouble());

    }
}
