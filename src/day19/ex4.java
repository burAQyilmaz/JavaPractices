package day19;

public class ex4 {
    public static void main(String[] args) {
        //*Verilen bir sayı asalsa "Sayı asaldır." değilse "Sayı asal değildir, çünkü örnek olarak x e bölunuyor" mesajı yazdırın.

        int a = 17;

        boolean asal = true;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {

                asal = false;
                System.out.println("Sayı asal değildir, çünkü örnek olarak "+ i + " ile bolunuyor");
                break;
            }

        } if(asal) System.out.println("Sayı asaldır.");


    }
}
