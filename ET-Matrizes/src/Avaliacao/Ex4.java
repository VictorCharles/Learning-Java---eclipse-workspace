/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

4	O tempo que um determinado avião leva para percorrer um determinado trecho entre duas localidades distintas está disponível através da seguinte tabela:
	1	2	3	4	5	6	7
1	{{0,	02,	11,	06,	15,	11,	01},
2	{02,	0,	07,	12,	04,	02,	15},
3	{11,	07,	0,	11,	08,	03,	13},
4	{06,	12,	11,	0,	10,	02,	01},
5	{15,	04,	08,	10,	0,	05,	13},
6	{11,	02,	03,	02,	05,	0,	14},
7	{01,	15,	13,	01,	13,	14,	0}}

a)	Construa um programa que permita inserir os dados da tabela anterior em uma Matriz;
b)	Construa um programa que informe ao usuário o tempo necessário para percorrer duas cidades por ele fornecidas, até o momento em que ele fornecer duas cidades iguais (origem e destino);
c)	Desenvolva um programa que permita ao usuário informar várias cidades, até inserir uma cidade “0”, e que mostre o tempo total para cumprir o percurso especificado entre as cidades fornecidas;
d)	Escreva um programa que auxilie um usuário a escolher um roteiro de férias, sendo que o usuário fornece duas cidades: a primeira é sua origem, a segunda é seu destino obrigatório. O programa deve inserir outras duas cidades, que caracterizam as cidades alternativas de descanso (no meio da viagem). Por isso, o programa deve fornecer ao usuário duas opções, ou seja, qual fará com que a duração das duas viagens (origem para descanso, descanso para destino) seja a menor possível;

 */
package Avaliacao;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		int[][] tempo = { { 0, 02, 11, 06, 15, 11, 01 }, { 02, 0, 07, 12, 04, 02, 15 }, { 11, 07, 0, 11, 8, 03, 13 },
				{ 06, 12, 11, 0, 10, 02, 01 }, { 15, 04, 8, 10, 0, 05, 13 }, { 11, 02, 03, 02, 05, 0, 14 },
				{ 01, 15, 13, 01, 13, 14, 0 } };
		int orig;
		int dest;
		int tempoC = 0;
		boolean veri = true;
		int[] roteiro = new int[4];
		String w = "TABELA DE TEMPO: \n";
		// A) Construa um programa que permita inserir os dados da tabela
		// anterior em
		// uma Matriz; A inserção já foi feita previamente
		for (int l = 0; l < 7; l++) {
			for (int c = 0; c < 7; c++) {
				if (l != c) {
					if (tempo[c][l] == 0) {
						tempo[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Digite o tempo para percorrer do ponto " + (l + 1) + " até o ponto " + (c + 1),
								"Dados da tabela", -1));

						tempo[c][l] = tempo[l][c];
					}
					w += tempo[l][c] + "   ";
				} else
					w += "X   ";
			}
			w += "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Tabela com dados", -1);
		// B) Construa um programa que informe ao usuário o tempo necessário
		// para
		// percorrer duas cidades por ele fornecidas, até o momento em que ele
		// fornecer
		// duas cidades iguais (origem e destino);
		while (veri) {
			orig = 0;
			dest = 0;
			orig = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a cidade de origem (De 1 a 7)",
					"Cidade de origem", -1)) - 1;
			dest = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a cidade de destino (De 1 a 7)",
					"Cidade de destino", -1)) - 1;
			if (orig == dest) {
				veri = false;
				JOptionPane.showMessageDialog(null, "Destino e origem igual!! \n\nESSE PROGRAMA IRA ENCERRAR AGORA!!",
						"ERRO", 0);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "A distancia de " + (orig + 1) + " até " + (dest + 1) + " é de "
						+ tempo[orig][dest] + " tempos", "Distancia de pontos", -1);
			}
		}
		// C) Desenvolva um programa que permita ao usuário informar várias
		// cidades, até
		// inserir uma cidade “0”, e que mostre o tempo total para cumprir o
		// percurso
		// especificado entre as cidades fornecidas;
		veri = true;
		orig = 0;
		dest = 0;
		w = "";
		orig = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite qual a cidade de origem (De 1 a 7)", "Cidade de origem", -1))
				- 1;
		dest = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite qual a cidade de destino (De 1 a 7) a partir da cidade " + (orig + 1), "Cidade de destino", -1))
				- 1;
		while (veri) {
			if (dest == -1) {
				veri = false;
				JOptionPane.showMessageDialog(null,
						"A distancia de todo percurso é de " + tempoC + " tempos\n Descrição do trajeto: " + w,
						"Distancia do percurso", -1);
				break;
			} else {
				tempoC += tempo[orig][dest];
				w += "\nDo ponto " + (orig + 1) + " ao ponto " + (dest + 1) + " levou " + tempo[orig][dest] + " tempos";
				orig = dest;
				dest = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite qual a cidade de destino (De 1 a 7) a partir da cidade " + (dest + 1),
						"Cidade de destino", -1)) - 1;
			}
		}
		// D) Escreva um programa que auxilie um usuário a escolher um roteiro
		// de
		// férias, sendo que o usuário fornece duas cidades: a primeira é sua
		// origem, a
		// segunda é seu destino obrigatório. O programa deve inserir outras
		// duas
		// cidades, que caracterizam as cidades alternativas de descanso (no
		// meio da
		// viagem). Por isso, o programa deve fornecer ao usuário duas opções,
		// ou seja,
		// qual fará com que a duração das duas viagens (origem para descanso,
		// descanso
		// para destino) seja a menor possível;
		orig = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite qual a cidade de origem (De 1 a 7)", "Roteiro de viagem", -1))
				- 1;
		dest = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a cidade de destino (De 1 a 7)",
				"Roteiro de viagem", -1)) - 1;

		tempoC = 0;
		w = "";
		roteiro[0] = orig;
		roteiro[3] = dest;

		int analisa = 100, meio1 = 0, meio2 = 0;
		for (int l = 0; l < 7; l++) {
			if (tempo[dest][l] < analisa && (tempo[dest][l]) > 0 && roteiro[0] != l) {
				analisa = tempo[dest][l];
				meio1 = l;
			}
		}

		analisa = 100;
		roteiro[1] = meio1;
		for (int l = 0; l < 7; l++) {
			if (tempo[meio1][l] < analisa && (tempo[meio1][l]) > 0 && roteiro[3] != l && roteiro[0] != l
					&& roteiro[1] != l) {
				analisa = tempo[meio1][l];
				meio2 = l;
			}

		}

		roteiro[2] = meio2;

		for (int i = 0; i < roteiro.length; i++) {
			if (i < (roteiro.length - 1))
				w += "Da cidade " + (roteiro[i] + 1) + " até a cidade " + (roteiro[i + 1] + 1) + " levou "
						+ tempo[roteiro[i]][roteiro[i + 1]] + " tempos\n";
			else
				w += "\nVocê chegou ao destino, levando um total de " + (tempo[roteiro[0]][roteiro[1]]
						+ tempo[roteiro[1]][roteiro[2]] + tempo[roteiro[2]][roteiro[3]]) + " tempos";
		}
		JOptionPane.showMessageDialog(null, w, "Roteiro de viagem", -1);

	}
}
