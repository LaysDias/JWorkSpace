package lista02;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Digite o pre�o do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Digite o pre�o do terceiro produto: ");
		double produto3 = scan.nextDouble(); 	
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("Voc� deve comprar o produto um. Seu pre�o �: " + produto1);
		}else if(produto2 < produto1 && produto2 < produto3) {
			System.out.println("Voc� deve comprar o produto um. Seu pre�o �: " + produto2);
		}else if(produto3 < produto1 && produto3 < produto2) {
			System.out.println("Voc� deve comprar o produto um. Seu pre�o �: " + produto3);
		}

	}

}
