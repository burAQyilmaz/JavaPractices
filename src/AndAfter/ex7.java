package AndAfter;

public class ex7 {
    public static void main(String[] args) {

        //Add all even numbers in the range [3-300] into an array and print the array

        int[] evenNum = new int[300];

        int counter = 0;

        for (int i = 3; i <= 300; i++) {

            if (i % 2 == 0) {

                counter++;

                evenNum[counter] = i;

            }

        }
        for (int i = 0; i < evenNum.length; i++) {

            System.out.println(evenNum[i]);

        }

    }
}
