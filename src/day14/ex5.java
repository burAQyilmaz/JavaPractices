package day14;

public class ex5 {
    public static void main(String[] args) {
        //Bir çok boyutlu dizideki en büyük elemanı bulan bir Java programı yazın.

        int[][] sayilar=new int[3][2];

        sayilar[0][0]=6;
        sayilar[0][1]=56;

        sayilar[1][0]=64;
        sayilar[1][1]=576;

        sayilar[2][0]=4;
        sayilar[2][1]=76;

        int max= sayilar[0][0];

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                if(sayilar[i][j]>max){
                    max=sayilar[i][j];
                }

            }
            
        }
        System.out.println(max);
    }
}
