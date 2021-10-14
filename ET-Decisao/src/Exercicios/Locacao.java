package Exercicios;

import java.util.Scanner;

public class Locacao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int KMIni;
		int KMFin;
		int KMRod;
		int KMCor;
		int KMExtra;
		int qtdDia;
		double valTotal;
		double valExtraTotal;

		System.out.println("-- Aluguel de Carro --");
		System.out.print(">> Digite a KM de Saida: ");
		KMIni = s.nextInt();
		System.out.print(">> Digite a KM de Retorno: ");
		KMFin = s.nextInt();
		System.out.print(">> Digite a quantidade de dias: ");
		qtdDia = s.nextInt();

		System.out.println("\n\n+===========================================+");
		System.out.println("|==>> Locadora de Veiculos - Rent a Car <<==|");
		System.out.println("+===========================================+");

		valTotal = qtdDia * 115;
		KMRod = KMFin - KMIni;
		KMCor = 60 * qtdDia;
		KMExtra = KMRod - KMCor;
		if (KMExtra < 0) {
			KMExtra = 0;
		}
		valExtraTotal = KMExtra * 1.50;

		System.out.println("\n  Dias Locados ..........: " + qtdDia);
		System.out.println("  Valor por dia .........: R$ 115,00");
		System.out.println("  Valor Aluguel parcial .: R$ " + valTotal);
		System.out.println("---------------------------------------------");
		System.out.println("  Km Inicial ............: " + KMIni);
		System.out.println("  Km Final ..............: " + KMFin);
		System.out.println("  Km Rodada .............: " + KMRod);
		System.out.println("---------------------------------------------");
		System.out.println("  Km Cortesia .: 60/dia x " + qtdDia + " dias = " + KMCor + "Km");
		System.out.println("---------------------------------------------");
		System.out.println("  Km Extra ...............: " + KMExtra);
		System.out.println("  Valor por Km extra .....: R$ 1,50");
		System.out.println("  Valor Extra total ......: R$ " + valExtraTotal);
		System.out.println("---------------------------------------------");
		System.out.println("  Valor Aluguel Total ....: R$ " + (valTotal + valExtraTotal));

		s.close();
	}

}
