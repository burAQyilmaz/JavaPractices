package day12;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir cümleyi kelime kelime tersine çevirip ekrana yazdıran program

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a sentence: ");

        String sentence= scanner.nextLine();

        String[] words= sentence.split(" ");

        String newSentence= "";

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb=new StringBuilder(words[i]);

            newSentence+= sb.reverse()+" ";

        }

        System.out.println(newSentence.trim());
    }
}
