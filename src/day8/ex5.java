package day8;

public class ex5 {
    public static void main(String[] args) {
        //*İki sayının ekok unu bulan program yazınız.
        int n1=4;
        int n2=30;

        int ekok;

        for (int i =Math.max(n1,n2); i <= n1*n2 ; i++) {
            if(i % n1==0 && i % n2==0) {
                ekok = i;
                System.out.println("ekok = " + ekok);
                break;
            }
        }

    }
}
