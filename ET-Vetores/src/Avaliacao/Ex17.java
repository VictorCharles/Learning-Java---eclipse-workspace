package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex17 {
	public static void main(String[] args) {
		int vetor1[] = new int[20];
		int vetor2[] = new int[vetor1.length];
		int inter[] = new int[vetor1.length];
		String w = "";
		int n = 0, i;
		for (n = 0; n < vetor1.length; n++) {
			vetor1[n] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Entre com o valor da " + (n + 1) + "º posição do vetor 1", "Intersecção", -1));
			for (i = 0; i < n; i++) {
				if (vetor1[n] == vetor1[i]) {
					JOptionPane.showMessageDialog(null, "Valor existente, informe outro valor", "Intersecção", -1);
					n--;
				}
			}
		}
		for (n = 0; n < vetor1.length; n++) {
			vetor2[n] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Entre com o valor da " + (n + 1) + "º posição do vetor 2", "Intersecção", -1));
			for (i = 0; i < n; i++) {
				if (vetor2[n] == vetor2[i]) {
					JOptionPane.showMessageDialog(null, "Valor existente, informe outro valor", "Intersecção", -1);
					n--;
				}
			}
		}

		for (n = 0; n < vetor1.length; n++) {
			inter[n] = -1;
		}
		for (n = 0; n < vetor1.length; n++) {
			inter[n] = Arrays.binarySearch(vetor2, vetor1[n]);
			if (inter[n] >= 0) {
				w += vetor2[inter[n]] + " - Indice " + (n) + " do vetor 1 e índice " + (inter[n]) + " do vetor 2";
			}
		}
		JOptionPane.showMessageDialog(null, "Intersecções entre os vetores: \n" + w, "Intersecção", -1);
	}
}
