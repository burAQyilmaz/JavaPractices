package day3;

public class ex14 {
    public static void main(String[] args) {
        //Üç sayıdan en küçük olanı bulan program yaz

        int n1=34;
        int n2=24;
        int n3=55;

        int enKucuk=n1;//enKucuk diye bir değişken oluşturuyor ve n1 olduğunu varsayarak başlıyoruz

        if(enKucuk>n2){
            enKucuk=n2;

        }
        if(enKucuk>n3){
            enKucuk=n3;
        }
        System.out.println(enKucuk);
    }
}
