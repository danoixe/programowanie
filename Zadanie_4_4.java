import java.util.Scanner;
public class Zadanie_4_4 {

	public static void main(String[] args) {
		
		Scanner czytnik = new Scanner(System.in);
		int suma = 0;
		String tekst = czytnik.nextLine();
		for (int i=0; i<tekst.length(); ++i) {
			if (tekst.charAt(i) >= 48 && tekst.charAt(i) <= 57) {
				suma += tekst.charAt(i) - 48;
			}
		}
		System.out.println(suma);
		//Character.isDigit() - sprawdza czy jest liczb¹
		
		

	}

}
