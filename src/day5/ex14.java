package day5;

import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {

        /*
        bir dizinin en büyük ve en küçük sayılarını toplayın
        burada sıralamanın kısa yolunu kullanacağız!!!!
         */

        int[] sayilar={2,56,71,143,23};

        Arrays.sort(sayilar);//dizilerde kolayca küçükten büyüğe sıralama!!!

        System.out.println(sayilar[0]+sayilar[sayilar.length-1]);


    }

}
