package day11;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //*Kullanıcıdan bir sayı alın
        // eğer sayı önceden tanımlanmış dizi içinde varsa "Sayı listede var."  Yoksa "Sayı listede yok." yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");

        int num = scanner.nextInt();

        int[] sayilar = {1, 45, 3, 87, 93, 30, 6};

        boolean varmi = false;

        for (int i = 0; i < sayilar.length; i++) {

            if (num == sayilar[i]) {
                varmi = true;
                break;
            }

        }

        if (varmi == true) {
            System.out.println("Sayı listede var.");
        } else {
            System.out.println("Sayı listede yok.");
        }

       /* if (Arrays.stream(sayilar).filter(i -> i == num).count() >= 1) {
            System.out.println("Sayı listede var.");
        } else {
            System.out.println("Sayı listede yok.");
        }*/

    }
}