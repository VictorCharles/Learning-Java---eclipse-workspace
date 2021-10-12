package Avaliacao;

import java.util.Scanner;

public class Professor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aulasDadasMes;
		int faltas;
		int nivel;
		double salarioBruto = 0;
		double salarioDado;
		double descontado = 0;
		double imposto = 0;

		System.out.println("Quantas aulas foram dadas no mês?");
		aulasDadasMes = scanner.nextInt();

		System.out.println("Quantas faltas o professor teve?");
		faltas = scanner.nextInt();

		System.out.println("Qual o nivel do professor? (Sendo 1 = A, 2 = B, 3 = C, 4 = D");
		nivel = scanner.nextInt();

		if (nivel == 1) {
			salarioBruto = (faltas + aulasDadasMes) * 11.25;
			descontado = faltas * 11.25;
		} else if (nivel == 2) {
			salarioBruto = (faltas + aulasDadasMes) * 16.73;
			descontado = faltas * 16.73;
		} else if (nivel == 3) {
			salarioBruto = (faltas + aulasDadasMes) * 23.49;
			descontado = faltas * 23.49;
		} else if (nivel == 4) {
			salarioBruto = (faltas + aulasDadasMes) * 30.19;
			descontado = faltas * 30.19;
		}

		if (salarioBruto < 1000) {
			imposto = salarioBruto * 0;
		} else if (salarioBruto >= 1000 && salarioBruto < 4750) {
			imposto = salarioBruto * 0.08;
		} else if (salarioBruto >= 4750 && salarioBruto < 11843.66) {
			imposto = salarioBruto * 0.145;
		} else if (salarioBruto < 11843.66) {
			imposto = salarioBruto * 0.25;
		}
		
		
		System.out.println("\n-------> SALÁRIO <-------");
		System.out.println("Salário bruto: R$ " + salarioBruto);
		System.out.println("Valor de desconto por falta: R$ " + descontado);
		System.out.println("Valor descontado de imposto de renda: R$ " + imposto);
		salarioDado = salarioBruto - descontado - imposto;
		System.out.println("Salário liquido: R$ " + salarioDado);
		
		
		
		
		
		scanner.close();
	}
}
