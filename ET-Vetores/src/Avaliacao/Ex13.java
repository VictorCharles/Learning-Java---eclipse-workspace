package Avaliacao;

import javax.swing.JOptionPane;

public class Ex13 {
	public static void main(String[] args) {
		int[] vetor1 = new int[30];
		int[] vetor2 = new int[vetor1.length];
		String w = "";
		for (int n = 0; n < vetor1.length; n++) {
			vetor1[n] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite um nome para inserir no vetor.", "Vetores", 3));
			if ((vetor1[n] % 2) == 0) {
				vetor2[n] = vetor1[n] * 2;

			} else {
				vetor2[n] = vetor1[n] * 3;
			}
			w += "Vetor1[" + n + "] = " + vetor1[n] + "|| Vetor2[" + n + "] = " + vetor2[n];
		}
		JOptionPane.showMessageDialog(null, w, "Vetores", 1);
	}
}
