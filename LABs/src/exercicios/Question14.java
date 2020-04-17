package exercicios;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo: ");
		double tamanhoArquivo = teclado.nextDouble();
		System.out.println("Digite a velocidade da internet: ");
		double velocidadeInternet = teclado.nextDouble();
		double tempo = tamanhoArquivo / velocidadeInternet;
		System.out.println("O tempo da velocidade do download é: " + tempo);

	}

}
