package lista01;

import java.util.Scanner;

//Converter Fahrenheit em Celsius
public class Question09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double tempFahrenheit = teclado.nextDouble();
		double celsius = (tempFahrenheit - 32) / 1.8;
		System.out.println("A temperatura convertida para Celsius �: " + celsius + "C");
	}

}
