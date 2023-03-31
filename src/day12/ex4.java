package day12;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        // Bir string dizisi oluşturup, dizideki kelimeleri uzunluklarına göre sıralayan program

        String[] words = {"kalın", "incecik", "uzuncana", "kısa", "ağırcana", "hafif", "su", "zamamnında"};

        int max = 0;

        for (int i = 0; i < words.length; i++) {


            if (max < words[i].length()) {
                max = words[i].length();
            }
        }

        for (int j = 0; j <= max; j++) {

            for (String word : words) {

                if (j == word.length())

                    System.out.println(word);


            }

        }

    }
}
