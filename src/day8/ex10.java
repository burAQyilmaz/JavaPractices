package day8;

public class ex10 {
    public static void main(String[] args) {
      /*
      Bir string'in palindrom olup olmadığını kontrol etmek

Bir palindrom, baştan ve sondan okunduğunda aynı olan bir kelime, cümle veya sayıdır. Örneğin, "radar" ve "12321" palindromdur.
       */

        String text= "nalan";
        StringBuilder sb=new StringBuilder(text);

        if(text.equals(sb.reverse().toString())){ //sb.reverse string cinsinden olmadığından karşılaştırabilmesi için toString yapıyoruz.
            System.out.println(text+" is palindrom.");
        }else System.out.println(text+" is not palindrom.");



    }
}
