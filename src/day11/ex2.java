package day11;

import java.util.stream.IntStream;

public class ex2 {
    public static void main(String[] args) {
        //*[200-500] aralığındaki onlar basamağı 3 olan ve 3 ile bölünmeyen çift sayıları yazdırın.

        for (int i = 200; i <=500 ; i++) {

            if ((i / 10) % 10 ==3 && i % 3 != 0 && i % 2 ==0) {

                System.out.println(i);
            }

        }
        // IntStream.range(200,501).filter(i->(i / 10) % 10 ==3 && i % 3 != 0 && i % 2 ==0).forEach(System.out::println);

    }
}
