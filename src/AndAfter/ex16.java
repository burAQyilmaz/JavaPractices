package AndAfter;

public class ex16 {
    public static void main(String[] args) {

        //List the numbers from 1 to 1000 whose sum of positive divisors (not included itself) is equal to itself

        for (int i = 1; i <= 1000; i++) {

            if (isPerfect(i))
                System.out.println(i);
        }
    }
    private static boolean isPerfect(int i) {

        int sum = 0;

        for (int j = 1; j < i; j++) {

            if (i % j == 0)
                sum += j;
        }
        if (sum == i) return true;

        return false;
    }
}

