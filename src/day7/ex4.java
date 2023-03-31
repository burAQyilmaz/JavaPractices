package day7;

public class ex4 {
    public static void main(String[] args) {
        // *Bir sayının mükemmel sayı olup olmadığını sorgulayan bir fonksiyon yazin

        int num = 28;

        muk(num);

    }
    private static void muk(int num) {

        int sum = 0;

        for (int i = 1; i <num ; i++) {
            if(num % i==0)
                sum+=i;

        }
        if(sum==num) System.out.println(num+ " sayısı mükemmel bir sayıdır.");
        else System.out.println(num+ " sayısı mükemmel sayı değildir.");

    }



}
