package day11;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ex15 {
    public static void main(String[] args) {
        //Kullanıcıdan isim bilgisi alın (mutlaka harflerden oluşmalı)
        //Kullanıcıdan yaş bilgisi alın (mutlaka sayı olmalı)
        //Kullanıcıdan email bilgisi alın ( mutlaka içinde @ işareti geçmeli.)
        //Bu alınan bilgileri uygun bir formatta yazdırın.

        Scanner scanner = new Scanner(System.in);

        String name, age, email;

        while (true) {
            System.out.println("Input your name: ");

            name = scanner.nextLine();
            if(name.matches("[a-zA-Z]+")){
                System.out.println("name = " + name);
break;

            } else {
                System.out.println("Input your name with only alphabetic characters!!!");
            }

        }
        while (true) {
            System.out.println("Input your age: ");

            age = scanner.nextLine();

            if(age.matches("[0-9]+")) {
                System.out.println("age = " + age);
                break;
            } else {
                System.out.println("Input your age with only numeric characters!!!");
            }

        }
        while (true) {
            System.out.println("Input your e-mail: ");

            email = scanner.nextLine();

            if(email.contains("@")) {
                System.out.println("email = " + email);
                break;
            }else {
                System.out.println("Input your e-mail with \"@\"!!!");

            }

        }

        System.out.println("Adınız: "+name +"\n" + "Yaşınız: "+age+ "\n"+ "Mail Adresiniz: " + email);








    }
}
