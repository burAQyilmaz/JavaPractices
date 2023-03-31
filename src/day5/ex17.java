package day5;

public class ex17 {
    public static void main(String[] args) {

        //*Girilen bir metnin kaç kelimeden oluştuğunu gösteren bir program yazın.

        String metin= "Seni Çok ama çoook seviyooom!";

        System.out.println(metin.split(" ").length);/*split ayırma demek
        o halde boşluklardan ayırırak bir dizi oluşturuyoruz
        daha sonra bu dizinin uzunluğu(lenght) bize kelime sayısını verecektir.*/

// ikinci çözüm:

        System.out.println(metin.replaceAll("[^ ]","").length()+1);



    }
}
