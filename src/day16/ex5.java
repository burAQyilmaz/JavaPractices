package day16;

import java.util.Arrays;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        //*Bir dizideki rastgele bir elemanı ekrana yazdıran bir program yazın

        String[] texts = {"vfmv", "kvmfsvp", "roegopme", "örop" };

        Random random = new Random();

        String choose = "";

        choose = texts[random.nextInt(texts.length)];

        System.out.println(choose);

    }
}
