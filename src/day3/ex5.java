package day3;

public class ex5 {
    public static void main(String[] args) {
        //1  ile 100 arasında 5 ile bölünebilen sayıları topla ve sonucu ekrana yazdır.
        int sum = 0;
        for (int i = 0; i <= 100; i += 5) {

            sum = i + sum;
            //sum=sum+i daha doğru okunaklı
            //sum+=i daha daha okumaklı olması gereken
        }

        System.out.print(sum);
    }
}
