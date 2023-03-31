package day4;

public class ex1 {
    public static void main(String[] args) {
        //[7-30] aralığındaki sayıların ortalamasını bulan bir program yazınız.

        int sum = 0;
        int sayac = 0;
        for (int i = 7; i <= 30; i++) {
            sum += i;
            sayac++;

        }
        System.out.println(sum / sayac);


    }
}
