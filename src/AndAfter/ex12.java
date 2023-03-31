package AndAfter;

import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {

        //Add first 1000 prime numbers in a array

        int[] prime = new int[1000];

        int num = 2;
        int counter = 0;

        while (true) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                prime[counter] = num;
                counter++;
            }
            if (counter == 1000)
                break;

            num++;

        }

        System.out.println((Arrays.toString(prime)));
    }

}
