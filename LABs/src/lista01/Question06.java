package lista01;

import java.util.Scanner;

public class Question06 {
	// Calcular a area de um circulo
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		double raio = teclado.nextDouble();
		double area = Math.PI * raio * raio;
		System.out.println("A area é: " + area);

	}

}
