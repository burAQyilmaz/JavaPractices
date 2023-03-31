package day17;

public class ex6 {
    public static void main(String[] args) {
        // *3 basamaklı bütün sayıları yazarken toplam kaç tane 8 kullandığınızı bulun.

        int sayi = 8;

        int sayac = 0;

        for (int i = 100; i <= 999; i++) {

            int temp = i;

            while (temp > 0) {

                if (temp % 10 == sayi) {

                    sayac++;

                }
                temp /= 10;

            }

        }
        System.out.println(sayac);


    }
}
