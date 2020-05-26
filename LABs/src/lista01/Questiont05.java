package lista01;

import java.util.Scanner;

public class Questiont05 {

	public static void main(String[] args) {
		// Converter metros para cm
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor em metros: ");
		double metro = teclado.nextDouble();
		double convert = metro * 100;
		System.out.println("O valor em centimetros é: " + convert);

	}

}
