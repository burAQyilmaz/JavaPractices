package day9;

public class ex1 {
    public static void main(String[] args) {

        //*Bir dizi içindeki metinlerden a harfi ile başlayanları yazdırın.

        String[] texts={"arive", "drive", "camel", "first", "amour", "sex"};

        for(String text: texts){
            if(text.startsWith("a"))
            System.out.println(text);
        }
        // !!!!!!!   Arrays.stream(texts).filter(x->x.startsWith("a")).forEach(System.out::println);

    }
}
