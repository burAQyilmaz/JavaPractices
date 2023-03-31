package day15;

public class ex4 {
    public static void main(String[] args) {

        // * 1000-2000 aralığındaki asal sayıları method kullanarak listeleyin.

        for (int i = 1000; i <=2000 ; i++) {

            if(asal(i)) //true or false
                System.out.println(i);

        }

    }

    private static boolean asal(int i) {

        boolean asalMi=true;

        for (int j = 2; j <i ; j++) {

            if(i % j == 0)
                asalMi=false;

        } return asalMi;



    }
}
