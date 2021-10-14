/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

9. Faça um programa em Java que leia vários códigos do jogador (1 ou 2) que ganhou o ponto em uma partida de pingue-pongue, e responda quem ganha a partida.
A partida chega ao final se um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores é maior ou igual a dois. Caso contrário, ganha aquele que, com mais de 21 pontos, consiga colocar uma vantagem de dois pontos sobre o adversário.
*/
package Avaliacao;

import java.io.*;

public class Ex9 {

	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int ganhador = 0, p1 = 0, p2 = 0;
		try {
			do {
				System.out.println("Quem fez o ponto, o Jogador1 ou o Jogador2? 1 para o Jogador1 e 2 para o Jogador2");
				int jogador = Integer.parseInt(dado.readLine());
				if (jogador == 1) {
					p1++;
				}
				if (jogador == 2) {
					p1++;
				}
				if (p1 >= 21 && (p1 - p2) >= 2) {
					ganhador = 1;
				}
				if (p2 >= 21 && (p2 - p1) >= 2) {
					ganhador = 2;
				}
			} while (ganhador == 0);
			System.out.println("+-------PLACAR--------+");
			System.out.println("|Jogador1  X  Jogador2|");
			System.out.println("| " + p1 + "       |       " + p2 + " |");
			System.out.println("+---------------------+");
			if (ganhador == 1) {
				System.out.println("O Jogador1 ganhou a partida");
			}
			if (ganhador == 2) {
				System.out.println("O Jogador2 ganhou a partida");
			}

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
