package day9;

public class ex5 {
    public static void main(String[] args) {
        //*1000' e en yakın 1000den küçük 3 asal sayıyı yazdırın

        int sayac=0;

        for (int i = 1000; i >2; i--) {
            if(asalmi(i)){
                System.out.println(i);
                sayac++;
                if(sayac==3)
                    break;

            }



        }


    }

    private static boolean asalmi(int sayi) {

        boolean asal=true;
        for (int j = 2; j <sayi ; j++) {
            if(sayi % j==0){
                asal=false;
                break;
            }

        }
        return asal;



    }
}
