package AndAfter;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        /*
        //Write a program to find the greatest common divisor of two numbers (EBOB)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input second number:");
        int num2 = scanner.nextInt();

        int min = Math.min(num1, num2);

        for (int i = min; i >=1 ; i--) {

            if (num1 % i == 0 && num2 % i == 0) {

                System.out.println(i);
                break;
            }
        }

    }
}
