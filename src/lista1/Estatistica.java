package lista1;
import java.util.Scanner;

public class Estatistica {
	
	int maiorValor;
	
	
	public Estatistica (int maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	public int somatorio(int maiorValor) {
		int soma = 0;
		int contador = 0;
		while(contador <= maiorValor) {
			soma += contador;
			contador++;
		}
		return soma;
	}
	
	public int media (int maiorValor) {
		int soma = 0;
		int count =-1;
		
		for (int i = 0; i <= maiorValor; i++) {
			soma += i;
			count ++;
		}
		return soma / count;
	}
	
	public void parImpar(int maiorValor) {
		int count = 1;
		while(count <= maiorValor) {
			if (count % 2 == 0) {
				System.out.println(count + " é Par");
			}
			else {
				System.out.println(count + " é Impar");
			}
			count++;
		}  
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int maiorNumero = input.nextInt();
		
		Estatistica estatistica = new Estatistica(maiorNumero);
		
		System.out.println(estatistica.somatorio(maiorNumero));
		System.out.println(estatistica.media(maiorNumero));
		estatistica.parImpar(maiorNumero);
		
		
		input.close();
	}

}