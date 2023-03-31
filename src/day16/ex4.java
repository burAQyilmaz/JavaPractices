package day16;

import java.util.Arrays;
import java.util.SimpleTimeZone;

public class ex4 {
    public static void main(String[] args) {
        // *Bir dizideki tek kelimeden oluşan "s' ile başlayan metinleri listeleyin.

        String[] texts = {"fjrğıg rebb", "sotjgtbm", "kfvmfkvm", "vkfvm gvb", "sfkor fvsf", "slmbomrt glbm rtgt"};

        for(String text:texts) {

            if(text.startsWith("s") && !text.contains(" ")) {
                System.out.println(text);
            }

        }

        Arrays.stream(texts).filter(i->i.startsWith("s") && !i.contains(" ")).forEach(System.out::println);

    }
}
