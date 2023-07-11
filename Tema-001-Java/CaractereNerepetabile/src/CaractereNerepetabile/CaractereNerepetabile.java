// 5. Afisati primul caracter ce nu se repeta dintr-un String
//  (exemplu “abcdefghijab” --> ‘c’).

package CaractereNerepetabile;
import java.util.HashMap;
import java.util.Map;


public class CaractereNerepetabile {
	    public static char primulCaracterNerepetabil(String str) {
	        Map<Character, Integer> numaraCaracter = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            numaraCaracter.put(c, numaraCaracter.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str.toCharArray()) {
	            if (numaraCaracter.get(c) == 1) {
	                return c;
	            }
	        }

	        return '0';
	    }

	    public static void main(String[] args) {
	        String str = "abcdefghijab";
	        char Caracter = primulCaracterNerepetabil(str);

	        System.out.println("Primul caracter care nu se repetă în șir: " + Caracter);
	    }
	}

