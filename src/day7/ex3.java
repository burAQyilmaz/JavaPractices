package day7;

public class ex3 {
    public static void main(String[] args) {
        //*1 den 100 e kadarki sayılardan 3 ile bolunen ama 5 ile bölünmeyen sayıları yazdırın

        for (int i = 1; i <=100 ; i++) {
            if(i % 3==0 && i % 5 != 0) System.out.println(i);

        }

    }
}
