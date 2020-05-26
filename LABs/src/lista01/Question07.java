package lista01;

import java.util.Scanner;

public class Question07 {
	// Calcular a area de um quadrado
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base em centimetros: ");
		double base = teclado.nextDouble();
		System.out.println("Digite a altura em centimetros: ");
		double altura = teclado.nextDouble();
		double area = base * altura;
		System.out.println("A area do quadrado é: " + area + "cm");
		System.out.println("O dobro da area é: " + (2 * area));

	}

}
