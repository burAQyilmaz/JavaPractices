package day16;

import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        // *Bir dizideki elemanlardan ortalamadan büyük olanları yazdırın.

        int[] numbers = {23, 56, 2, 98, 234, 11, 5};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > (double) sum / numbers.length) {

                System.out.println(numbers[i]);

            }
        }


        Arrays.stream(numbers).filter(i -> i > Arrays.stream(numbers).average().getAsDouble()).forEach(System.out::println);

    }
}
