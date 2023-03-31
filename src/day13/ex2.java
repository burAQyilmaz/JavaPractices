package day13;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir sayının çift bölenlerinin sayısını bulan program

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a number: ");

        int num= scanner.nextInt();

        for (int i = 2; i <=num ; i+=2) {

            if(num % i== 0)  System.out.println(i);

        }

    }
}
