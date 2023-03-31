package day7;

public class ex13 {
    public static void main(String[] args) {
        //*1500 den küçük  17'nin katı olan en büyük sayıyı yazdırın.

        for (int i = 1500; i >0 ; i--) {
            if(i % 17==0){
                System.out.println(i);
                break;}

        }


    }
}
