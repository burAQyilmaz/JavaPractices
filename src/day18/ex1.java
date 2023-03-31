package day18;

public class ex1 {
    public static void main(String[] args) {

        //*(2ustu n)-1 ifadesinin asalligini sorgulayın. (N 30dan küçük olsun)

        int n = 9;

        double num = Math.pow(2, n) - 1;

        if (asalmi(num)) System.out.println(num + " is a prime number");
        else System.out.println(num+ " is not a prime number");

    }

    private static boolean asalmi(double num) {

        boolean asal = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                asal = false;

            }

        }
        return asal;

    }
}
