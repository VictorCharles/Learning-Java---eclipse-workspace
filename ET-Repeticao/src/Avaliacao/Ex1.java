/*
Etec de Sapopemba
Victor Charles Alves Vieira 3�C 
Rodrigo Guedes dos Santos 3�C
ETIM - Informatica

1. Escreva um programa em Java que leia um conjunto de n�meros inteiros positivos e determine o maior deles. A leitura do valor 0 (zero) indica o fim dos dados (flag).
*/
package Avaliacao;

import java.io.*;

public class Ex1 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int maior = 0, n;

		try {

			do {
				System.out.println("Digite um numero positivo. Digite 0 para encerrar");
				n = Integer.parseInt(dado.readLine());
				if (n > maior) {
					maior = n;
				}
			} while (n != 0);
			System.out.println("Maior n�mero � " + maior);
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
