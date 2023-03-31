package day3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //Kullanıcıdan tckn iste, eğer giriş 11 karakter ise kimlik no doğrulandı değil ise kimlik no geçersiz yazdır.

        Scanner scanner=new Scanner(System.in);

        System.out.print("Input Your ID: ");

        String id= scanner.nextLine();

        if (id.length()==11){
            System.out.print("Kimlik no doğrulandı.");
            }else{
            System.out.println("Kimlik no geçersiz.");
        }



    }
}
