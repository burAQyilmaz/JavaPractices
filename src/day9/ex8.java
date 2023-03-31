package day9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ex8 {
    public static void main(String[] args) {
        //*[10-99] aralığındaki rakamları toplamı 7 olan sayıları bir diziye atayın ve diziyi yazdirin

        System.out.println(Arrays.toString(IntStream.range(10,100).filter(i-> (i / 10) + (i % 10) == 7).toArray()
        ));

    }
}
