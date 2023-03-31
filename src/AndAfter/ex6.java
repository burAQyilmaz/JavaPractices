package AndAfter;

public class ex6 {
    public static void main(String[] args) {

        //Change the number by increasing each digit in a number by one. If a digit is 9, change it to 0

        int num = 12345;

        int newNum = 0;

        int digit = 0;

        int temp = num;

        int power=1;

        while (temp > 0) {

            digit = temp % 10;

            temp/=10;

            if (digit < 9) {

                newNum += (digit + 1)*power;   //Math.pow(10,counter)

            } else {

                newNum += 0;
            }
            power*=10;
        }
        System.out.println(newNum);
    }
}
