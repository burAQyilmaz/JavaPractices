package day2;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        /*
        kullanıcıdan başlangıç ve sonuç değerleri al
        aralıktaki bütün çift sayıları yazdır
         */

        Scanner giris=new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1= giris.nextInt();

        System.out.print("Input second number: ");

        int num2= giris.nextInt();

        for (int i = num1+1; i <num2 ; i++) {

            if(i % 2 ==0) {
                System.out.println(i);
            }

        }





    }
}
