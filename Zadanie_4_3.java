import java.util.Scanner;
public class Zadanie_4_3 {

	public static void main(String[] args) {
		int i;
		Scanner czytnik = new Scanner(System.in);
		String wyraz = czytnik.nextLine();
		
		char[] tablica = new char[wyraz.length()];
		for(i=0; i<wyraz.length(); ++i) {
			tablica[i] = wyraz.charAt(wyraz.length()-i-1);
		}
		
		
		String wyraz2 = new String(tablica);
		System.out.println(wyraz2);
		
		int wynik = wyraz.compareTo(wyraz2);
		if (wynik == 0) {
			System.out.println("Wyraz jest palindromem");
		}
		else {
			System.out.println("nie jest");
		}
		
	

	}

}
