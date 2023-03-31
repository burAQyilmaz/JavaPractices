package day5;

public class ex12 {
    public static void main(String[] args) {

        //bir dizi içindeki en büyük sayıyı bulan bir prog yaz

        int[] sayilar={2,41,24,45,13,6};//DİZİ

        int enBuyuk=sayilar[0];

        for (int i = 0; i < sayilar.length ; i++) {
            if(sayilar[i]>enBuyuk){
                enBuyuk=sayilar[i];
            }

        }
        System.out.println(enBuyuk);


    }
}
