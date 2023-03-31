package day16;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        // *[150-300]  aralığında 10 rastgele sayı yazdırın.


        Random random = new Random();

        for (int i = 0; i <= 10 ; i++) {

            System.out.println(random.nextInt(151) + 150);

        }

    }
}
