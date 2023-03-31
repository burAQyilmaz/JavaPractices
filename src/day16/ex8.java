package day16;

public class ex8 {
    public static void main(String[] args) {
        // *[1000-10000] aralığında hem asal olan hem bütün rakamlarının toplami asal olan bütün sayıları listeleyin


        for (int i = 1000; i <= 10000; i++) {

            if (asalMi(i) && raktopAsalMi(i))  // methoları oluştur

                System.out.println(i);
        }

    }
    private static boolean asalMi(int i) {

        boolean asal = true;

        for (int j = 2; j < i; j++) {

            if (i % j == 0) {
                asal = false;
                break;
            }

        }
        return asal;

    }
    private static boolean raktopAsalMi(int i) {

        boolean asalTop;

        int rakTop = 0;

        while (i > 0) {

            int bas1 = i % 10;

            i /= 10;

            rakTop += bas1;

        }

        if (asalMi(rakTop)) {
            asalTop = true;


        } else {
            asalTop = false;
        }

        return asalTop;
    }


}
