import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie_6_4 {

	public static void main(String[] args) throws IOException {
		String plik2 = "C:\\Users\\Student\\Desktop\\test.txt";
		int move = 3;
		szyfruj(plik2, move);

	}
	
	public static void szyfruj(String nazwaWe, int przesun) throws IOException {
		File plik = new File(nazwaWe);
		BufferedReader czyt = new BufferedReader(new FileReader(plik));
		BufferedWriter dod = new BufferedWriter(new FileWriter(new File("C:\\Users\\Student\\Desktop\\_test.txt")));
		
		String linijka; 
		int znak;
		
		while ((linijka = czyt.readLine()) != null) {
			for(int i=0; i<linijka.length(); i++) {
				znak=linijka.charAt(i)+przesun%26;
				dod.write(znak);
			}
		}
		dod.close();
		czyt.close();
	
	}
	
	
	public static void deszyfruj(String nazwaWe, int przesun) {
		
	}

}
