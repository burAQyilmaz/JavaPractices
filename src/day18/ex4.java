package day18;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        //*Birbiri ile aynı olmayan (1-10) aralığında 3 rastgele sayı yazdir

        Random random = new Random();

        int num1,num2,num3;

          while (true) {

              num1 = random.nextInt(10) + 1;
              num2 = random.nextInt(10) + 1;
              num3 = random.nextInt(10) + 1;

              if (num1 != num2 && num2 != num3 && num1 != num3 )

                  break;
          }

        System.out.println(num1+"\n"+num2+"\n"+num3);

    }
}
