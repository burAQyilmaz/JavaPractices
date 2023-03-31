package day12;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir string'i tüm karakterleri farklı olacak şekilde yeniden düzenleyen program

        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a text: ");

        String text = scanner.nextLine();

        String newText = "";

        for (int i = 0; i < text.length(); i++) {

            if(!newText.contains(text.substring(i,i+1)))  //newText.contains((String.valueOf(text.charAt(i))));
                 {



                newText+=text.substring(i,i+1);

            }
        }
        System.out.println("newText = " + newText);





    }
}
