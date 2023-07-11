//1. Scrieti un program care verifica daca doua cuvinte sunt anagrame
// (fiecare se poate obtine din celalalt schimband ordinea literelor). 

package VerificareAnagrama;
import java.util.Arrays;

public class VerificareAnagrama {
    public static boolean suntAnagrame(String cuvant1, String cuvant2) {
        cuvant1 = cuvant1.replaceAll("\\s", "").toLowerCase();
        cuvant2 = cuvant2.replaceAll("\\s", "").toLowerCase();

        if (cuvant1.length() != cuvant2.length()) {
            return false;
        }

        char[] charArray1 = cuvant1.toCharArray();
        char[] charArray2 = cuvant2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String cuvant1 = "privire";
        String cuvant2 = "vedere";

        if (suntAnagrame(cuvant1, cuvant2)) {
            System.out.println(cuvant1 + " și " + cuvant2 + " sunt anagrame.");
        } else {
            System.out.println(cuvant1 + " și " + cuvant2 + " nu sunt anagrame.");
        }
    }
}
