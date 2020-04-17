package exercicios;

import java.util.Scanner;

public class Questiont03 {
	// Pedir dois numeros e imprimi a soma entre eles
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = teclado.nextInt();
		double soma = numero1 + numero2;
		System.out.println("A soma dos dois numeros é: " + soma);
	}

}
