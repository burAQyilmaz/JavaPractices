package day10;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        //*Girilen sayının rakamları toplamını yazdıran bir fonksiyon yazın

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");

        int num = scanner.nextInt();

        sumOfDig(num);

    }

    private static void sumOfDig(int num) {

        int sumdig = 0;

        while (num>0) { //25

            sumdig += (num % 10); //5

            num = num/10; //2
        }
        System.out.println(sumdig);

    }
}
