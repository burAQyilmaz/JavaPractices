package day14;

public class ex8 {
    public static void main(String[] args) {

        // Write a program to find whether a number is an Armstrong number or not.
        //Armstrong number – Sum of the cubes of its digit is equal to the number itself. E.g – 153

        int num=345;
        int temp=num;
        int sumcube=0;

        while(temp>0){
           sumcube+=Math.pow (temp % 10, 3);
           temp=temp/10;
        }
        if (sumcube==num) {
            System.out.println(num + " is an Armstrong number");
        }else {System.out.println(num + " is not an Armstrong number");}

    }
}
