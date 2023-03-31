package day7;

public class ex15 {
    public static void main(String[] args) {
        //*Bir metnin alfanumerik olduğunu doğrulayan ve eğer alfanumerikse geçerli, değilse geçersiz yazdıran bir  program yazın.

    String metin="lghshjtrjy5689568";


    if(metin.matches("[0-9a-zA-Z]+"))
        System.out.println("geçerli");
    else System.out.println("geçersiz");



    }
}
