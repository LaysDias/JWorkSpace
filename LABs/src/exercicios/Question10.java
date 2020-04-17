package exercicios;

import java.util.Scanner;

public class Question10 {
	/* Converter celsius em Fahrenheit */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double tempCelsius = teclado.nextDouble();
		double Fahrenheit = (tempCelsius * 1.8) + 32;
		System.out.println(Fahrenheit);

	}

}
