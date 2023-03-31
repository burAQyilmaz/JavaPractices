package day3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //4 islem içeren basit bir hesap makinesi yap//

        Scanner giris = new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1 = giris.nextInt();

        System.out.print("Input second number: ");

        int num2 = giris.nextInt();

        System.out.print("Input symbol: ");

        giris.nextLine();//next.int den sonra next.line kullanılırsa buffer temizliği için bunu yazman gerek//
        String sym = giris.nextLine();

        if (sym.equals("+")) {
            System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));

        }

        if (sym.equals("-")) {
            System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        if (sym.equals("*")) {
            System.out.print(num1 + " x " + num2 + " = " + (num1 * num2));

        }
        if (sym.equals("/")) {
            System.out.print(num1 + " : " + num2 + " = " + (num1 / num2));

        }


    }
}
