package AndAfter;

public class ex11 {
    public static void main(String[] args) {

        //Swap numeric values in two variables without using a third variable.

        int a=5;
        int b=11;

        a=a+b;
        b=a-b;
        a=a-b;  

        System.out.println("a="+a+"\nb="+b);



    }
}
