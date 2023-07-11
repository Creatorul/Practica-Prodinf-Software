//6. Scrieti o metoda care pentru un sir de caractere (String) primit ca parametru creaza
// un nou sir de caractere (String) cu duplicatele eliminate. Ex: ABBCCCCCBBAB -> ABCBAB

package StergeDuplicate;

import java.util.LinkedHashSet;

public class StergeDuplicate {

	    public static String stergeDuplicate(String str) {
	        LinkedHashSet<Character> caractereUnice = new LinkedHashSet<>();

	        for (char c : str.toCharArray()) {
	            caractereUnice.add(c);
	        }

	        StringBuilder resultat = new StringBuilder();
	        for (Character c : caractereUnice) {
	            resultat.append(c);
	        }

	        return resultat.toString();
	    }

	    public static void main(String[] args) {
	        String str = "ABBCCCCCBBAB";
	        String resultat = stergeDuplicate(str);

	        System.out.println("Șirul cu duplicate eliminate: " + resultat);
	    }
	}
// Aici nu pot sa inteleg de ce imi sterge toate duplicatele si nu pastreaza ordinea lor