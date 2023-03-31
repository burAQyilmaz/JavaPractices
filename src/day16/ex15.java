package day16;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //Bir metin verildiğinde, metindeki her bir kelimenin tersini yazan Java programını yazın.

        String text = "pweofm ğrqvöm ğwegromv mtwprmv vm";

        Scanner scanner = new Scanner(text);

        while (scanner.hasNext()) {

            StringBuilder sb = new StringBuilder(scanner.next());

            System.out.print(sb.reverse() + " ");

        }

    }
}
