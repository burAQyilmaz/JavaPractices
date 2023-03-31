package day2;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1= giris.nextInt();

        System.out.print("Input second number: ");

        int num2= giris.nextInt();
// koşul ifadesi
        if(num1>num2) {
            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
        }else{
            System.out.println("İkinci sayı birinciden büyüktür.");
        }

    }


}
