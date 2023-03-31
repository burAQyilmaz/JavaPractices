package day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        //Bir dizinin elemanlarını tersine çeviren bir program yazın.

        String[] texts = {"şldmbşlfd", "kfm", "kfgjsdg", "80765", "fg896"};

        String[] newTexts = new String[texts.length];

        for (int i = 0; i < texts.length; i++) {

                newTexts[i] = texts[texts.length-1-i];
            
        }

        System.out.println(Arrays.toString(newTexts));

    }


}
