package lista1;
import java.util.Scanner;

public class Calculadora {

	public float somar(float n1, float n2) {
		return n1 + n2;
	}
	
	public float subtrair(float n1, float n2) {
		return n1 - n2;
	}
	
	public float multiplicar(float n1, float n2) {
		return n1 * n2;
	}
	
	public float dividir(float n1, float n2) {
		return n1 / n2;	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();
		
		float numero1, numero2;
		char operacao;
		
		System.out.println("Primeiro, digite qual operação vc deseja realizar ");
		System.out.println("Para somar [+]"); 
		System.out.println("Para subtrair [-]");
		System.out.println("Para multiplicar [*]");
		System.out.println("Para dividir [/]"); 
		
		operacao = input.next().charAt(0);
		
		System.out.println("Digite os dois números separados por espaço");
		
		numero1 = input.nextFloat();
		numero2 = input.nextFloat();
		
		if (operacao == '+'){
			System.out.println(calcular.somar(numero1, numero2));
		}
		else if (operacao == '-') {
			System.out.println(calcular.subtrair(numero1, numero2));
		}
		else if(operacao == '*') {
			System.out.println(calcular.multiplicar(numero1, numero2));
		}
		else {
			System.out.println(calcular.dividir(numero1, numero2));
		}	
		input.close();
	}
	
}