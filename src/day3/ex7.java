package day3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Kullanıcıdan bir metin al. Metni karakter sayısı kadar yazdır

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a text please: ");

        String txt = scanner.nextLine();

        int txlenght = txt.length(); //metnin uzunluğunu sayısal bir değişkene atadık ve döngüde bu sayıyı kullanarak yazdırdık

        for (int i = 1; i <= txlenght; i++) {
            System.out.println(txt);

        }


    }
}
