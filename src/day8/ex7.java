package day8;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //*Girilen 2 basamaklı sayının okunuşunu veren fonksiyon yaz.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a number with two basement: ");
        int num= scanner.nextInt();

        read(num);

    }
    public static void read(int num) {
        int onlar=num/10;
        int birler=num % 10;
        String okunus="";

            if(onlar==1) okunus="on ";
            else if (onlar==2) okunus="yirmi ";
            else if (onlar==3) okunus="otuz ";
            else if (onlar==4) okunus="kırk ";
            else if (onlar==5) okunus="elli ";
            else if (onlar==6) okunus="altmış ";
            else if (onlar==7) okunus="yetmiş ";
            else if (onlar==8) okunus="seksen ";
            else if (onlar==9) okunus="doksan ";

            if(birler==1) okunus=okunus+"bir";
            else if(birler==2) okunus=okunus+"iki";
            else if(birler==3) okunus=okunus+"üç";
            else if(birler==4) okunus=okunus+"dört";
            else if(birler==5) okunus=okunus+"beş";
            else if(birler==6) okunus=okunus+"altı";
            else if(birler==7) okunus=okunus+"yedi";
            else if(birler==8) okunus=okunus+"sekiz";
            else if(birler==9) okunus=okunus+"dokuz";

        System.out.println(okunus);







    }
}
