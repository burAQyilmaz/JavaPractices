package day17;

public class ex10 {
    public static void main(String[] args) {
        // *Girilen bir sayının faktöriyeline kadarki bütün pozitif sayıların toplamını bulan bir program yazin

        int sayi = 12;

        int sum = 0;

        int fak = 1;

        for (int i = 1; i <=sayi; i++) {

            fak *= i;

        }

        for (int i = 0; i <= fak ; i++) {

            sum+=i;
        }
        System.out.println(sum);
    }
}
