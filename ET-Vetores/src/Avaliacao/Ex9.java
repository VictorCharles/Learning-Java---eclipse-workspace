package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex9 {
	public static void main(String[] args) {
		int[] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		int w3 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um número que deseja encontrar", "Vetor Numeros", 3));

		int indice = Arrays.binarySearch(Numeros, w3);

		if (indice < 0) {
			JOptionPane.showMessageDialog(null, "Número " + w3 + " não encontrado", "Vetor Numeros", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Número " + w3 + " Encontrado no índice " + indice, "Vetor Numeros", 3);
		}
	}
}
