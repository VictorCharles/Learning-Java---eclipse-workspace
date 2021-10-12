package Exercicios;

import java.io.*;

//Escreva uma classe que peça digitar um conjunto de 100 números inteiros positivos e no final mostre o maior deles.
public class Ex1 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int maior = 0, n;

		try {

			for (int x = 1; x <= 10; x++) {
				System.out.println("Digite um numero");
				n = Integer.parseInt(dado.readLine());
				if (n > maior) {
					maior = n;
				}
			}
			System.out.println("Maior número é " + maior);
			dado.close();

		} catch (IOException erro) {
			// Indica erro de entrada de dados
			System.out.println("Houve erro na entrada de dados");

		} catch (NumberFormatException erro) {
			// Erro de formato de numero, tipo por string numa variável int
			System.out.println("Digite apenas caracteres numéricos");
		}

	}

}
