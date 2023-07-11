//4. Returnati valorile distincte dintr-o lista ce contine duplicate.
// Exemplu (1, 2, 1, 5, 1, 9, 9) --> (1, 2, 5, 9)

package ValoriDistincte;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ValoriDistincte {
	    public static List<Integer> getValoriDistincte(List<Integer> lista) {
	        Set<Integer> set = new HashSet<>(lista);
	        return new ArrayList<>(set);
	    }

	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				List<Integer> lista = new ArrayList<>();

				System.out.println("Introduceti 7 valori:");

				for (int i = 0; i < 7; i++) {
				    int numare = scanner.nextInt();
				    lista.add(numare);
				}

				List<Integer> valoriDistincte= getValoriDistincte(lista);

				System.out.println("Valori distincte:");
				for (int numare : valoriDistincte) {
				    System.out.println(numare);
				}
			}
	    }
	}

