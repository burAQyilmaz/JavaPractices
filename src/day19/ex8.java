package day19;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //*Kullanıcı çift bir sayı girene kadar devam eden bir kod yazın.
        // Kodunuz numerik olmayan girişleri de kontrol edip gerekli bildirimleri vermeli

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an even number: ");

        while (true) {

            String number = scanner.nextLine();

            if (number.matches("[0-9]+")) {

                int numberInt = Integer.parseInt(number);

                if (numberInt % 2 == 0) {

                    System.out.println("Thanks");

                    break;

                } else {

                    System.out.print("Please input an even number: ");
                }

            } else {
                System.out.print("You must input numeric values: ");
            }

        }
    }
}
