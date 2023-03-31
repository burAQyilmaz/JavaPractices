package day12;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir string'in palindromik olup olmadığını kontrol eden program (String Builder kullanma)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a text: ");

        String text = scanner.nextLine();

        String reverseText = "";

        for (int i = text.length()-1; i >=0  ; i--) {

            reverseText+= text.substring(i,i+1);
        }

        if (reverseText.equals(text))
        {
            System.out.println(text+ " kelimesi palindromiktir.");
        } else {
            System.out.println(text+ " kelimesi palindromik değildir.");
        }

    }
}
