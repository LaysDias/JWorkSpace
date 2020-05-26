package lista01;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero1 =teclado.nextInt();
		System.out.println("digite o segundo numero inteiro: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o numero real: ");
		double numeroReal = teclado.nextDouble();
		double soma = numero1+numero2+numeroReal;
		
		int resultado1 = (numero1 * 2) * (numero2 / 2);
		double resultado2 = (numero1 * 3 ) + numeroReal;
		double resultado3 = Math.pow(numeroReal, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		
	}

}
