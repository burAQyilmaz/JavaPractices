package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan yaş bilgisini al.
Yaş [1-3] aralığındaysa bebek
Yaş [4-13] aralığındaysa çocuk
Yaş [14-18] aralığındaysa ergen
Yaş 19 a eşit veya büyükse yetişkin yazdır.
         */

        Scanner giris = new Scanner(System.in);

        System.out.print("Input your age: ");

        int age = giris.nextInt();

       /* if (age >= 1 && age < 4) {
            System.out.println("bebek");
        }
        if (age >= 4 && age < 14) {
            System.out.println("çocuk");
        }
        if (age >= 14 && age < 19) {
            System.out.println("ergen");

        }
        if (age >= 19) {
            System.out.println("yetişkin");
        } */
// kısa ve anlamlı yani daha az kod çalıştırarak aşağıdaki gibi//
        if (age <= 3) {
            System.out.println("bebek");

        } else if (age <= 13) {
            System.out.println("çocuk");

        } else if (age <= 18) {
            System.out.println("ergen");
        } else {
            System.out.println("yetişkin");
        }
    }


}
