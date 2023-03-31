package day8;

public class ex888888 {
    public static void main(String[] args) {
        //Bir cümledeki gereksiz boşlukları silen bir fonksiyon yazınız.

        String text = "    Güneşli  günler   göreceğiz     çocuklar .  ";

        String[] words = text.split(" ");
        System.out.println(words.length);

        for (int i = 0; i < words.length; i++) {
            if (words[i].replace(" ", "").length() != 0) {

                if (i == 0 && words[i].length() == 1) {
                    System.out.print(words[i]);
                }
                else System.out.print(" " + words[i]);
            }

/* Chat Gpt nin çözümü:
 String text = "    Güneşli  günler   göreceğiz     çocuklar .  ";

        text = text.trim();

        // Tek boşluklar kullan
        text = text.replaceAll("\\s+", " ");

        // Noktadan önceki boşlukları kaldır
        text = text.replaceAll("\\s+(?=\\.)", "");

        System.out.println(text);
 */
            /*
             ferhat abinin çözümü:
             String text = "    Güneşli  günler   göreceğiz     çocuklar .  ";

        text = text.trim();//Baştaki ve sondaki boşlukları siler.
        System.out.println(text);

        String newText = text.replaceAll("\\s+", " ");//Birden fazla boşluğu tek boşluğa dönüştürür.
        System.out.println(newText);

        String newerText = newText.replace(" .", ".");//Nokta öncesi boşluğu siler.
        System.out.println(newerText);


        String text = "    Güneşli  günler   göreceğiz     çocuklar .  ";
        text = text.trim();

        String[] words = text.split("\\s+ ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }

        result = result.replace(" . ", ".");
        System.out.println(result);
             */
        }


    }
}
