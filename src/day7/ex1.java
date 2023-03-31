package day7;

import java.util.Scanner;
import java.util.Arrays;
public class ex1 {
    public static void main(String[] args) {
        //*Kullanıcıdan 10 kelime alın ve bunları alfabetik olarak sıralayın.

        Scanner scanner=new Scanner(System.in);

        String [] words=new String[10];

        for (int i = 0; i <10 ; i++) {

            System.out.println("Input word " +i+ ":" );

            words[i]= scanner.nextLine();

        }

        Arrays.sort(words);

        for (int i = 0; i <10 ; i++) {

            System.out.println(words[i]);

        }

    }


}
