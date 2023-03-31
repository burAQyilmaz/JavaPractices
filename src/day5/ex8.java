package day5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //7-Tarihi, yüzyıla döndüren fonksiyon

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a year(0-2023): ");
        int year= scanner.nextInt();
        century(year);
    }

    private static void century(int year) {
        int cen=year/100+1;
        System.out.println(cen);

            }
}
