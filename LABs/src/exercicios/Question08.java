package exercicios;

import java.util.Scanner;

public class Question08 {
	// pedir as horas trabalhadas, valor ganho por horas e dizer o salarios
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora: ");
		double valorPorHorasTrabalhadas = teclado.nextDouble();
		System.out.println("Quantas horas voc� trabalhou esse m�s: ");
		int horasTrabalhadasMes = teclado.nextInt();
		double salario = valorPorHorasTrabalhadas * horasTrabalhadasMes;
		System.out.println("O salario �: " + salario);

	}

}
