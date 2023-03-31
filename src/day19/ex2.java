package day19;

public class ex2 {
    public static void main(String[] args) {
        //*klmnaoie harfleriyle oluşturulabilecek 3 harfli anlamlı anlamsız bütün kelimeleri yazdirin

        String text = "klmnaoie";

        String kelime ="";

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                for (int k = 0; k < text.length(); k++) {

                    kelime = ""+ text.charAt(i)+text.charAt(j)+text.charAt(k);

                    System.out.println(kelime);
                }

            }

        }

    }
}
