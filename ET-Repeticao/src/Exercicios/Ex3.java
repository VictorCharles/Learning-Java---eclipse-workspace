package Exercicios;

import java.io.*;

public class Ex3 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int nPos = 0, nNeg = 0, nulo = 0, t = 0;
		float n = 0, soma = 0;

		try {
			System.out.println("Quantos num�ros voc� quer escrever? ");
			t = Integer.parseInt(dado.readLine());
			for (int x = 0; x <= t; x++) {
				System.out.println("\nDigite um numero: ");
				n = Float.parseFloat(dado.readLine());
				if (n > 0) {
					nPos++;
				}
				if (n < 0) {
					nNeg++;
				}
				if (n == 0) {
					nulo++;
				}
				soma += n;
			}
			System.out.println("\n\n\n==> Teve " + nPos + " n�meros positivos");
			System.out.println("==> Teve " + nNeg + " n�meros negativos");
			System.out.println("==> Teve " + nulo + " n�meros nulos");
			System.out.println("==> A soma dos num�ros �: " + soma);
			dado.close();

		} catch (IOException erro) {
			// Indica erro de entrada de dados
			System.out.println("Houve erro na entrada de dados");

		} catch (NumberFormatException erro) {
			// Erro de formato de numero, tipo por string numa vari�vel int
			System.out.println("Digite apenas caracteres num�ricos");
		}
	}
}
