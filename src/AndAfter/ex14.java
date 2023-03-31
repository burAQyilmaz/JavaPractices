package AndAfter;

public class ex14 {
    public static void main(String[] args) {

        //What is method?

        System.out.println(topla(4, 7));

        System.out.println(isEven(4));

        selamla("Burak");

    }

    private static int topla(int num1, int num2) {

        return num1 + num2;
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void selamla(String name) {

        System.out.println("Merhaba " + name + " nasılsın?");
    }
}

