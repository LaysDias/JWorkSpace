package exercicios;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora: ");
		double valorPorHorasTrabalhadas = teclado.nextDouble();
		System.out.println("Quantas horas voc� trabalhou esse m�s: ");
		int horasTrabalhadasMes = teclado.nextInt(); 
		double salario = valorPorHorasTrabalhadas * horasTrabalhadasMes;
		System.out.println("O salario �: "+salario);

	}

}
