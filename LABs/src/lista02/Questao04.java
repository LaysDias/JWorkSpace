package lista02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = scan.next();

		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("Vogal.");
			break;
		default:
			System.out.println("Consoante.");
			break;

		}

	}

}
