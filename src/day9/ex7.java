package day9;

import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        // *Bir dizideki bütün elemanların karesini başka bir diziye atayın ve ikinci diziyi yazdırın.

        int[]sayi={23,45,67,89,4,42,1,6,91};
        int[]sayi2=new int[sayi.length];

        for (int i = 0; i <sayi.length ; i++) {

            sayi2[i]=sayi[i]*sayi[i];

        }

        for (int i = 0; i <sayi2.length ; i++) {

            System.out.println(sayi2[i]);

        }

        int[]yeniDizi= Arrays.stream(sayi).map(i->i*i).toArray();
        System.out.println(Arrays.toString(yeniDizi)); //fori döngüsü kullanmadan arrays i string e çevirip yazdırma

    }
}
