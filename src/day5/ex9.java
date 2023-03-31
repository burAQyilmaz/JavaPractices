package day5;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //8–Üç basamaklı sayının tersini yazdıran fonksiyon

        int num=234;

        tersnum(num);


    }

    private static void tersnum(int num) {

        int yuzler=num/100;
        int onlar=(num/10) % 10;
        int birler=num % 10;

        System.out.println(100*birler+10*onlar+yuzler);
    }
}
