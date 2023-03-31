package day5;

public class ex15 {
    public static void main(String[] args) {
        // bir metindeki rakamların sayısını bulma:

        String metin = "213amdkfj*!345glg.;";

        metin=metin.replaceAll("[^0-9]", "");
        /*
       ^ değil işareti gibi yani 0dan 9a sayılar hariç
        tüm karakterleri boşlukla değiştir*/

        System.out.println(metin.length());

    }
}
