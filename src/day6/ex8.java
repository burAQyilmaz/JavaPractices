package day6;

public class ex8 {
    public static void main(String[] args) {
        //16-Listede 5 var ise “5 var” yazdıran fonksiyon

        int [] liste= {1,34,67,0,87,345,5};
        int sayi=5;

        varmi(liste,sayi);




    }

    private static void varmi(int[] liste, int sayi) {
        for (int i = 0; i < liste.length ; i++) {
            if(liste[i]==sayi){
                System.out.println(sayi+ " var");
                break;
            }



        }
    }
}
