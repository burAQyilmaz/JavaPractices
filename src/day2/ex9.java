package day2;

public class ex9 {

    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
/*
 % mod yani bölümden kalan aşağıdaki gibi yazılıyor
 dolayısıyla 1 den 100e kadar tek sayılar aşağıdaki gibi
 vee çift eşit kullanıyoruz çünkü atama yapmıyor karşılaştırma yapıyoruz
 */
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }




    }
}
