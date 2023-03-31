package day15;

public class ex7 {
    public static void main(String[] args) {
        //*[100-3000] aralığında en büyük basamağı 2 olmayan bütün sayıları yazdirin

        for (int i = 100; i <= 3000; i++) {

            if (i < 1000) {
                if (i / 100 != 2){
                    System.out.println(i);}
            } else {
                if (i / 1000 != 2) {
                    System.out.println(i);
                }

            }

        }

        //Daha güzel bir çözüm çünkü daha esnek verilen tüm aralıklarda bulabilir
        for (int i = 100; i <= 3000; i++) {
            int enBuyukBasamak = i;

            while (enBuyukBasamak >= 10) {
                enBuyukBasamak /= 10;
            }

            if (enBuyukBasamak != 2) {
                System.out.println(i);
            }

        }


    }
}
