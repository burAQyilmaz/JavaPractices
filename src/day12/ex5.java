package day12;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Kullanıcının girdiği iki sayı arasındaki sayıları bulan program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1= scanner.nextInt();

        System.out.print("Input second number: ");

        int num2= scanner.nextInt();

        for (int i = Math.min(num1, num2)+1; i < Math.max(num1, num2); i++) {
            System.out.print(i+ " ");

        }




    }
}
