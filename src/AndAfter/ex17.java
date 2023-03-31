package AndAfter;

import java.util.Arrays;

public class ex17 {
    public static void main(String[] args) {

        //Find the sum of minimum and maximum numbers of an array

        int[] numbers = {23, 45, 67, 89, 2, 55};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min)
                min = numbers[i];

            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println(min + max);

        //2. sol:

        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[numbers.length - 1]);
    }
}
