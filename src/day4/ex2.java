package day4;

public class ex2 {
    public static void main(String[] args) {

        //1-1000 aralığında girilen bir sayının kaç basamaklı olduğunu if kullanarak bulun.

        int num = 234;

        if (num > 999) {
            System.out.println("4 basamaklı");
        } else if (num > 99) {
            System.out.println("3 basamaklı");
        } else if (num > 9) {
            System.out.println("2 basamaklı");
        } else if (num > 0) {
            System.out.println("1 basamaklı");

        }


    }


}


