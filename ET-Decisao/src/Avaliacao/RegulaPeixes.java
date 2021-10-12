package Avaliacao;

import java.util.Scanner;

public class RegulaPeixes {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double P;
		double M = 4.00;
		double E;

		System.out.println("Quantos quilos foi pescado? ");
		P = s.nextInt();

		System.out.println("==> Controle de rendimento <==");
		System.out.println("Quantidade pescada : " + P + "kg");
		if (P > 50) {
			E = P - 50;
			M *= E;
			System.out.println("Quantidade de excesso: " + E + "kg");
			System.out.println("Multa a ser paga: R$ " + M);
		} else {
			E = 0;
			M = 0;
			System.out.println("Quantidade de excesso: " + E + "kg");
			System.out.println("Multa a ser paga: R$ " + M);

		}

		s.close();
	}
}
