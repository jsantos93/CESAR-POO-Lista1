package lista1;
import java.util.Scanner;

public class Estatistica {
	
	private int maiorValor;
	
	
	public Estatistica (int maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	public int somatorio() {
		int soma = 0;
		int contador = 0;
		while(contador <= maiorValor) {
			soma += contador;
			contador++;
		}
		return soma;
	}
	
	public float media () {
		float soma = 0;
		float count = 0;
		
		do {
			soma += count;
			count++;
		} while(count <= maiorValor);
		
		return soma / maiorValor;
	}
	
	public double variancia() {
		double variancia = 0;
		double count = 0;
		for(double i = 0; i <= maiorValor; i++) {
			variancia = variancia + Math.pow((count - this.media()), 2);
			count++;
		}
		return variancia/count;
	}
	
	public void parImpar() {
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
	
	public void setMaiorValor(int maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	public int getMaiorValor() {
		return maiorValor;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int maiorNumero = input.nextInt();
		
		Estatistica estatistica = new Estatistica(maiorNumero);
		
		System.out.println("Somatório = " + estatistica.somatorio());
		System.out.println("Média = " + estatistica.media());
		System.out.println("Variancia = " + estatistica.variancia());
		estatistica.parImpar();
		
		
		input.close();
	}

}