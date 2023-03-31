package day15;

public class ex9 {
    public static void main(String[] args) {
        // *Verilen birinci metnin harflerinden gerekli olanları  kullanarak ikinci metnin yazılıp yazılmadığını kontrol edin.

        String text1 = "denizlerin dalgasıyım";
        String text2 = "dalgın izlerim";
        boolean varmi = true;

        for (int i = 0; i < text2.length(); i++) {

            if (!text1.contains(text2.charAt(i) + "")) {
                varmi = false;

            }


        }
        if (varmi) System.out.println("yazilabilir");


    }
}
