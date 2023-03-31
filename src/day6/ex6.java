package day6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //12-Vize,final notunu girip dersten geçme durumunu bulan program

        Scanner scanner=new Scanner(System.in);
        System.out.print("Input visa exam point: ");
        double vis= scanner.nextInt();
        System.out.print("Input final exam point: ");
        double fin= scanner.nextInt();

        double not=vis*0.4+fin*0.6;

        if(not>=60){
            System.out.println("passed");
        }else {
            System.out.println("jailed");
        }







    }
}
