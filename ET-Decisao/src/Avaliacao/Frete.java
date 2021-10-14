package Avaliacao;

import java.util.Scanner;

public class Frete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double km;
		double km2;
		double frete;

		System.out.println("Quantos quilometros de distancias?");
		km = scanner.nextDouble();

		if ((km % 100) != 0) {
			System.out.println("Não é uma quilometragem valida. Por favor, faça utilizando multiplos de 100!");
		} else {
			if (km <= 200) {
				frete = 500.00;
			} else if (km > 200 && km <= 2000) {
				km -= 200;
				frete = 500.00 + ((km * 150) / 100);

			} else {
				km2 = 2000;
				frete = 500.00 + (((km2 - 200) * 150) / 100);
				km = km - km2;
				frete = frete + (km * 0.5);
			}
			System.out.println("\n-----> VALOR DO FRETE <-----");
			System.out.println("Frete: R$ " + frete);
		}

		scanner.close();
	}
}
