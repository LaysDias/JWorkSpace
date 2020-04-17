package exercicios;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
//Converter celsius em Fahrenheit
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double tempCelsius = teclado.nextDouble();
		double Fahrenheit = (tempCelsius * 1.8) + 32;
		System.out.println(Fahrenheit);

	}

}
