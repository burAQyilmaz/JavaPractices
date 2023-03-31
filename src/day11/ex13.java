package day11;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
       // *Kullanıcıdan iki sayı alın. Küçük sayıyı büyük sayı kadar yan yana yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");

        int num2 = scanner.nextInt();

        for (int i = 0; i < Math.max(num1, num2); i++) {

            System.out.print(Math.min(num1, num2) + " ");

        }





    }
}
