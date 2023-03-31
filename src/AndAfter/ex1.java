package AndAfter;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        //*Bir metindeki büyük harfleri küçük harfe, küçük harfleri büyük harfe çeviren program yazın.

        String text = "seLaM aRkAdAşLaR";

        String[] letters = text.split("");

        Arrays.stream(letters).map(i->i.equals(i.toUpperCase()) ? i.toLowerCase() : i.toUpperCase()).forEach(System.out::print);

    }
}
