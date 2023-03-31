package day19;

import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        //*[1-1000] aralığında sadece tek rakamlar kullanılarak yazilabilen bütün sayıları yazdırın

        int number = 0;

        for (int i = 1; i <= 1000; i += 2) {

            number = i;

            boolean digitOdd = true;

            while (number > 0) {

                if (number % 10 % 2 == 0) {

                    digitOdd = false;

                }
                number = number / 10;

            }
            if(digitOdd)
            System.out.println(i);

        }


    }
}
