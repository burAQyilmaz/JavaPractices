package day17;

public class ex1 {
    public static void main(String[] args) {
        //*String olarak saklanmış iki sayıdan büyük olanı yazdır

        String num1 = "123";
        String num2 = "12";

        if(Integer.parseInt(num1)<Integer.parseInt(num2)){
            System.out.println(num2);
        }else {
            System.out.println(num1);
        }

        System.out.println(Math.max(Integer.parseInt(num1),Integer.parseInt(num2)));

    }
}
