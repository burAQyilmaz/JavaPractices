package day6;

public class ex9 {
    public static void main(String[] args) {
        //17-Sayının asal mı değil mi olduğunu bulan fonksiyon
        int sayi=45;

        asalmi(sayi);

    }

    private static void asalmi(int sayi) {
        String durum= "asaldır.";

        for (int i = 2; i <sayi ; i++) {
            if(sayi % i==0) {
                durum="asal değildir.";
                break;

            }

        }
        System.out.println(sayi+" "+durum);
    }


}
