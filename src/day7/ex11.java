package day7;

import java.util.Random;

public class ex11 {
    public static void main(String[] args) {
        //*100 elemanli bir dizi oluşturun ve her bir elemanina  rastgele sayı atayın ve değerleri yazdırın

        int [] num=new int[100];
        Random random=new Random();

        for (int i = 0; i <100 ; i++) {
            num[i]=random.nextInt(1000);
            System.out.println(num[i]);
        }



    }
}
