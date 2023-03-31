package day10;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        // *Bir metindeki alfabetik karakterleri bir diziye numerik karakterleri başka bir diziye kaydedin.
        // Bu dizileri yazdırın.

        String text = "akfdlkdanf85784jtı484ıfnknjfng";

        String metin = "Selam343 nasılsınız 30,ben";
        String[] karakterler = metin.split("");

        String[] alfabetik = new String[metin.length()];
        int[] numerik = new int[metin.length()];
        int alfabetikSayac = 0;
        int numerikSayac = 0;
        for (int i = 0; i < karakterler.length; i++) {

            if (karakterler[i].matches("[A-Za-zİışŞÖöÜüÇçĞğ]")) {
                alfabetik[alfabetikSayac] = karakterler[i];
                alfabetikSayac++;
            }
            if (karakterler[i].matches("[0-9]")) {
                numerik[numerikSayac] = Integer.parseInt(karakterler[i]);
                numerikSayac++;
            }

        }

        System.out.println(Arrays.toString(alfabetik));
        System.out.println(Arrays.toString(numerik));

/*
        // ya da chat gpt nin çözümü:

        String text = "Bu bir örnek metindir 1234.";

        // Alfabetik karakterlerin saklanacağı dizi
        char[] alphabeticChars = new char[text.length()];

        // Numerik karakterlerin saklanacağı dizi
        char[] numericChars = new char[text.length()];

        int alphabeticIndex = 0;
        int numericIndex = 0;

        // Karakter dizisindeki her bir karakteri kontrol et
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Karakterin harf olup olmadığını kontrol et
            if (Character.isLetter(c)) {
                alphabeticChars[alphabeticIndex] = c;
                alphabeticIndex++;
            }
            // Karakterin sayı olup olmadığını kontrol et
            else if (Character.isDigit(c)) {
                numericChars[numericIndex] = c;
                numericIndex++;
            }
        }

        // Alfabedik karakterlerin bulunduğu diziyi yazdır
        System.out.print("Alphabetic Characters: ");
        for (int i = 0; i < alphabeticIndex; i++) {
            System.out.print(alphabeticChars[i] + " ");
        }

        // Numerik karakterlerin bulunduğu diziyi yazdır
        System.out.print("\nNumeric Characters: ");
        for (int i = 0; i < numericIndex; i++) {
            System.out.print(numericChars[i] + " ");
        }
*/
    }
}
