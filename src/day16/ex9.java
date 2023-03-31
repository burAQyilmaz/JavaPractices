package day16;

public class ex9 {
    public static void main(String[] args) {
        // *[10000-100] aralığında 7nin katından 2 fazla, 5in katından 1 eksik kaç sayı olduğunu gösterin.

        int sayac = 0;

        for (int i = 10000; i >= 100; i--) {

            if (i % 7 == 2 && i % 5 == 4) {

                sayac++;

            }

        }
        System.out.println(sayac);

    }
}
