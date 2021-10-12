package Avaliacao;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args) {
	// Variaveis
	Scanner scanner = new Scanner(System.in);
	double nota1; 
	double nota2; 
	double nota3;
	
	System.out.print("Qual a nota da primeira prova? R: ");
	nota1 = scanner.nextDouble();
	System.out.print("Qual a nota da segunda prova? R: ");
	nota2 = scanner.nextDouble();
	System.out.print("Qual a nota da terceira prova? R: ");
	nota3 = scanner.nextDouble();

	System.out.println("==> Calcular a media Final <=="); 
	System.out.println("Nota da prova Teórica: " + nota1); 
	System.out.println("Nota da prova Prática: " + nota2);
	System.out.println("Nota da prova Final: " +nota3);

	nota1 = ( (nota1 * 2) / 10 );
	nota2 = ( (nota2 * 3) / 10 );
	nota3 = ( (nota3 * 5) / 10 );
	
	System.out.println("Nota da prova teórica com peso: " + nota1); 
	System.out.println("Nota da prova pratica com peso: " + nota2);
	System.out.println("Nota da prova final com peso: " + nota3);
	double media = nota1+nota2+nota3 ;
	
	if (media >= 5) {
		System.out.println("\n APROVADO com a média: " + media);
	}
	if (media < 5 && media >= 0) {
		System.out.println("\n REPROVADO com a média: " + media);
	}
	
	scanner.close();
	}
}