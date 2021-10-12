/*
Etec de Sapopemba
Victor Charles Alves Vieira 3�C 
Rodrigo Guedes dos Santos 3�C
ETIM - Informatica

4. Fa�a um programa em Java que leia um n�mero N, calcule e mostre os N primeiros termos da seq��ncia de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13, ...). O valor lido para N sempre ser� maior ou igual a 2.
*/package Avaliacao;

import java.io.*;

public class Ex4 {

	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int val = 0, val2 = 1, aux = 0, contr, termos;

		try {
			System.out.println("Indique quantos termos deve ser mostrado da escala de fibonacci");
			termos = Integer.parseInt(dado.readLine());
			System.out.print("Sequencia de Fibonacci: 0 1 ");
			for (contr = 3; contr < termos+1; contr++) {
				if (contr > 2) {
					aux = val + val2;
					val = val2;
					val2 = aux;
					System.out.print(aux + " ");
				}
			}

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
