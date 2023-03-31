package day6;

public class ex4 {
    public static void main(String[] args) {
        //*1 den 100 e varan bir for dongusunu 25. Sayıda durduran (bitiren) bir kod yaz.

        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
            if(i==25) break;
        }
    }
}
