package Avaliacao;

import java.util.Scanner;

public class SalarioOperario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horas;
		int horasExcesso = 0;
		double salario;
		double salarioExcesso;
		double impostos = 0;

		System.out.println("Quantas horas foram trabalhadas?");
		horas = scanner.nextInt();

		if (horas > 50) {
			horasExcesso = horas - 50;
			horas -= horasExcesso;
		}

		salario = horas * 15.0;
		salarioExcesso = horasExcesso * 20.0;

		if (salarioExcesso > 800) {
			salario = salario + salarioExcesso;
			impostos = salario * 0.08;
			salario -= impostos;
		}

		System.out.println("==> Salário <==");
		System.out.println("Excesso de pagamento: R$ " + salarioExcesso);
		System.out.println("Impostos recolhidos: R$ " + impostos);
		System.out.println("Salario final: R$ " + salario);

		scanner.close();
	}
}
