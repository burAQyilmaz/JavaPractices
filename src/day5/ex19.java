package day5;

public class ex19 {
    public static void main(String[] args) {

        //*Verilen iki sayının en büyük ortak bölenini bulan bir program yazın.

        int n1=18;
        int n2=54;

        int kucuk=Math.min(n1,n2);

        int ebob=1;

        for (int i = 1; i <=kucuk ; i++) {
            if(n1%i==0 && n2%i==0){ //&&: ve işareti; ||: veya işareti; != : eşit değilişareti
                ebob=i;

            }


        }

        System.out.println(ebob);

    }
}
