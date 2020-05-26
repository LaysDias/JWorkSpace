package lista02;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int numero3 = scan.nextInt();

		System.out.println("Numeros digitados: " + numero1 + ", " + numero2 + ", " + numero3);

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior é: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior é: " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior é: " + numero3);

		}
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O menor é: " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O menor é: " + numero2);
		} else if (numero3 < numero1 && numero3 < numero2) {
			System.out.println("O menor é: " + numero3);
		}

	}

}
