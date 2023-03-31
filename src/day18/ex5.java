package day18;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        /*Kullanıcıdan 10 veri al.
Sadece numerik girişleri numerik adli bir dizide,
sadece alfabetik girişleri alfabetik  bir dizide
sadece özel karakter girişlerini özelKarakter adlı bir dizide tutun.
Hiçbirine uymayanlari da geçersiz adlı bir dizide tutun.
Bu dizileri sırasıyla ve isimleriyle ekrana yazdirin
         */

        String[] alfabetik = new String[10];
        String[] numerik = new String[10];
        String[] ozelKarakter = new String[10];
        String[] gecersiz = new String[10];

        int counteralfa = 0;
        int conternum = 0;
        int counterchar = 0;
        int countergec = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Input a text: ");
            String text = scanner.nextLine();

            if (text.matches("[0-9]+")) {
                numerik[conternum] = text;
                conternum++;
            } else if (text.matches("[a-zA-Z]+")) {
                alfabetik[counteralfa] = text;
                counteralfa++;

            } else if (text.matches("[^0-9a-zA-Z]+")) {
                ozelKarakter[counterchar] = text;
                counterchar++;

            } else {
                gecersiz[countergec] = text;
                countergec++;
            }
        }
        System.out.println(Arrays.toString(alfabetik));
        System.out.println(Arrays.toString(numerik));
        System.out.println(Arrays.toString(ozelKarakter));
        System.out.println(Arrays.toString(gecersiz));


    }
}
