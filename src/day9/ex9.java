package day9;

import java.util.Random;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        /*
        Kolay bir sayı tahmin oyunu yapın.
        Bilgisayar 1-100 aralığında bir sayı tutsun ve
        kullanıcı bu sayıyı tahmin etmeye çalışsın.
        Her tahminde bilgisayar "aşağı", "yukarı" gibi dönütler versin.
        Doğru tahminde oyun tebrik mesajı ile sonlandırılsin
         */

        Random random = new Random();
        int sayi = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number: ");
            int tahmin = scanner.nextInt();

            if (tahmin > sayi) {
                System.out.println("aşağı");
            } else if (tahmin == sayi) {
                System.out.println("tebrikler bildiniz");
            break;
            } else {
                System.out.println("yukarı");
            }

        }

    }
}
