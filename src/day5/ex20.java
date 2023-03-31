package day5;

public class ex20 {
    public static void main(String[] args) {

        //*Girilen bir metinde kaç tane rakam olduğunu bul ve ekrana yazdır.

        String metin="aslflasdkjf568596gflşmfkmg234!.,*gsg34.";

        metin=metin.replaceAll("[^0-9]","");//metinden rakam dışındakileri sil ve metni yeniden oluştur

        System.out.println(metin.length());

    }
}
