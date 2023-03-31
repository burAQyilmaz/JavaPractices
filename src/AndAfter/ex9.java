package AndAfter;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        //Write a program to find the least common multiple of two numbers (EKOK)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input second number:");
        int num2 = scanner.nextInt();

        int max=Math.max(num1,num2);

        for (int i = max; i <= num1*num2; i++) {

            if (i % num1 == 0 && i % num2 == 0) {

                System.out.println(i);
                break;
            }
        }

    }
}
