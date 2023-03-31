package day15;

public class ex1 {
    public static void main(String[] args) {

        // Bir metindeki Türkçe karakterleri yakın karakterlerle değiştirin
        //Input "ırkçılık"
        //Output "irkcilik"

        String text = "vmsklfnvsı vaölşöçvapğdv öavsmewıqwğmcmv çvfüvlpwowejı";

        text=text.replace("ı", "i")
                .replace("ç", "c")
                .replace("ğ", "g")
                .replace("ö", "o")
                .replace("ş", "s")
                .replace("ü", "u")
                .replace("İ", "I")
                .replace("Ç", "C")
                .replace("Ğ", "G")
                .replace("Ö", "O")
                .replace("Ş", "S")
                .replace("Ü", "U");

        System.out.println(text);

    }
}
