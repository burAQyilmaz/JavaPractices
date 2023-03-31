package day12;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //Kullanıcıdan adını alan ve karşılık olarak
        //Merhaba Ad
        //Selam Ad
        //Nasılsın Ad
        //İyi günler Ad
        //karşılıklarından herhangi birini rastgele veren bir program yazın

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input your name: ");

        String name= scanner.nextLine();

        String[] start = {"Merhaba ", "Selam ", "Nasılsın ", "İyi günler "};

        Random random= new Random();

        System.out.println(start[random.nextInt(start.length)]+ name);



    }
}
