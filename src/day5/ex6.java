package day5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //5-Verilen hayvanların ayak sayısını bulan fonksiyon

        String animal="fish";

        footcount(animal);


    }

    private static void footcount(String animal) {

        if(animal.equals("elephant")){
            System.out.println(4);
        } else if (animal.equals("chicken")) {
            System.out.println(2);

        } else if (animal.equals("fish")) {
            System.out.println(0);

        }else {
            System.out.println("unknown");
        }
    }
}
