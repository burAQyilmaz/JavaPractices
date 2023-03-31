package day15;

public class ex6 {
    public static void main(String[] args) {

        //*24 lük sisteme ayarlı bir saatte bir gün boyunca görülebilecek bütün değerleri ekrana yazdırın

        String saatString = "";
        String dakikaString = "";

        for (int saat = 0; saat < 24; saat++) {

            if (saat < 10) {
                saatString = "0" + saat;
            } else {
                saatString = saat + "";
            }

            for (int dakika = 0; dakika < 60; dakika++) {

                if (dakika < 10) {
                    dakikaString = "0" + dakika;
                } else {
                    dakikaString = dakika + "";
                }

                System.out.println("saat: " + saatString + "." + dakikaString);

            }

        }

    }
}
