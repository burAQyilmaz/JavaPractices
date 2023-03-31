package day5;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        //11-Palindrome sayı(tersi kendisine eşit olan sayı)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();

        reversenum(num);


    }

    private static void reversenum(int num) {
        String numString = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder(numString);


        if (stringBuilder.reverse().toString().equals(numString)) {
            System.out.println("Palinderom");
        } else {
            System.out.println("palinderom değil");
        }

    }
}
