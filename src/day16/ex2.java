package day16;

public class ex2 {
    public static void main(String[] args) {
        // *Bir sayının palindromik olup olmadığını stringe çevirmeden bulan bir program yazin

        int sayi = 12521;

        int sayininTersi = 0;

        int sayiTemp = sayi;

        while (sayiTemp > 0) {

            sayininTersi += sayiTemp % 10;

            if (sayiTemp > 9) {
                sayininTersi *= 10;
            }

            sayiTemp /= 10;

        }
        if (sayi == sayininTersi) {
            System.out.println("palindrom");
        } else {
            System.out.println("palindrom değil");
        }

    }
}
