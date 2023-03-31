package day11;

import java.util.Random;

public class ex3 {

    public static void main(String[] args) {

// *6 karakterli numerik bir şifre oluşturun.
// Bilgisayarın rastgele değerler girerek bu şifreyi kaç denemede bulabildiğini gösteren bir program yazın.

int code = 950934;

        Random random = new Random();

        int sayac = 0;

    while (true) {
        int tahmin = random.nextInt(1000000);
        sayac++;
        if(tahmin==code){
            System.out.println(sayac + " denemede şifre başarıyla çözüldü.");
            break;

        }

        }





    }
}
