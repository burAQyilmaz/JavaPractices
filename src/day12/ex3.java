package day12;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Kullanıcının girdiği sayı kadar satır ve sütundan oluşan içi boş bir kare çizdirme programı

        Scanner scanner = new Scanner(System.in);

        System.out.print("ınput a number: ");

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == num-1) {
                System.out.println("*  ".repeat(num));
            } else {
                System.out.println("*  " + "   ".repeat(num - 2) + "*  ");

            }

        }

    }
}
