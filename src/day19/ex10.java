package day19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        //*Elinizde ','  ile ayrılmış en az 5 kelimeden oluşan bir metin var. Her bir kelimeyi ayrı satıra yazdirin

        String text = "kndkg,fmgopf,pfgofp,rokrokg,rogkro";

        String[]texts = text.split(",");

        for (int i = 0; i < texts.length; i++) {

            System.out.println(texts[i]);
        }





    }
}
