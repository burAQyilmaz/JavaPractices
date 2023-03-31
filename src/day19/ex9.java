package day19;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        /*
        *Girilen bir değerin geçerli bir tckn olup olmadığını aşağıdaki kurallara göre sorgulayın
1 – TC Kimlik Numaraları 11 karakter olmak zorundadır.

2 – Her hanesi bir rakam olmaldır.

3 – İlk hanesi 0 (sıfır) olamaz

4 – isEqual= 1, 3, 5, 7, 9 basamaklarının toplamının 7 katından, 2, 4, 6, 8 basamaklarının toplamını çıkarttığımızda
* elde ettiğimiz sonucun 10’a bölümünden kalan sayı (MOD10)  10. basamaktaki sayıyı vermelidir.

5 – İlk 10 hanenin toplamından elde edilen sonucun 10’a bölümünden kalan sayı (MOD10) 11. basamaktaki sayıyı vermelidir.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input ID: ");

        String number = scanner.nextLine();

        int sumOfFirstTenNumbers = Integer.parseInt(number.substring(0, 1))
                + Integer.parseInt(number.substring(2, 3))
                + Integer.parseInt(number.substring(4, 5))
                + Integer.parseInt(number.substring(6, 7))
                + Integer.parseInt(number.substring(8, 9))
                + Integer.parseInt(number.substring(1, 2))
                + Integer.parseInt(number.substring(3, 4))
                + Integer.parseInt(number.substring(5, 6))
                + Integer.parseInt(number.substring(7, 8))
                + Integer.parseInt(number.substring(9, 10));

        boolean isEqual= ((Integer.parseInt(number.substring(0, 1))
                + Integer.parseInt(number.substring(2, 3))
                + Integer.parseInt(number.substring(4, 5))
                + Integer.parseInt(number.substring(6, 7))
                + Integer.parseInt(number.substring(8, 9))) * 7
                - (Integer.parseInt(number.substring(3, 4))
                + Integer.parseInt(number.substring(5, 6))
                + Integer.parseInt(number.substring(1, 2))
                + Integer.parseInt(number.substring(7, 8)))) % 10 == Integer.parseInt(number.substring(9, 10));

        if (number.length() == 11 && number.matches("[0-9]+") && !number.startsWith("0")) {

            if (isEqual) {

                if (sumOfFirstTenNumbers % 10 == Integer.parseInt(number.substring(10, 11))) {

                    System.out.println("Thanks");

                } else {
                    System.out.println("Invalid");

                }
            } else {
                System.out.println("Invalid");

            }
        } else {
            System.out.println("Invalid");

        }

    }
}
