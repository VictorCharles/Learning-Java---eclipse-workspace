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
	System.out.println("Nota da prova Te�rica: " + nota1); 
	System.out.println("Nota da prova Pr�tica: " + nota2);
	System.out.println("Nota da prova Final: " +nota3);

	nota1 = ( (nota1 * 2) / 10 );
	nota2 = ( (nota2 * 3) / 10 );
	nota3 = ( (nota3 * 5) / 10 );
	
	System.out.println("Nota da prova te�rica com peso: " + nota1); 
	System.out.println("Nota da prova pratica com peso: " + nota2);
	System.out.println("Nota da prova final com peso: " + nota3);
	double media = nota1+nota2+nota3 ;
	
	if (media >= 5) {
		System.out.println("\n APROVADO com a m�dia: " + media);
	}
	if (media < 5 && media >= 0) {
		System.out.println("\n REPROVADO com a m�dia: " + media);
	}
	
	scanner.close();
	}
}