/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

1)	Dada a matriz a seguir, calcule:
M = 
4    6    9    3
1    8    5    2
2	 4    8    9
3	 9    3    7

a)	Soma da diagonal principal;
b)	Soma da diagonal oposta;
c)	Soma de todos os elementos;
d)	Depois, utilizando a matriz M, peça a entrada de um número inteiro qualquer, depois multiplique por cada elemento da matriz. No final mostre a matriz resultante R.

Depois, utilizando a matriz R, calcule:

e)	Soma de cada elemento de mesma posição com a matriz M, mostrando a matriz resultante A;
f)	Multiplique cada elemento de mesma posição com a matriz M, mostrando a matriz resultante P;
g)	Subtraia a matriz P da matriz A, mostrando a matriz resultante S;



*/
package Avaliacao;

import javax.swing.JOptionPane;

public class Ex1 {
	public static void main(String[] args) {
		int[][] m = { { 4, 6, 9, 3 }, { 1, 8, 5, 2 }, { 2, 4, 8, 9 }, { 3, 9, 3, 7 } };
		// Matriz M declarada e preenchida com valores
		int[][] r = new int[4][4];
		int[][] a = new int[4][4];
		int[][] p = new int[4][4];
		int[][] s = new int[4][4];
		// Outras matrizes
		int somaDP = 0, somaDO = 0, somaAll = 0;
		// Variaveis para o A, B e C
		int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para formar a Matriz R"));
		// Entrada de dado para a Matriz R
		String w = "Matriz M: \n", rW = " \n", aW = " \n", pW = " \n", sW = " \n";
		// Textos em variaveis para formar a respostas

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				somaAll += m[l][c];// Calculo para o passo C) Somar a matriz M
				w += m[l][c] + "   "; // Formação da matriz M
				r[l][c] = entrada * m[l][c]; // Calculo para formar a matriz R
				rW += r[l][c] + "   ";// Texto pra ser adicionado ao W depois, formando a D
				a[l][c] = r[l][c] + m[l][c]; // Calculo para formar a matriz A
				aW += a[l][c] + "   ";// Texto pra ser adicionado ao W depois, formando a E
				p[l][c] = r[l][c] * m[l][c]; // Calculo para formar a matriz P
				pW += p[l][c] + "   ";// Texto pra ser adicionado ao W depois, formando a F
				s[l][c] = p[l][c] - a[l][c]; // Calculo para formar a matriz S
				sW += s[l][c] + "   ";// Texto pra ser adicionado ao W depois, formando a G
			}
			w += "\n";
			rW += "\n";
			aW += "\n";
			pW += "\n";
			sW += "\n";
			somaDP += m[l][l]; // calculo para o passo A) Somar diagonal Principal
			somaDO += m[l][3 - l]; // calculo para o passo B) Somar diagonal oposta
		}

		w += "\nA) Soma da diagonal principal: " + somaDP;
		w += "\n\nB) Soma da diagonal oposta: " + somaDO;
		w += "\n\nC) Soma de todos os elementos da matriz M: " + somaAll;
		w += "\n\nD) Matriz resultante R:" + rW;
		w += "\nE) Matriz Resultante A:" + aW;
		w += "\nF) Matriz Resultante P:" + pW;
		w += "\nF) Matriz Resultante S:" + sW;
		JOptionPane.showMessageDialog(null, w, "Respostas", -1);

	}
}
