package AndAfter;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //String puanlar = "Yunus:35, Burak:75, Ayşe:29, Ümmühan:32"
        // verisindeki numerik değerleri (puanlar) toplayan bir program yazın.

        String puanlar = "Yunus:35, Burak:75, Ayşe:29, Ümmühan:32";

        String[] numerik = puanlar.split("[^0-9]+");

        System.out.println(Arrays.toString(numerik));

        int sum = 0;

        for (int i = 0; i < numerik.length; i++) {

            if (!numerik[i].isEmpty())

                sum += Integer.parseInt(numerik[i]);

        }

        System.out.println(sum);
    }
}
