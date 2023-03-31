package day5;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        //4-Sayının çarpanlarını gösteren fonksiyon

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();


        bolenler(num);


    }


    private static void bolenler(int num) {

        for (int i = 1; i <=num; i++) {
            if (num % i == 0) {
                ;
                System.out.println(i);
            }
        }
    }
}
