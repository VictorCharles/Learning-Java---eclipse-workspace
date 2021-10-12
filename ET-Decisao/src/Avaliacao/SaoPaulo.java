package Avaliacao;

import java.util.Scanner;

public class SaoPaulo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome;
		Double salario;

		System.out.print("Digite o nome do jogador: ");
		nome = s.nextLine();
		System.out.print("Digite o salário atual desse jogador: R$ ");
		salario = s.nextDouble();
		
		System.out.println("--> Jogador <--");
		System.out.println("Nome do jogador: " + nome);
		System.out.println("Salario atual: R$" + salario);
		
		if (salario > 0 && salario <= 1000) {
			salario *= 1.3;
			System.out.println("Salario reajustado: R$ " + salario);
		}
		if (salario > 1000 && salario <= 5000) {
			salario *= 1.15;
			System.out.println("Salario reajustado: R$ " + salario);
		}
		if (salario > 5000) {
			salario *= 1.075;
			System.out.println("Salario reajustado: R$ " + salario);
		}
		
		s.close();
	}
}
