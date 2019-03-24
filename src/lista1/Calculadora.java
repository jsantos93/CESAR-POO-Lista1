/*1- Implemente uma classe chamada Calculadora, essa classe deve conter 4
métodos somar, subtrair, multiplicar e dividir.
Cada um desses métodos deve receber dois números reais como parâmetros e
retornar o resultado da operação indicada pelo seu nome.
A subtração e a divisão deve ser feita assim: primeiro parâmetro - segundo e
primeiro/segundo.
No seu método main, os dois números e a operação a ser executada devem ser
inseridas através do teclado.
Para definir a operação no input utilize o char + para soma, o - para subtração, o *
para multiplicação e o / para divisão.*/


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
		System.out.println("Para somar [+]"); //43
		System.out.println("Para subtrair [-]");// 45
		System.out.println("Para multiplicar [*]");// 42
		System.out.println("Para dividir [/]"); //47
		
		operacao = input.next().charAt(0);
		
		System.out.println("Digite os dois números separados por espaço");
		
		numero1 = input.nextFloat();
		numero2 = input.nextFloat();
		
		
		
		
		if (operacao == 43){
			System.out.println(calcular.somar(numero1, numero2));
		}
		else if (operacao == 45) {
			System.out.println(calcular.subtrair(numero1, numero2));
		}
		else if(operacao == 42) {
			System.out.println(calcular.multiplicar(numero1, numero2));
		}
		else {
			System.out.println(calcular.dividir(numero1, numero2));
		}
		
		
		input.close();
	}
	
}