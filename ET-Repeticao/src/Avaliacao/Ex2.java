/*
Etec de Sapopemba
Victor Charles Alves Vieira 3�C 
Rodrigo Guedes dos Santos 3�C
ETIM - Informatica

2. Sendo H = 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n, fa�a um programa em Java para calcular H. O n�mero N � lido.
*/
package Avaliacao;

import java.io.*;

public class Ex2 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int N = 1;
		float H = 1;
		try {
			System.out.println("Digite o n�mero N para calcular o H: ");
			N = Integer.parseInt(dado.readLine());
			for (float x = 2; N >= x; x++) {
				H += (1 / x);
			}

			System.out.println("H = " + H);
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
