package day7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //*Kullanıcıdan numerik bir karakter icermeyen bir giriş alana kadar devam eden ısrarcı bir kod yazın.

        Scanner scanner = new Scanner(System.in);


        while(true) {

            System.out.println("numerik bir karekter içermeyen metin giriniz: ");

            String text = scanner.nextLine();

            if (text.replaceAll("[0-9]", "").length()==text.length()) {
                System.out.println("giriş geçerli");
                break;
            } else
                System.out.println("giriş geçerli değil");


        }

    }
}
