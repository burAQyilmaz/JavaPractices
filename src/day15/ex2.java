package day15;

public class ex2 {
    public static void main(String[] args) {

        //*Bir double değişkenin ondalık kısmını ekrana yazdıran bir program yazınız

        double num = 34.567;

        double ondalikkisim = num - (int)num;

        System.out.println(ondalikkisim);

        //sadece . dan sonrası yazdırılacaksa

        String value = Double.toString(num);

        int noktaIndex= value.indexOf(".");

        System.out.println(value.substring(noktaIndex + 1));








    }
}
