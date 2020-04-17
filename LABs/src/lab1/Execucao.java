package lab1;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeComp = teclado.nextLine();
		System.out.println("Olá: " + nomeComp);
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = teclado.next();
		System.out.println("Primeiro nome é: " + nome);
		
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Digite seu nome, idade, altura, peso e se tem filhos: ");
		String nome = teclado.next();
		int idade = teclado.nextInt();
		float altura = teclado.nextFloat();
		double peso = teclado.nextDouble();
		boolean filhos = teclado.nextBoolean();
		
		System.out.println("Você digitou os seguintes dados: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso + "Kg");
		System.out.println("Tem filhos? " + filhos);
		
	
		
	}
}
