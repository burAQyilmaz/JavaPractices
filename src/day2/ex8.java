package day2;

public class ex8 {
    public static void main(String[] args) {

        /*
        üç sayıdan en büyüğünü bulma
         */
        int num1=13;
        int num2=34;
        int num3=29;

        int gecici=0; //geçiçi bir değişken tanımlayarak çözebiliriz ancak chatgpt daha basit kod yazmıştı

        if(num1>num2) {
            gecici=num1;
        }else {
            gecici=num2;
        }
        if(gecici>num3) {

            System.out.println("En büyük sayı "+gecici);
        }else {
            System.out.println("En büyük sayı "+ num3);
        }








    }
}
