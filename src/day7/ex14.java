package day7;

public class ex14 {
    public static void main(String[] args) {
        //*Verilen bir metnin ilk satırda ilk harfini yazdırın ve her satırda bir harf artırarak sonunda metnin tamamını yazdırın.

    String metin="lvösflgogohmsig";

        for (int i = 0; i < metin.length(); i++) {
            System.out.println(metin.substring(0,i+1));

        }


    }
}
