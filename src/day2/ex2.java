package day2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        /*
        kullanıcıdan üç sayı alın ve ekrana toplamlarını yazdırın
         */

        Scanner giris= new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1= giris.nextInt();

        System.out.print("Input second number: ");

        int num2= giris.nextInt();

        System.out.print("Input third number: ");

        int num3= giris.nextInt();

        System.out.println("Result="+(num1+num2+num3));




    }
}
