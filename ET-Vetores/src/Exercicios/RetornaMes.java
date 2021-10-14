package Exercicios;

import javax.swing.JOptionPane;

public class RetornaMes {
	public static void main(String[] args) {
		String tex = "";
		String[] vetor = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		int v = 1;

		do {
			tex = JOptionPane.showInputDialog(null, "Digite um n�mero de 1 a 12 pra saber o m�s", "M�s", 3);

			if (tex == null || tex.isEmpty() || Integer.parseInt(tex) <= 0 || Integer.parseInt(tex) > 12) {
				break;
			}

			v = Integer.parseInt(tex);
			JOptionPane.showMessageDialog(null, "O m�s digitado � o m�s de: " + vetor[v - 1], "M�s", 1);

		} while (v > 0 && v <= 12);
	}
}
