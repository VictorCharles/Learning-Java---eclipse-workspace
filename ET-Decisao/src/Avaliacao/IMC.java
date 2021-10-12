package Avaliacao;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double peso;
		double altura;
		
		System.out.println("Qual o peso em kilograma?");
		peso = scanner.nextDouble();
		
		System.out.println("Qual a altura em cm?");
		altura = scanner.nextDouble();
		
		double massa = peso / (altura * altura);
		
		System.out.println("---> IMC <---");
		
		if (massa < 26) {
			System.out.println("O seu grau de obesidade é:");
			System.out.println("  NORMAL  ");
		}
		if (massa >= 26 && massa < 30) {
			System.out.println("O seu grau de obesidade é:");
			System.out.println("  OBESO  ");
		}
		if (massa >= 26) {
			System.out.println("O seu grau de obesidade é:");
			System.out.println("  OBESO MÓRBIDO  ");
		}
		
		
		
		scanner.close();
	}
}
