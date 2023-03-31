package day11;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {

        //*Bir dizideki tek sayıların toplamını yazdırın.
        
        int[] sayilar = {3,5,6,56,2,45,99,25};

        int sum = 0;
        
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 ==1){
                sum += sayilar[i];
                
            }
        }
        System.out.println("sum = " + sum);

       // System.out.println(Arrays.stream(sayilar).filter(i->i % 2 ==1).sum());
        
    }
}
