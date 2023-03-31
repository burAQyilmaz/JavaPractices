package day19;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //*Girilen bir sayının bütün rakamlarının çift olup olmadığını sorgulayin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");

        int number = scanner.nextInt();

        int b1 = 0;

        boolean cift = true;

        while (number > 0) {

            b1 = number % 10;

            if (b1 % 2 != 0) {
                cift = false;
                break;
            }
            number = number / 10;

        }
        if (cift) {
            System.out.println("Number's all digits are even.");
        } else {
            System.out.println("Invalid");
        }
    }
}
