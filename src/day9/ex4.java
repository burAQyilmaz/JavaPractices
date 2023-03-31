package day9;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        //*Bir dizide bulunan 5 harfli kelimeleri yazdırın

        String[]texts={"aslan", "kaplan", "fil", "kedi", "köpek"};

        Arrays.stream(texts).filter(i->i.length()==5).forEach(System.out::println);

        //Arrays.stream(texts).filter(i->i.length()==5).forEach(i-> System.out.println(i));

    }
}
