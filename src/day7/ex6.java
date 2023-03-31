package day7;


public class ex6 {
    public static void main(String[] args) {
        //*Girilen bir stringin sadece rakamlardan oluşup oluşmadığı sorgulayan bir fonksiyon yazin

        String text= "544390768326301";

        System.out.println(check(text)?"sadece rakamlardan oluşuyor":"sadece rakamlardan oluşmuyor"); /*
        burada koşul: check(text) yani sadece rakamlardan oluşuyor mu.
        ? : if demek
        ":" ise else demek */

        check(text);
    }

    private static boolean check(String text) {

        boolean chck=false;

        if(text.matches("[0-9]+")){ // [0-9]+ : metnin 0 ile 9 arasındaki rakamlardan oluştuğu
            chck=true;
        }

        return chck;

    }
}
