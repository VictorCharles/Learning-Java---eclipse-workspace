package Avaliacao;

import java.util.Scanner;

public class SalarioFuncionario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horas;
		int horasExcesso = 0;
		double salario;
		double salarioExcesso;
		double impostos = 0;

		System.out.println("Quantas horas foram trabalhadas?");
		horas = scanner.nextInt();

		if (horas > 40 ) {
			horasExcesso = horas - 50;
			horas -= horasExcesso;
		}

		salario = horas * 25.0;
		salarioExcesso = horasExcesso * (25.0 * 1.5);

		if ((salarioExcesso + salario) > 1000) {
			salario = salario + salarioExcesso;
			impostos = salario * 0.12;
			salario -= impostos;
		}

		System.out.println("\n=========> SALÁRIO <=========");
		System.out.println("Excesso de pagamento: R$ " + salarioExcesso);
		System.out.println("Impostos recolhidos: R$ " + impostos);
		System.out.println("Salario liquido: R$ " + salario);

		scanner.close();
	}
}
