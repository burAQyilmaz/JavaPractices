package day4;

public class ex5 {
    public static void main(String[] args) {
        //1den 12e kadar bütün sayıların faktöriyelini yazdır


        for (int i = 1; i <= 12; i++) {

            faktoriyel(i);
        }

    }

    private static void faktoriyel(int sayi) {

        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim * i;
        }
        System.out.println(carpim);
    }
}
