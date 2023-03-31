package day14;

public class ex9 {
    public static void main(String[] args) {
        /*
        Find the first repeating element In the array.
         */

        int[] sayilar= {44, 34, 56, 78, 90, 1, 32, 34, 1};

        exit:
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if(sayilar[i]==sayilar[j]) {
                    System.out.println(sayilar[i]);
                    break exit;//TODO repeat edenlerin hepsini yazdırıyor bunu 'exit' ile çözdük???
                }
            }

        }




    }
}
