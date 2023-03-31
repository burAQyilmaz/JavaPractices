package day12;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Kullanıcının girdiği sayı kadar satır ve sütundan oluşan bir kare çizdirme programı

        Scanner scanner= new Scanner(System.in);

        System.out.print("ınput a number: ");

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("*  ".repeat(num));

        }

    }
}
