package lista1;
import java.util.Scanner;


public class Comparador {

	 private int numero1;
	 private int numero2;
	 private int numero3;
		
	
	public int getNumero1() {
		return numero1;
	}


	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}


	public int getNumero2() {
		return numero2;
	}


	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}


	public int getNumero3() {
		return numero3;
	}


	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}



	public int getMaior() {
		if ((numero1 >= numero2) && (numero1 >= numero3)) {
			return numero1;
		}
		else if((numero2 >= numero1) && (numero2 >= numero3)) {
			return numero2;
		}
		else {
			return numero3;
		}
	}




	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Comparador numeros = new Comparador();
		
		int num1, num2, num3;
		
		System.out.println("Digite 3 números separados por espaço");
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		
		numeros.setNumero1(num1);
		numeros.setNumero2(num2);
		numeros.setNumero3(num3);
		
		System.out.println(numeros.getMaior());
		
		input.close();
	}

}