import java.util.Scanner;
public class Zadanie_4_6 {

	public static void main(String[] args) {
		
		int j=0;
		Scanner czytnik = new Scanner(System.in);
		String wyraz = czytnik.nextLine();
		char[] tabela = new char[wyraz.length()];
		for(int i=0; i<wyraz.length(); i++) {
			tabela[i] = wyraz.charAt(i);
		}
		
		Scanner czytnik2 = new Scanner(System.in);
		int p = czytnik2.nextInt();
		
		char[] abc = new char[26]; 
		
		for(char i = 'a'; i <= 'z'; i++ ) {
			abc[i-'a'] = i;
		}
		
		for (int i=0; i<tabela.length; i++) {
			for(int k=0; k<abc.length; k++) {
				
				if (tabela[i]==abc[k]) {
					
					tabela[i]=abc[(k+p)%26];
					break;	
				
				}
					
			}
			
		}
		
		String wyraz2 = new String(tabela);
		System.out.println(wyraz2);
		
	}

	
}
