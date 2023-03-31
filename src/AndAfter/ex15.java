package AndAfter;

public class ex15 {
    public static void main(String[] args) {

        //find factorial of numbers (1-12)

        for (int i = 1; i <= 12; i++) {

            System.out.println(factorial(i));
        }
    }

    private static int factorial(int number) {

        int fac = 1;

        for (int i = 1; i <= number; i++) {

            fac *= i;

        }
        return fac;
    }
}
