package day14;

public class ex1 {
    public static void main(String[] args) {
        // Bir metindeki satır sayısını bulan bir Java programı yazın.

        String text="şlrmgg\nfhguhgr\nıjrqıjfiwjf\nwefuhfuıhew\neuwhfuıhwf\nıwoehrfoıwef";

        System.out.println(text.length()-text.replace("\n","").length()+1);
        /*
        \n i bir karakter olarak düşünüp sildim
         */

    }
}
