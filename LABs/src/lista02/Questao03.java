package lista02;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu sexo (F-M): ");
		String sexo = scan.next();

		switch (sexo) {
		case "f":
			System.out.println("Feminino.");
			break;
		case "m":
			System.out.println("Masculino.");
			break;
		default:
			System.out.println("Sexo inválido!");
			break;
		}
	}

}
