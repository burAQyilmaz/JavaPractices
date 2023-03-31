package day13;

public class ex4 {
    public static void main(String[] args) {

        // bir  int dizideki en büyük sayıyı yazdıran bir program yazınız (sort kullanmadan)

        int[] sayilar= {34, 111, 76, 4, 62, 21, 5768};

        int buyuk= sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {

            if (buyuk<sayilar[i]) {
                buyuk=sayilar[i];
            }

        }
        System.out.println(buyuk);
    }
}
