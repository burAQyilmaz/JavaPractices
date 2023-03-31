package day16;

public class ex7 {
    public static void main(String[] args) {
        // *[1000-2000] aralığındaki rakamları küçükten büyüğe sıralanmış olan sayıları yazdırın.

        for (int i = 1000; i <= 2000; i++) {

            int tempI = i;

            boolean yazilsinMi = true;

            while (tempI > 0) {

                int bas1 = tempI % 10;
                tempI /= 10;

                int bas2 = tempI % 10;

                if (bas1 <= bas2) {
                    yazilsinMi = false;
                    break;

                }

            }
            if (yazilsinMi)
                System.out.println(i);

        }

    }
}
