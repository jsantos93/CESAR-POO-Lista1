package lista1;
import java.util.Scanner;

public class ComparadorDeStrings {
	
	public boolean comparar(String frase1, String frase2) {
		if (frase1.length() == frase2.length()) {
			
			int contador = frase2.length() - 1;
			
			for( int i = 0; i < frase1.length(); i++) {
				if(frase1.charAt(i) != frase2.charAt(contador)) {
					return false;
				}
				contador --;
			}
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ComparadorDeStrings comparador = new ComparadorDeStrings();
		
		System.out.println("Digite uma frase:");
		String frase1 = input.nextLine();
		System.out.println("Digite a proxima frase");
		String frase2 = input.nextLine();

		System.out.println(comparador.comparar(frase1, frase2));
		
		
		input.close();
	}

}