package day5;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        //9-Herhangi bir sayının tersini yazdıran fonksiyon

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();

        reversenum(num);


    }

    private static void reversenum(int num) {
        String numString = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder(numString);
        System.out.println(stringBuilder.reverse());

    }
}
