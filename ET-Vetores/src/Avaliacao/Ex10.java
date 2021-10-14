package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String[] args) {
		String[] Nomes = new String[50];
		for (int n = 0; n < Nomes.length; n++) {
			Nomes[n] = JOptionPane.showInputDialog(null, "Digite um nome para inserir no vetor.", "Lista de nomes", 3);
		}

		String w3 = JOptionPane.showInputDialog(null, "Digite o nome de Pessoa que deseja encontrar", "Lista de nomes",
				3);

		int indice = Arrays.binarySearch(Nomes, w3);

		if (indice < 0) {
			JOptionPane.showMessageDialog(null, w3 + " Não foi encontrado", "Lista de Nomes", 0);
		} else {
			JOptionPane.showMessageDialog(null, "\n" + w3 + " Encontrado no índice " + indice, "Lista de Nomes", 3);
		}
	}
}
