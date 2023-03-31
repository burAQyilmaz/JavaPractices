package day2;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        /*
        kullanıcıdan bir sayı al
        1den bu sayıya kadar bütün sayıların toplamını ekrana yazdır
         */

        Scanner giris=new Scanner(System.in);

        System.out.print("Input a number: ");

        int num= giris.nextInt();

        int result=0;

        for (int i = 1; i <=num ; i++) {

            result=result+i;

            //result+=i; doğru yazım şekli
        }

        System.out.println("Result is "+result);





    }




}
