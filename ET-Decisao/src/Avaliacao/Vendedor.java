package Avaliacao;

import java.util.Scanner;

public class Vendedor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeDoVendedor;
		double salario;
		double totalVendido;
		
		System.out.print("O vendedor se chama:");
		nomeDoVendedor = scanner.nextLine();
		
		System.out.print("O sal�rio base do vendedor " + nomeDoVendedor + " � de: R$ ");
		salario = scanner.nextDouble();
		
		System.out.print("Ele vendeu: R$ ");
		totalVendido = scanner.nextDouble();
		
		System.out.println(" ==> Comiss�o e salario final");
		
		if (totalVendido > 5000) {
			double comissao = totalVendido * 0.10;
			System.out.print(nomeDoVendedor + "ganhou de comiss�o: R$ " + comissao);
			salario += comissao;
			System.out.println("O salario total do vendedor " + nomeDoVendedor + " � de: R$ " + salario);
		}
		
		if (totalVendido <= 5000 && totalVendido > 3000) {
			double comissao = totalVendido * 0.05;
			System.out.print(nomeDoVendedor + "ganhou de comiss�o: R$ " + comissao);
			salario += comissao;
			System.out.println("O salario total do vendedor " + nomeDoVendedor + " � de: R$ " + salario);
		}
		
		if (totalVendido <= 3000 && totalVendido > 1000) {
			double comissao = totalVendido * 0.02;
			System.out.print(nomeDoVendedor + "ganhou de comiss�o: R$ " + comissao);
			salario += comissao;
			System.out.println("O salario total do vendedor " + nomeDoVendedor + " � de: R$ " + salario);
		}
		
		if (totalVendido < 1000) {
			double comissao = totalVendido * 0;
			System.out.print(nomeDoVendedor + "ganhou de comiss�o: R$ " + comissao);
			salario += comissao;
			System.out.println("Total vendido menor que R$ 1.000,00. N�o h� comiss�o");
			System.out.println("O salario total do vendedor " + nomeDoVendedor + " � de: R$ " + salario);
		}
		
		
		
		
		
		
		
		
		scanner.close();
	}
}
