package day12;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Kullanıcının girdiği bir sayının pozitif çarpanlarını bulan program

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a number: ");

        int num= scanner.nextInt();

        for (int i = 1; i <=num ; i++) {

            if(num % i == 0) {

                System.out.println(i);

            }

        }



    }
}
