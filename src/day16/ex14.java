package day16;

public class ex14 {
    public static void main(String[] args) {
        //  Bir tamsayı dizisi verildiğinde, dizideki en küçük iki tamsayıyı bulan Java programını yazın.

        int[] numbers = {23, 45, 78, 11, 61, 456, 2};

        for (int j = 0; j < 2; j++) {

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] < numbers[i + 1]) { //büyükten küçüğe sıralıyoruz

                    int temp = numbers[i + 1];

                    numbers[i + 1] = numbers[i];

                    numbers[i] = temp;

                }

            }
        }
        System.out.println(numbers[numbers.length - 2] + " and " + numbers[numbers.length-1]);

    }
}
