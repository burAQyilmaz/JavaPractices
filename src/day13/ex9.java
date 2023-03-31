package day13;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        //Java'da bir metnin içindeki her kelimenin ilk harfini büyük harf yapmak için en iyi yöntem nedir?


        String metin= "motorları maviliklere süreceğiz çocuklar";

        Scanner scanner= new Scanner(metin);

        String yeniCumle="";


while(scanner.hasNext()){

    String aktifKelime= scanner.next();

    aktifKelime=aktifKelime.substring(0,1).toUpperCase()+aktifKelime.substring(1);

    yeniCumle+=aktifKelime+ " ";

        }

        System.out.println(yeniCumle);

    }
}
