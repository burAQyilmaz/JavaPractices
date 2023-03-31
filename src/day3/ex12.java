package day3;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        //Girilenn metnin karakter sayısını ekran yazdır.

        Scanner scanner=new Scanner(System.in);

        System.out.println("ınput a text: ");

        String txt= scanner.nextLine();

        int txtln=txt.length();

        System.out.println(txtln);
    }
}
