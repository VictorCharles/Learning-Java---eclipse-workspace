package Exercicios;

import java.util.Scanner;

public class Ex01_Matriz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int somaImp = 0;
		int[] colMatriz = new int[5];
		int[] linMatriz = new int[5];
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Digite um numero inteiro para colocar no linha " + (l + 1) + " e na coluna "
						+ (c + 1) + " da matriz");
				matriz[l][c] = s.nextInt();
				if ((matriz[l][c] % 2) != 0) {
					somaImp += matriz[l][c];
				}
				linMatriz[l] += matriz[l][c];
				colMatriz[l] += matriz[c][l];
			}
		}
		System.out.println("a.	A soma do números impares fornecidos: " + somaImp);

		for (int c = 0; c < colMatriz.length; c++) {
			System.out.println("b.	A soma da  " + (c + 1) + "º coluna: " + colMatriz[c]);
		}
		for (int l = 0; l < colMatriz.length; l++) {
			System.out.println("c.	A soma da  " + (l + 1) + "º linha: " + linMatriz[l]);
		}
		s.close();
	}

}
