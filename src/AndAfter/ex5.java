package AndAfter;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //*Bir şifre belirleyin. Kullanıcının 3 deneme hakkı var.
        // Kullanıcı üç deneme içinde şifreyi bulursa "giriş başarılı"
        // üç deneme sonunda şifre bulunmazsa "hesabınız askıya alınmıştır" yazdırın.

        String code = "kfngg";

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Input code: ");
            String inputCode = scan.nextLine();

            if (inputCode.equals(code)) {
                System.out.println("giriş başarılı");
                break;
            }
            if (i == 3) System.out.println("hesabınız askıya alınmıştır");

        }

    }
}
