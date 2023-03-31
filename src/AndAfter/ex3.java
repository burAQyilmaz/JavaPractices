package AndAfter;

public class ex3 {
    public static void main(String[] args) {

        //List of all prime numbers between 1000 and 10000.

        int counter = 0;
        for (int i = 1000; i <= 10000; i++) {

            if (isPrime(i)) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println(counter);

    }

    private static boolean isPrime(int i) {

        boolean prime = true;

        for (int j = 2; j < i; j++) {

            if (i % j == 0) {

                prime = false;

            }

        }
        return prime;

    }
}
