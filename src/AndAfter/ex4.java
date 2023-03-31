package AndAfter;

public class ex4 {
    public static void main(String[] args) {
        //*5 numerik karakterli, ilk dört karakterin toplamının 10 a bölümünden kalan 5. karakteri veren,
        //ilk karakteri 7 olmayan
        //Son karakteri çift olmayan toplam kaç sayı vardır.


        int counter = 0;

        for (int i = 10000; i <= 99999; i++) {

            int ilkDortTop = 0;

            int num = i / 10;

            while (num > 0) {

                ilkDortTop += num % 10;

                num /= 10;

                //ilkDortTop= i / 10000 + i / 1000 % 10 + i / 100 % 10 + i / 10 % 10;
            }

            if (i / 10000 != 7 && i % 10 % 2 != 0 && ilkDortTop % 10 == i % 10) {

                counter++;

                System.out.println(i);
            }
        }
        System.out.println(counter);

    }
}
