package day8;

public class ex6 {
    public static void main(String[] args) {
        //*İki sayının yerini değişken kullanmadan degistirin

        int a=12;
        int b=23;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
