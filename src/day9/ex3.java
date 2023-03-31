package day9;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
//*Bir dizide bulunan elemanlardan 20'den büyük olanlarının toplamını bulun.

        int [] sayilar={23,19,3,45,14,17,57,44};

        int sum=0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]>20){
                sum+=sayilar[i];
            }
        }
        System.out.println(sum);

        //Arrays.stream(sayilar).filter(i->i>20).sum(); kısası
        System.out.println(Arrays.stream(sayilar).filter(i->i>20).sum());

    }
}
