package day18;

public class ex2 {
    public static void main(String[] args) {

        // *Verilen iki sayının ekok u ile ebob u arasındaki farkı bulun.

        int num1 = 12;
        int num2 = 4;

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int ekok = 1;
        int ebob = 1;

        for (int i =max; i <= min*max ; i++) {

            if(i % min == 0 && i % max == 0){

                ekok=i;
                break;

            }

        }

        for (int i = min; i >= 1  ; i--) {

            if(min % i == 0 && max % i == 0)

                ebob=i;
                break;

        }

        System.out.println(ekok-ebob);
    }
}
