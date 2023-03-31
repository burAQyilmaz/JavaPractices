package day5;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir şifre alın ve şifrenin sadece rakamlardan oluşup oluşmadığı
        sorgulayın. Eğer şifre numerikse giriş başarılı değilse şifre hatalı yazdırın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a code: ");
        String code = scanner.nextLine();

        String newCode = code.replaceAll("[^0-9]", "");

        if (code.length() == newCode.length()) {
            System.out.println("giriş başarılı");
        } else {
            System.out.println("giriş başarılı değil");
        }
    }
}
