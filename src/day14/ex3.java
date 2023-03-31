package day14;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        //İki farklı dizideki ortak elemanları yazdıran bir program yazın.

        int[] sayilar1= {34, 5, 32, 5, 143, 43, 99, 0, 56};
        int[] sayilar2= {34, 51,33, 765, 345, 0, 56, 78};



        for (int i = 0; i < sayilar1.length; i++) {
            for (int j = 0; j < sayilar2.length; j++) {
                if(sayilar1[i]==sayilar2[j]) System.out.println(sayilar1[i]);
            }

        }

    }
}
