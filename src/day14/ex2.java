package day14;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //Bir string dizisindeki en uzun harfli kelimeyi 10 defa yazdır.

        String[] texts= {"lkfnv", "klvlf", "kfvnwfniğ", "nj", "mckdncğfeıvw", ""};

       String enUzun= texts[0];

        for (int i = 1; i < texts.length ; i++) {

            if(texts[i].length()>enUzun.length())
                enUzun=texts[i];
        }


        System.out.println((enUzun+"\n").repeat(10));




    }
}
