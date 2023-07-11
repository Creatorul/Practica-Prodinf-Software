// 7. Scrieti un program care simuleaza aruncarea unei perechi de zaruri. Puteti simula aruncarea unui zar alegand in mod aleatoriu cate un numar intreg dintre 1, 2, 3, 4, 5 si 6. Numarul ales reprezinta valoarea de pe un zar dupa aruncare. 
// Hint: (int)(Math.random()*6) + 1 
// Exemplu iesire: 
// Primul zar are valoarea 3 
// Al doilea zar are valoarea 5
// Valoarea totala este 8


package Zaruri;

public class AruncareZaruri {

	    public static void main(String[] args) {
	    	int zar1 = (int) (Math.random() * 6) + 1;

	        int zar2 = (int) (Math.random() * 6) + 1;

	        int sumaZar = zar1 + zar2;

	        System.out.println("Primul zar are valoarea " + zar1);
	        System.out.println("Al doilea zar are valoarea " + zar2);
	        System.out.println("Valoarea totală este " + sumaZar);
	    }
	}
