package day9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Write a Java program that takes five numbers as input to calculate and print the average of the numbers

        Scanner scanner=new Scanner(System.in);

        int[]sayilar=new int[5];

        int sum=0;

        for (int i =0 ; i < 5; i++) {

            System.out.println("Input number"+ (i+1) +" : ");

            sayilar[i]=scanner.nextInt();

            sum+=sayilar[i];
        }
        System.out.println((double) sum/5);

        // System.out.println(Arrays.stream(sayilar).average().getAsDouble());
    }
}
