package AndAfter;

import java.util.Arrays;

public class ex13 {

    public static void main(String[] args) {

        //Add first 1000 prime numbers in a array

        int[] primeNumbers = new int[1000];

        int num = 2;

        int counter = 0;

        while (true) {

            if (isPrime(num)) {
                primeNumbers[counter] = num;
                counter++;
            }
            if (counter == 1000) break;

            num++;
        }
        System.out.println(Arrays.toString(primeNumbers));
    }
    public static boolean isPrime(int number) {

        boolean asal = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                asal = false;
                break;
            }
        }
        return asal;
    }
}
