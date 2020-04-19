package exercicios;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora: ");
		double valorPorHorasTrabalhadas = teclado.nextDouble();
		System.out.println("Quantas horas você trabalhou esse mês: ");
		int horasTrabalhadasMes = teclado.nextInt();
		double salarioBruto = valorPorHorasTrabalhadas * horasTrabalhadasMes;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario liquido: " + salarioLiquido);
		
	} 
}
