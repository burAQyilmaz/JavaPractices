package day8;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Kullanıcıdan ad soyad ve şifre alin. Şifre içinde ad veya soyad geçiyorsa uyarı verin değilse şifre kabul edildi yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Input Your Name: ");
        String name= scanner.nextLine();
        System.out.print("Input Your Surname: ");
        String surname= scanner.nextLine();
        System.out.print("Input Code: ");
        String code= scanner.nextLine();

        if(code.contains(name)||code.contains(surname))
            System.out.println("sifre gecersiz!!!");
        else System.out.println("sifre kabul edildi");






    }

}
