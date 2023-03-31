package day12;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir string'de bulunan tüm kelimeleri büyük harfe dönüştüren program

        Scanner scanner=new Scanner(System.in);

        System.out.print("Input a text: ");

        String text= scanner.nextLine();

        System.out.println(text.toUpperCase());

    }
}
