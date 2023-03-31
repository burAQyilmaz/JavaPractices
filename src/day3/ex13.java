package day3;

public class ex13 {
    public static void main(String[] args) {
        //Verilen bir sayının kaç tane pozitif boleni olduğunu bulan bir kod yaz.

        int sayi=36;

        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {

            if(sayi % i == 0){
                sayac++;

            }
        }
        System.out.println(sayi+" sayısının pozitif bölen sayısı: "+sayac);
    }
}
