package day11;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        // *Bir dizideki 5 harften küçük ve y harfi ile başlayan kelimeleri yazdırın.

        String[] texts = {"fjdhf", "kgjfkg", "yudhd", "yuj"};

        for (int i = 0; i < texts.length ; i++) {
            if(texts[i].length()<5 && texts[i].startsWith("y")){
                System.out.println(texts[i]);
            }

        }
        //Arrays.stream(texts).filter(i->i.length()<5 && i.startsWith("y")).forEach(System.out::println);
    }
}
