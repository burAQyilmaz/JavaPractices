package day16;

import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        //*Kullanıcıdan aldığınız 6 farkli ad ve soyadı bilgilerini çok boyutlu dizide saklayın ve yazdırın.

        Scanner scanner = new Scanner(System.in);

        String[][] nameSurname = new String[6][2];


        for (int i = 0; i < nameSurname.length; i++) {

            System.out.println("Input name: ");
            nameSurname[i][0] = scanner.nextLine();

            System.out.println("Input surname: ");
            nameSurname[i][1] = scanner.nextLine();

        }

        for (int i = 0; i < nameSurname.length; i++) {

            System.out.println(nameSurname[i][0] + " " + nameSurname[i][1]);

        }

        // System.out.println(Arrays.deepToString(nameSurname)); yukarıda diziyi yazdırmak için fori yapmıştık kısa yolu

    }
}
