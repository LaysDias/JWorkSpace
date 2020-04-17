package exercicios;

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
		System.out.println(soma);
	}

}
