package day5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

//kullanıcıdan 10 sayı al ve DİZİYE ata

        int[] sayilar= new int[10];

        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <10 ; i++) {

            System.out.println(i+1+ ". sayıyı girin: ");

            sayilar[i]= scanner.nextInt();

        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(sayilar[i]);

        };

    }
}
