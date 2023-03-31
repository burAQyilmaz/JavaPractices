package day17;

public class ex8 {
    public static void main(String[] args) {
        // *7,9,3 ve 0 ile yapılabilecek 4 basamakli bütün sayıları yazın (rakamlar tekrar edebilir)

        int[] rakam = {0,3,7,9};

        for (int i = 1; i < rakam.length ; i++) {
            for (int j = 0; j < rakam.length; j++) {
                for (int k = 0; k < rakam.length; k++) {
                    for (int l = 0; l < rakam.length; l++) {

                        System.out.println(rakam[i]*1000+rakam[j]*100+rakam[k]*10+rakam[l]);

                    }

                }

            }

        }

    }
}
