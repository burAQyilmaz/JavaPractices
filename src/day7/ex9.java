package day7;

public class ex9 {
    public static void main(String[] args) {
        //Bir string dizisinin her bir elemaninin uzunluğunu aynı numaralı  indexte tutan bir integer dizisi yazınız.

        String [] text={"fkamfgkrng","j5837t5","mvıtjgıj85","bşmtgbkmtrgj9540","lsföglf","llş"};

        int [] textlenght=new int[text.length];

        for (int i = 0; i < text.length ; i++) {

            textlenght[i]=text[i].length();


        }
        for (int i = 0; i < text.length ; i++) {
            System.out.println(textlenght[i]);

        }





    }
}
