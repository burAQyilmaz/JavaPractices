package day11;

public class ex14 {
    public static void main(String[] args) {
         // *[10-99] aralığında rakamları çarpımı tam kare olan sayıları yazdırın.

        for (int i = 10; i <100 ; i++) {

            int birler = i % 10;
            int onlar = i / 10;
            int carpim = birler*onlar;
            double karekok= Math.sqrt(carpim);
            int sayi = (int) karekok; // double değeri cast ile int yaparsan küsürat atılıp tam sayı kısmını yazar
            if(sayi==karekok) System.out.println(i);

        }
    }
}
