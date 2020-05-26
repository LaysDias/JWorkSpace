package lista02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("O numero digitado é negativo.");
		} else {
			System.out.println("O numero digitado é positivo.");
		}

	}

}
