package day6;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //18-Hesap Makinesi

        Scanner scanner=new Scanner(System.in);
        System.out.print("Input first number: ");
        int n1= scanner.nextInt();
        System.out.print("Input second number: ");
        int n2= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input symbol: ");
        String sym= scanner.nextLine();


        if(sym.equals("+")) System.out.print("sonuç="+(n1+n2));
        if(sym.equals("-")) System.out.print("sonuç="+(n1-n2));
        if(sym.equals("/")) System.out.print("sonuç="+(n1/n2));
        if(sym.equals("*")) System.out.print("sonuç="+(n1*n2));


    }
}
