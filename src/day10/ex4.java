package day10;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        //*Bilgisayara iki sayı bir birine eşit olana kadar rastgele iki sayı seçtirin. Her seferinde seçtiği sayıları ve deneme sayısını ekrana yazdırın. İki sayı eşit olduğunda tebrik mesajı ile programı sonlandirin.

        Random random = new Random();

        int sayac = 0;

        while(true){
            int num1 = random.nextInt(10000);
            int num2 = random.nextInt(10000);
                sayac++;
            System.out.println("Birinci sayı: " + num1 + ", ikinci sayı: " + num2 + ", denem sayısı: " +sayac);

            if (num1==num2){
                System.out.println("Tebrikler bana " + sayac + " denemede birbirine eşit iki sayıyı bulabildim. Daha iyisini de yapabileceğime olan inancım sonsuz:)");
                break;
            }
        }



    }
}
