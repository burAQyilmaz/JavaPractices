package day14;

public class ex7 {
    public static void main(String[] args) {
        // alfabe oluştur

        String alfabe = "";

        for (char c = 'a'; c <= 'z' ; c++) {

            alfabe+=c;

        }
        for (char c = 'A'; c <='Z' ; c++) {
            alfabe+=c;

        }

        System.out.println(alfabe);
    }
}
