package Avaliacao;

import javax.swing.JOptionPane;

public class Ex19 {
	public static void main(String[] args) {
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[vetor1.length];
		int r1 = 0, r2 = 0;
		for (int n = 0; n < 5; n++) {
			vetor1[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (n + 1) + "º numero do vetor1"));
		}
		for (int n = 0; n < 5; n++) {
			vetor2[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (n + 1) + "º numero do vetor1"));
		}
		for (int n = 0; n < 5; n++) {
			if (vetor1[n] > vetor2[n]) {
				for (int n2 = 2; n2 < vetor1[n]; n2++) {
					r1 = vetor1[n] % n2;
					r2 = vetor2[n] % n2;
					if (r1 == 0 && r2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Os numeros " + vetor1[n] + " e " + vetor2[n] + " não são primos entre si");
						break;
					}
					if (n2 == (vetor1[n] - 1)) {
						JOptionPane.showMessageDialog(null,
								"Os numeros " + vetor1[n] + " e " + vetor2[n] + " são primos entre si");
					}
				}
			}
			if (vetor2[n] > vetor1[n]) {
				for (int n2 = 2; n2 < vetor2[n]; n2++) {
					r1 = vetor1[n] % n2;
					r2 = vetor2[n] % n2;
					if (r1 == 0 && r2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Os numeros " + vetor1[n] + " e " + vetor2[n] + " não são primos entre si");
						break;
					}
					if (n2 == (vetor2[n] - 1)) {
						JOptionPane.showMessageDialog(null,
								"Os numeros " + vetor1[n] + " e " + vetor2[n] + " são primos entre si");
					}
				}
			}
		}
	}
}
