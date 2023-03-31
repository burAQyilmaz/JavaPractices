package day19;

public class ex3 {
    public static void main(String[] args) {
        //*Bir metindeki her karakterin arasına * işareti ekleyin ve yeni metni yazdirin

        String text ="lmrıaimvajn";

        String newText = "";

        newText = text.replaceAll("[^ ]","$0*").replace(" "," *"); //ilk replace de boşluk dışındaki tüm karakterlerden sonra * koydurduk ikinci replace de ise kelimeler arasında boşluk varsa onlardan sonra da * yazdırıyor

        newText = newText.substring(0,newText.length()-1); //son karakterden sonraki yıldızı substringle yazdırmadık

        System.out.println(newText);

        System.out.println("--------------------------------------------------------------");

        text = text.replace("","*");  //chatgpt

        System.out.println(text.substring(1,text.length()-1));






    }
}
