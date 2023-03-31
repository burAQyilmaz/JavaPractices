package day10;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {

        //*Bir diziyi ters çeviren bir program yazın

        String[]texts = {"baloon", "cartoon", "bike", "circus", "monkey"};

        String[]reverseTexts = new String[texts.length];

        for (int i = 0; i < texts.length; i++) {

            reverseTexts[i] = texts[texts.length-1-i];

        }

        //System.out.println(Arrays.toString(reverseTexts));

        for(String element: reverseTexts){
            System.out.println(element);
        }
    }
}
