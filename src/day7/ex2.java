package day7;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //*Bir dizinin elemanlarının ortalamasını bulan bir program yazın

        int [] nums={2,45,677,43,0,62,123};

        int sum=0;

        for (int i = 0; i < nums.length ; i++) {

            sum+=nums[i];

        }
        System.out.println(sum/ nums.length);



        /* kısa ve başka yolu;

        System.out.println(Arrays.stream(nums).sum()/ nums.length);

         */
    }
}
