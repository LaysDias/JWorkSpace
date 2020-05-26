package lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();

		if (numero1 > numero2) {
			System.out.println("Maior: "+numero1);
		} else if (numero2 > numero1) {
			System.out.println("Maior: "+numero2);
		}
	}
}
