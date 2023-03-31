package day3;

public class ex15 {
    public static void main(String[] args) {
        //Verilen bir sayının asal olup olmadığını bul

        int sayi=43;
        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {
            if(sayi % i==0){
                sayac++;
            }

        }
    if(sayac==2){ //çünkü kendisi ve 1 dışında pozitif böleni olmamalı
        System.out.println(sayi+" sayısı asal sayıdır.");
    }else{
        System.out.println(sayi+" sayısı asal sayı değildir.");
    }



    }
}
