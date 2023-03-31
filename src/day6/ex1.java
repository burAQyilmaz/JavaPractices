package day6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //*Kullanıcının girdiği sayıdan başlayarak altışar artan 20 elemanlı bir örüntü oluştur.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num= scanner.nextInt();

        for (int i =1; i <=20 ; i++) {
            System.out.print(num +" ");
            num+=6;




        }




    }

}
