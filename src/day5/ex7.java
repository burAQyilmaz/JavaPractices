package day5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        //6-Beden kitle endeksi bulan program

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your height(kg): ");
        double kg= scanner.nextDouble();
        System.out.println("Input your lenght(m): ");
        double m= scanner.nextDouble();

        double endex=kg/Math.pow(m,2);

        if(endex<18.5){
            System.out.println("İdeal kilonun altında");
        } else if (endex<25) {
            System.out.println("İdeal kiloda");
            
            
        } else if (endex<30) {
            System.out.println("İdeal kilonun üstünde");

        }else if(endex<40) {
            System.out.println(" İdeal kilonun çok üstünde (obez)");

        }else {
            System.out.println("İdeal kilonun çok üstünde (morbid obez)");
        }

    }
}
