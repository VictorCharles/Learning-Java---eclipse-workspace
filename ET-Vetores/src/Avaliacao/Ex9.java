package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex9 {
	public static void main(String[] args) {
		int[] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		int w3 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um n�mero que deseja encontrar", "Vetor Numeros", 3));

		int indice = Arrays.binarySearch(Numeros, w3);

		if (indice < 0) {
			JOptionPane.showMessageDialog(null, "N�mero " + w3 + " n�o encontrado", "Vetor Numeros", 0);
		} else {
			JOptionPane.showMessageDialog(null, "N�mero " + w3 + " Encontrado no �ndice " + indice, "Vetor Numeros", 3);
		}
	}
}
