package day16;

public class ex13 {
    public static void main(String[] args) {
        // *Verilen bir metindeki Sesli harfleri kaldıran bir program yazin

        String text = "flmvfvopüer, ezoğağok rkfiq, eıjxıfm wvkrmiam";

        System.out.println(text.replaceAll("[aeıioöuüAEIİOÖUÜ]", ""));

    }
}
