package day4;

public class ex3 {

    public static void main(String[] args) {

        //7,8 ve 10 sayılarının faktörlerini hesaplayan bir program yazın.

        int carpim1 = 1;
        int carpim2 = 1;
        int carpim3 = 1;

        for (int i = 1; i <= 7; i++) {
            carpim1 = carpim1 * i;
        }
        System.out.println(carpim1);

        for (int i = 1; i <= 8; i++) {
            carpim2 = carpim2 * i;
        }
        System.out.println(carpim2);
        for (int i = 1; i <= 10; i++) {
            carpim3 = carpim3 * i;
        }
        System.out.println(carpim3);

    }
}
