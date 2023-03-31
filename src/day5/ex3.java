package day5;

public class ex3 {
    public static void main(String[] args) {

        //2-Girilen String’i ters çeviren program

        String metin="selam";

        StringBuilder stringBuilder=new StringBuilder(metin);

        System.out.println(stringBuilder.reverse());
    }
}
