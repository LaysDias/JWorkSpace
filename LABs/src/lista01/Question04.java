package lista01;

import java.util.Scanner;

public class Question04 {
	// pedir 4 notas, somar e imprimi a media
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int nota1 = teclado.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = teclado.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = teclado.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = teclado.nextInt();
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Notas digitadas: \n" + nota1 + "\n" + nota2 + "\n" + nota3 + "\n" + nota4);
		System.out.println("A sua media é: " + media);

	}

}
