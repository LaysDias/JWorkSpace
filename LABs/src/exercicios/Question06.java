package exercicios;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// Calcular a area de um circulo
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		double raio = teclado.nextDouble();
		double area = Math.PI * raio * raio;
		System.out.println("A area é: " + area);
		
		
		

	}

}
