package day11;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        //*Kullanıcıdan 5 ders ve bu derslerin notlarını alın bunları iki farklı dizide saklayın ve
        // her bir ders notunu ekrana yazdırın.

        Scanner scanner = new Scanner(System.in);

        String[] lessons = new String[5];

        int[] notes = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Input a lesson name: ");

            lessons[i] = scanner.nextLine();

            System.out.print("Input its note: ");

            notes[i] = scanner.nextInt();

            scanner.nextLine(); //buffer clean DONT FORGET!!!

        }

        for (int i = 0; i < 5; i++) {

            System.out.println(lessons[i] + " dersinin notu: " + notes[i]);

        }

    }
}
