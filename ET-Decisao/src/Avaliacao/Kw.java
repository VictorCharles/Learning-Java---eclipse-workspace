package Avaliacao;

import java.util.Scanner;

public class Kw {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String codigoConsumidor;
		double valorKW;
		double qtdKW;
		double contaKW;
		
		System.out.print("Digite o código do consumidor: ");
		codigoConsumidor = scanner.nextLine();
		
		System.out.print("\nDigite o valor do Kw: R$ ");
		valorKW = scanner.nextDouble();
		
		System.out.print("\nQuantidade de Kw consumida: ");
		qtdKW = scanner.nextDouble();
		
		contaKW = valorKW * qtdKW;
		
		System.out.println("----> Extrato da conta <----");
		if (contaKW < 11.20) {
			contaKW = 11.20;
			System.out.println("O consumidor com o codigo " + codigoConsumidor);
			System.out.println("Conta a ser paga é de R$ " + contaKW);
		}
		else {
			System.out.println("O consumidor com o codigo " + codigoConsumidor);
			System.out.println("Conta a ser paga é de R$ " + contaKW);
		}
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}
}
