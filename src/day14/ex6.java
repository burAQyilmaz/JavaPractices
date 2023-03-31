package day14;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        //5 karakterli sadece harflerden oluşan random bir şifre oluşturun

        String alfabe="abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";

        Random random=new Random();

        String code="";

        for (int i = 0; i < 5; i++) {

            code+=alfabe.charAt(random.nextInt(alfabe.length()));

        }
        System.out.println(code);

    }
}
