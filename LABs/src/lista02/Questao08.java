package lista02;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro produto: ");
		double produto3 = scan.nextDouble(); 	
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("Você deve comprar o produto um. Seu preço é: " + produto1);
		}else if(produto2 < produto1 && produto2 < produto3) {
			System.out.println("Você deve comprar o produto um. Seu preço é: " + produto2);
		}else if(produto3 < produto1 && produto3 < produto2) {
			System.out.println("Você deve comprar o produto um. Seu preço é: " + produto3);
		}

	}

}
