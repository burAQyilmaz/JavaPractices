package day5;

public class ex18 {
    public static void main(String[] args) {
        /* Girilen bir metnin kaç kelimeden oluştuğunu gösteren bir program yazın.
        ancak ya aralarda birden fazla boşluk bırakıldıysa:
         */

        String metin = "Seni Çok ama çoook          seviyooom!";

        String[] kelimeler = metin.split(" ");//metni boşluklarda ayırarak bir diziye atadım

        int sayac = 0;

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].replace(" ", "").length() == 0) {

            } else {
                sayac++;
            }
        }


        System.out.println(sayac);

    }
}
