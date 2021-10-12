/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

3. Escreva um programa em Java que calcule o fatorial de um número inteiro lido, sabendo-se que:
N !  = 1 x 2 x 3 x ... x N-1 x N
0 !  = 1 
*/
package Avaliacao;

import java.io.*;

public class Ex3 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int n, fat;

		try {
			System.out.println("Digite um numero para calcular o seu fatorial");
			n = Integer.parseInt(dado.readLine());
			System.out.print(n + "! = ");
			for (fat = 1; n > 1; n--) {
				System.out.print(n + " x ");
				fat = fat * n;
			}
			System.out.print("1 = " + fat);
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