package day15;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        //*on bin rakamdan oluşan bir sayının herhangi bir yerinde ardışık olarak 1234 sayısının oluşup oluşmadığı kontrol edin

        Random random = new Random();

        String sayi = "";

        for (int i = 0; i < 10000; i++) {

            sayi += random.nextInt(10);
        }

        if (sayi.contains("1234")) {

            System.out.println("var");
        } else {
            System.out.println("yok");
        }

    }
}
