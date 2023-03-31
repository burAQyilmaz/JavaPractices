package day19;

public class ex1 {
    public static void main(String[] args) {
        //*Bir metindeki sesli harflerden sonra bir boşluk bırakan kod yazın

        String text = "dfmnrwıognkfgnurvnİPQ";

        System.out.println(text.replaceAll("[aeıioöuüAEIİOÖUÜ]","$0 ")); //$0 0(SIFIR) regexte yazılanın kendisi $ her demek


    }
}