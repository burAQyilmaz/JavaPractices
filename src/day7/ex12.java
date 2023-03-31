package day7;

public class ex12 {
    public static void main(String[] args) {
        //*[100-200] aralığındaki asal sayıları yazdıran bir program yazın.


        for (int i = 100; i <=200 ; i++) {
            if(asal(i)==true)
                System.out.println(i);

        }

    }

    private static boolean asal(int sayi) {

 boolean asalmi=true;



        for (int i = 2; i <sayi ; i++) {
            if(sayi % i ==0){
               asalmi=false;
               break;
            }


        }
return asalmi;




    }
}
