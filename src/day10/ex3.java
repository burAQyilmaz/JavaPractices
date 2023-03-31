package day10;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {

        //*Bir dizinin elemanlarının küplerinin ortalamasını alan bir program yazın.

        int[]numbers = {32, 7, 34, 45, 56, 67, 3, 91};

        int kupTop = 0;

        for (int i = 0; i < numbers.length; i++) {

          kupTop += Math.pow(numbers[i],3);

        }
        System.out.println((double)kupTop/ numbers.length);

//System.out.println(Arrays.stream(numbers).map(i->i*i*i).average().getAsDouble());

    }
}
