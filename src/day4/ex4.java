package day4;

public class ex4 {
    public static void main(String[] args) {

        //7,8 ve 10 sayılarının faktörlerini hesaplayan bir program yazın.

/* bu yöntemin açıklaması:
        method dışına method yazarak üç kere kod yazmaya gerek kalmadı */


        faktöriyel(7);
        faktöriyel(8);
        faktöriyel(10);

    }

    private static void faktöriyel(int sayi) {

        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim * i;
        }
        System.out.println(carpim);
    }
}
