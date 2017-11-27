import java.util.Scanner;
public class Zadanie_4_5 {

	public static void main(String[] args) {
		
		int i, j, k=0, l=0;
		Scanner czytnik = new Scanner(System.in);
		String wyraz = czytnik.nextLine();
		char[] tablica = new char[wyraz.length()];
		
		for (i=0; i<wyraz.length(); ++i) {
			tablica[i]=wyraz.charAt(i);
		}
		
		
		for (i=0; i<wyraz.length(); ++i) {
			if (tablica[i]=='(') {
				k++;
			}
			else if (tablica[i]==')') {
				l++;
			}
		}
		
		
		if (k == l) {
			System.out.println("dobrze");
		}
		else {
			System.out.println("zle");
		}
		
	}

}
