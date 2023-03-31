package day16;

public class ex1 {
    public static void main(String[] args) {
        //*4 karakterli alfabetik bir şifreyi kıran ve kaç denemede bunu başardığını gösteren program yazin

        String code = "kmfk";

        String tahmin = "";

        String harfler = "";

        for (char i = 'a'; i <= 'z'; i++) {

            harfler += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            harfler += i;
        }

        harfler += "ıöüİÖÜĞÇŞğçş";

        int sayac = 0;
        forlardanCikis:
        for (int i = 0; i < harfler.length(); i++) {
            for (int j = 0; j < harfler.length(); j++) {
                for (int k = 0; k < harfler.length(); k++) {
                    for (int l = 0; l < harfler.length(); l++) {
                        sayac++;

                        tahmin ="" + harfler.charAt(i) + harfler.charAt(j) + harfler.charAt(k) + harfler.charAt(l); //tahmin string ancak diğerleri char olduğundan strin ile topplayıp stringe çevirdim

                        if (tahmin.equals(code)) {

                            System.out.println(sayac);
                            break forlardanCikis;
                        }

                    }

                }

            }

        }


    }
}
