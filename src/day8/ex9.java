package day8;

import java.util.Locale;

public class ex9 {
    public static void main(String[] args) {
        /*
        Verilen iki metni eşitliğini büyük küçük harfe duyarlı olmadan karşılaştır
        ve "eşit" veya "eşit değil" yazdır.
         */
        String text1= "burakkl";
        String text2= "BuRaK";

        if(text1.toUpperCase().equals(text2.toUpperCase()))
        {
            System.out.println("eşit");
        }else System.out.println("eşit değildir");

        /*
        diğer ve kısa yol:  !!!!!
        if (text1.equalsIgnoreCase(text2))
         */




    }

}
