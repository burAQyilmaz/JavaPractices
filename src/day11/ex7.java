package day11;

import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        //*Bir dizi içinde belirlenen bir argo kelime geçmeyen elemanları yazdırın.

        String argo = "salak";

        String[] texts = {"gerçek","manyak", "olamaz","yukarı"};

        for (int i = 0; i < texts.length ; i++) {

            if(texts[i].equalsIgnoreCase(argo)) {

            } else {
                System.out.println(texts[i]);
            }
            // if(!texts[i].equalsIgnoreCase(argo)) System.out.println(texts[i]);     koşulun önüne "!" koyup eşit değilini direkt yazdırabilirsin

        }

        // Arrays.stream(texts).filter(i->!i.equalsIgnoreCase(argo)).forEach(System.out::println);

    }
}
