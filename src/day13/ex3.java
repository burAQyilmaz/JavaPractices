package day13;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        // *Girilen bir tam sayının bütün asal bölenlerini gösteren bir program yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");

        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {

                boolean asalmi = true;

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {

                        asalmi = false;
                        break;
                    }

                }
                if (asalmi)
                    System.out.println(i);
            }

        }

        /*
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir sayı girin :");
        int sayi=scanner.nextInt();

        for (int i = 2; i <=sayi ; i++) {
            boolean bittimi=true;
            while (true){
                if(sayi % i==0) {
                    sayi=sayi/i;
                    if(bittimi)  {
                        System.out.println(i);
                        bittimi=false;
                    }
                }else{
                    break;
                }
            }
        }   */
    }
}