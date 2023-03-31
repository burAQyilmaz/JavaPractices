package day19;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //*Kullanıcının girdiği bir verinin aşağıdaki özelliklere sahip olup olmadığını kontrol edin:
        //>10 numerik karakterden oluşmalı
        //>İlk karakteri 5 olmalı
        //Kontrol sonrası Girilen numarayı ekrana 541 251 41 90 formatında yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input phone number: ");

        String phoneNumber = scanner.nextLine();



        if (phoneNumber.matches("[0-9]+") && phoneNumber.startsWith("5") &&phoneNumber.length()==10) {

            System.out.println(phoneNumber.substring(0, 3) + " " + phoneNumber.substring(3, 6) + " " + phoneNumber.substring(6, 8) + " " + phoneNumber.substring(8, 10));
        } else {
            System.out.println("Invalid");
        }


    }
}
