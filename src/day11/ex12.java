package day11;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        //*Kullanıcıdan 10 tane numerik değer alına kadar devam eden (hatalı girişlerde uyaran)
        // ve girişleri bir diziye atayan ve diziyi yazdıran bir program yazın.

        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[10];

        int sayac = 0;


        while ( sayac<10){

            System.out.print((sayac+1) + ". sayıyı giriniz: ");

            String giris = scanner.nextLine();

            if(giris.matches("[0-9]+") ) {

                sayilar[sayac]=Integer.parseInt(giris);

                sayac++;

            } else {
                System.out.print("Giriş numerik değil: ");

            }
        }

       for (int sayi:sayilar)
           System.out.println(sayi);


    }
}
