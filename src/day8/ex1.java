package day8;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //*Fibonacci dizisini istenilen sayıya kadar devam ettir ve ekrana diziyi yazdır.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a number: ");
        int num= scanner.nextInt();

        int [] fib= new int[num];
        fib[0]=1;
        fib[1]=1;


        System.out.println(fib[0]+"\n"+fib[1]);
        for (int i = 2; i <num; i++) {
            fib[i]=fib[i-2]+fib[i-1];
            if(fib[i]<num)
            System.out.println(fib[i]);
            else break;

        }


    }
}
