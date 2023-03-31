package day16;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        // *Bir listedeki mail adreslerden gmail.com uzantılı olanları yazdırın.

        String[] liste = {"kfnlknfd@gmail.com", "kvlnfvkn@hotmail.com", "orktopkt@gmail.com" };

        for (String mail : liste) {

            if (mail.endsWith("gmail.com")) {
                System.out.println(mail);
            }
        }

        Arrays.stream(liste).filter(i -> i.endsWith("gmail.com")).forEach(System.out::println);

    }
}

