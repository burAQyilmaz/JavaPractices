package AndAfter;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        //Take 5 numbers from the user and find the sum of the largest and smallest of these numbers.

        Scanner scanner=new Scanner(System.in);
        int greatest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("Enter a number:");
            int num= scanner.nextInt();

            if(num>greatest){
                greatest=num;
            }

            if(num<lowest){
                lowest=num;
            }
        }
        System.out.println(greatest+lowest);

    }
}
