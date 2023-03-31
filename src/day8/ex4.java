package day8;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //*Girilen bir telefon numarasının ilk rakamının 5 olduğunu ve numaranın 10 rakamlı olduğunu doğrulayan ve geçerli geçersiz bilgisini veren bir kod yazin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input phone number: ");
        String phoneNum= scanner.nextLine();

        if(phoneNum.startsWith("5") && phoneNum.length()==10){
            System.out.println("geçerli");

        }else {
            System.out.println("geçersiz");

        }





    }
}
