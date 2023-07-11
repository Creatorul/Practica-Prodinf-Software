//2. Se se scrie un program care aduna doua numere exprimate in binar
// (exp a = 11, b = 1, a+b = 100). Rezultatul fiind de asemenea in binar.

package ExprimareBinara;
public class ExprimareBinara {
		    public static String Binar(String a, String b) {
	        StringBuilder resultat = new StringBuilder();
	        int carry = 0;
	        int i = a.length() - 1;
	        int j = b.length() - 1;

	        while (i >= 0 || j >= 0 || carry != 0) {
	            int suma = carry;

	            if (i >= 0) {
	                suma += a.charAt(i) - '0';
	                i--;
	            }

	            if (j >= 0) {
	                suma += b.charAt(j) - '0';
	                j--;
	            }

	            resultat.insert(0, suma % 2);
	            carry = suma / 2;
	        }

	        return resultat.toString();
	    }

	    public static void main(String[] args) {
	        String a = "11";
	        String b = "1";

	        String sum = Binar(a, b);
	        System.out.println("Suma: " + sum);
	    }
	}

