/* 
 * 1) Faça um código em Java que leia um vetor g(13), que é o gabarito de um teste de loteria
 * Esportiva, contendo os valores 1(coluna 1), 2(coluna 2), 3(coluna do meio). Depois, 
 * preencher uma matriz R(100,14), que é a resposta do apostador, pedindo também o 
 * numero de seu cartão. Verificar, para cada apostador o número de acertos e mostrar o 
 * número do apostador e seu numero de acertos. Se o apostador tiver 13 acertos, mostrar a 
 * mensagem “PARABÉNS! Você ganhou.”
 */

package Avaliacao;

import javax.swing.JOptionPane;

public class AvaliacaoExtra1 {

	public static void main(String[] args) {

		int[] g = new int[13];
		int[][] r = new int[100][14];
		String w1 = "RESULTADOS", w = "Gabarito de teste\n                   1      E      2";

		for (int i = 0; i < g.length; i++) {
			g[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
					w + "\nDigite o resultado do " + (i + 1) + "º jogo", "GABARITO", -1));
			if (g[i] == 1) {
				w += "\n JOGO " + (i + 1) + "	  " + " X  |         |    ";
			}
			if (g[i] == 2) {
				w += "\n JOGO " + (i + 1) + "	  " + "      |         |  X ";
			}
			if (g[i] == 3) {
				w += "\n JOGO " + (i + 1) + "	  " + "      |   X   |   ";
			}
		}
		for (int l = 0; l < r.length; l++) {
			int contadorPontos = 0;
			for (int c = 0; c < (g.length + 1); c++) {

				if (c == 0) {
					r[l][c] = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da cartela", "Cartelas", -1));
					for (int p = 0; p < l; p++) {
						if (r[l][c] == r[p][c]) {
							JOptionPane.showMessageDialog(null, "CARTELA REPITIDA", "ERRO", 4);
							c--;
							break;
						}
					}
				} else {
					r[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Digite o que foi marcado no " + (c + 1) + "º jogo", "Cartelas", -1));
					if (r[l][c] != 1 || r[l][c] != 2 || r[l][c] != 3) {
						JOptionPane.showMessageDialog(null, "RESULTADO INVALIDO", "ERRO", 4);
						c--;
						break;
					} else {
						if (r[l][c] == g[c - 1]) {
							contadorPontos++;
						}
					}
				}
			}
			if (contadorPontos == 13) {
				w += r[l][0] + " - PARABENS! Você ganhou.\n";
			}
			else{
				w += r[l][0] + " - Você fez " +contadorPontos+ " pontos.\n";
			}
		}
	}
}
