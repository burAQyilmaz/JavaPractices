package day18;

public class ex3 {
    public static void main(String[] args) {

        //*[1000-2000] aralığında ardışık asal sayıların farkını yazdırın.

        int[] primeNumbers = new int[1000];

        int counter = 0;

        for (int i = 1000; i <= 2000; i++) {

            if (isPrime(i)) {

                primeNumbers[counter] = i;
                counter++;

            }

        }

        for (int i = 1; i < primeNumbers.length; i++) {

            System.out.println(primeNumbers[i] - primeNumbers[i - 1]);

        }

    }

    private static boolean isPrime(int number) {

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
