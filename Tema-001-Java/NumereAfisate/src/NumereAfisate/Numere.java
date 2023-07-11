//3. Afiseza numerele de la 1 la 10 fara folosi vreo bucla
//  (for / while / do while). Indiciu: recursivitate.

package NumereAfisate;

public class Numere {
	    public static void NrAlese(int n) {
	        if (n <= 10) {
	            System.out.println(n);
	            NrAlese(n + 1);
	        }
	    }

	    public static void main(String[] args) {
	        NrAlese(1);
	    }
	}