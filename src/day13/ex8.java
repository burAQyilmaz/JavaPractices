package day13;

public class ex8 {
    public static void main(String[] args) {

        // Verilen bir tam sayı dizisindeki üç sayının toplamının belirli bir hedef sayıya eşit olduğu
        // tüm üçlü kombinasyonları nasıl bulabilirsiniz?

        int hedef=50;
        int[] sayilar= {1, 45, 32, 8, 13, 10, 4, 9, 5};

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = i+1; j < sayilar.length-1; j++) {
                for (int k = j+1; k < sayilar.length-2; k++) {

                    if(sayilar[i]+sayilar[j]+sayilar[k]==50){
                        System.out.println(sayilar[i]+", "+sayilar[j]+ ", "+ sayilar[k]);
                    }




                }

            }

        }




    }
}
