package day2;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        /*
        kullanıcıdan 1 ila 12 arasında bir sayı al
        sonra bu sayının faktöriyelini hesapla
         */

        Scanner giris=new Scanner(System.in);

        System.out.print("Input a number between from 1 to 12 please: ");

        int num= giris.nextInt();

        int result=1; //bu değişkeni sonucu bir yerde tutmek için atadık

        for (int i =1; i <=num ; i++) {

            result=result*i;

            //result*=i doğru yazımı tıpkı i+=3 üçer artırmadaki gibi

        }

        System.out.println("Result is "+result);








    }




}
