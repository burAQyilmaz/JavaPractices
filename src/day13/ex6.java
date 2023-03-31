package day13;

public class ex6 {
    public static void main(String[] args) {

        //Verilen bir dizideki tekrar eden sayıları nasıl bulabilirsiniz?

        int[] sayi = {3, 45, 76, 12, 6, 91, 45, 6, 33};

        for (int i = 0; i < sayi.length; i++) {

            for (int j = i+1; j < sayi.length ; j++) {

                if(sayi[i]==sayi[j])

                    System.out.println(sayi[i]);

            }
        }








    }
}
