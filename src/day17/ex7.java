package day17;

import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        // *Bir string değerin içindeki alfabetik değeri, içindeki numerik değer kadar yazdırın.
        // (Değerler soldan sağa eklenerek olusturulacak)

        String text = "vlföüork9589-23fkvfoms*4mbs95";

       String alfabetik = text.replaceAll("[^a-zA-ZİıÇçŞşÜüĞğÖö]","");

       int numerik = Integer.parseInt(text.replaceAll("[^0-9]",""));

        for (int i = 0; i < numerik ; i++) {

            System.out.println(alfabetik);

        }




    }
}
