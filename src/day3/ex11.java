package day3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Kullanıcıdan bir metin ve bir sayı al. Metni aldığın sayı kadar ekrana yazdır.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a text: ");

        String txt = scanner.nextLine();

        System.out.print("Input a number: ");

        int num = scanner.nextInt();



        for (int i = 1; i <= num; i++) {
            System.out.println(txt);

        }
    }
}
