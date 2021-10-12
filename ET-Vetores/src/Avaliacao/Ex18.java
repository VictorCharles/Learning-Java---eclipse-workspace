package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex18{
	public static void main(String[] args) {
		String[] vetor1 = new String[50];
		String[] vetor2 = new String[vetor1.length];
		String[] vetor3 = new String[vetor1.length];
		String[] vetor4 = new String[vetor1.length];

		String wE = "", wEI = "", wA = "", wAI = "";
		for (int n = 0; n < vetor1.length; n++) {
			vetor1[n] = JOptionPane.showInputDialog(null, "Digite nomes aleatorios", "Digita nome", 3);
			wE += "vetor1[" + n + "] = " + vetor1[n] + "\n";
			vetor3[n] = vetor1[n];
		}
		for (int n = (vetor1.length - 1); n >= 0; n--) {
			vetor2[n] = vetor1[n];
			wEI += "vetor2[" + n + "] = " + vetor2[n] + "\n";
		}
		Arrays.sort(vetor3);
		for (int n = 0; n < vetor1.length; n++) {
			wA += "vetor3[" + n + "] = " + vetor3[n] + "\n";
		}
		for (int n = (vetor3.length - 1); n >= 0; n--) {
			vetor4[n] = vetor3[n];
			wAI += "vetor4[" + n + "] = " + vetor4[n] + "\n";
		}
		JOptionPane.showMessageDialog(null, wE, "A) Mostrar o Vetor na ordem de entrada", 2);

		JOptionPane.showMessageDialog(null, wEI, "B) Mostrar o Vetor na ordem inversa de entrada", 2);

		JOptionPane.showMessageDialog(null, wA, "C) Mostrar o Vetor em ordem alfabética", 2);

		JOptionPane.showMessageDialog(null, wAI, "D) Mostrar o Vetor na ordem alfabética inversa", 2);

	}

}
