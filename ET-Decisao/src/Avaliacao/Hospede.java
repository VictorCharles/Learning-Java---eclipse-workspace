package Avaliacao;

import java.util.Scanner;

public class Hospede {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome;
		double tipo;
		double numDiaria;
		double valConInterno;
		double valTotalDiaria;
		double subTotal;
		double taxas;
		double totalGeral;
		
		
		
		System.out.print("O nome do h�spede: ");
		nome = s.nextLine();
		
		System.out.print("O  tipo do apartamento (A=1, B=2, C=3, D=4): ");
		tipo = s.nextDouble();
		
		System.out.print("O n�mero de di�rias: ");
		numDiaria = s.nextDouble();
		
		System.out.print("O consumo interno: R$ ");
		valConInterno = s.nextDouble();
		
		System.out.println("\n\n-------> CONTA FINAL <-------");
		System.out.println("Hospede: " + nome);
		if(tipo == 1){
			System.out.println("Tipo de apartamento: A");
			System.out.println("Foram utilizadas " + numDiaria + " di�rias");
			System.out.println("O valor unit�rio da di�ria � R$: 150.00");
			valTotalDiaria = numDiaria * 150.0;
			System.out.println("O valor total de di�rias � R$: " + valTotalDiaria);
			System.out.println("O valor do consumo interno � R$: " + valConInterno );
			subTotal = valTotalDiaria + valConInterno;
			System.out.println("O subtotal � R$: " + subTotal);
			taxas = (subTotal * 0.10);
			System.out.println("A taxa de servi�o � R$: " + taxas);
			totalGeral = subTotal + taxas;
			System.out.println("O valor total � R$: " + totalGeral);
		}
		if(tipo == 2){
			System.out.println("Tipo de apartamento: A");
			System.out.println("Foram utilizadas " + numDiaria + " di�rias");
			System.out.println("O valor unit�rio da di�ria � R$: 150.00");
			valTotalDiaria = numDiaria * 100.0;
			System.out.println("O valor total de di�rias � R$: " + valTotalDiaria);
			System.out.println("O valor do consumo interno � R$: " + valConInterno );
			subTotal = valTotalDiaria + valConInterno;
			System.out.println("O subtotal � R$: " + subTotal);
			taxas = (subTotal * 0.10);
			System.out.println("A taxa de servi�o � R$: " + taxas);
			totalGeral = subTotal + taxas;
			System.out.println("O valor total � R$: " + totalGeral);
		}
		if(tipo == 3){
			System.out.println("Tipo de apartamento: A");
			System.out.println("Foram utilizadas " + numDiaria + " di�rias");
			System.out.println("O valor unit�rio da di�ria � R$: 150.00");
			valTotalDiaria = numDiaria * 75.0;
			System.out.println("O valor total de di�rias � R$: " + valTotalDiaria);
			System.out.println("O valor do consumo interno � R$: " + valConInterno );
			subTotal = valTotalDiaria + valConInterno;
			System.out.println("O subtotal � R$: " + subTotal);
			taxas = (subTotal * 0.10);
			System.out.println("A taxa de servi�o � R$: " + taxas);
			totalGeral = subTotal + taxas;
			System.out.println("O valor total � R$: " + totalGeral);
		}
		if(tipo == 4){
			System.out.println("Tipo de apartamento: A");
			System.out.println("Foram utilizadas " + numDiaria + " di�rias");
			System.out.println("O valor unit�rio da di�ria � R$: 150.00");
			valTotalDiaria = numDiaria * 50.0;
			System.out.println("O valor total de di�rias � R$: " + valTotalDiaria);
			System.out.println("O valor do consumo interno � R$: " + valConInterno );
			subTotal = valTotalDiaria + valConInterno;
			System.out.println("O subtotal � R$: " + subTotal);
			taxas = (subTotal * 0.10);
			System.out.println("A taxa de servi�o � R$: " + taxas);
			totalGeral = subTotal + taxas;
			System.out.println("O valor total � R$: " + totalGeral);
		}
		s.close();
	}
}
