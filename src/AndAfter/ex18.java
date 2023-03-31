package AndAfter;

public class ex18 {
    public static void main(String[] args) {

        //List the prime numbers from 2 to 1000 whose sum of the digit is also prime


        for (int i = 2; i <= 1000; i++) {

            if (isPrime(i) && isPrime(sumOfDigits(i)))

                System.out.println(i);
        }
    }
    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {

            sum += num % 10;
            num /= 10;
        }
        return sum;
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
