package day14;

public class ex4 {
    public static void main(String[] args) {
        // çok boyutlu diziler

        String[][] adSoyad = new String[3][2];

        adSoyad[0][0] = "Yunus";
        adSoyad[0][1] = "Külcü";

        adSoyad[1][0] = "Ayşe";
        adSoyad[1][1] = "Kaya";

        adSoyad[2][0] = "Burak";
        adSoyad[2][1] = "Yılmaz";


        for (int i = 0; i < adSoyad.length; i++) {
            System.out.println(adSoyad[i][0] + " " + adSoyad[i][1]);
        }
    }
}
