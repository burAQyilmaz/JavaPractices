package day3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //Kullanıcıdan 4 sayı al ve bu sayıların ortalamasını hesapla ve sonucu ekrana yazdır.//

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");

        int n1 = scanner.nextInt();

        System.out.print("Input second number: ");

        int n2 = scanner.nextInt();

        System.out.print("Input third number: ");

        int n3 = scanner.nextInt();

        System.out.print("Input forth number: ");

        int n4 = scanner.nextInt();

        System.out.print("ortalama= " + (double)(n1 + n2 + n3 + n4) / 4);
//(double) yazarak int(tam sayı) sonuç bulması yerine küsüratlı sonuç bulmasını sağlıyoruz//
    }


}
