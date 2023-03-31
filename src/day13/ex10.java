package day13;

import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        // Java'da, bir dizinin en küçük ve en büyük elemanlarını bulmak için nasıl bir kod yazarsınız?

        int[] sayi = {3, 48, 76, 12, 60, 91, 45, 6, 33};

        Arrays.sort(sayi);

        System.out.println(sayi[0]+", "+ sayi[sayi.length-1]);



    }
}
