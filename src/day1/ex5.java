package day1;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a number please: ");

        int num= scanner.nextInt();

        for (int i = 1; i <num+1 ; i++) {

            System.out.println(i+". number");
        }




    }
}
