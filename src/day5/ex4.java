package day5;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ex4 {
    public static void main(String[] args) {
        //3-Üs işlemini yapan fonksiyon

        Scanner scanner = new Scanner(System.in);
        System.out.print("taban sayısını girin: ");
        int taban = scanner.nextInt();

        System.out.print("ust sayısını girin: ");
        int ust = scanner.nextInt();

     ustalma(taban,ust);


    }

    private static void ustalma(int taban, int ust) {

        System.out.println((int)Math.pow(taban,ust));

    }
}
