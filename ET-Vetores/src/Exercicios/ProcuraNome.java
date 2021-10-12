package Exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ProcuraNome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		String w3 = "";

		String[] nomes = new String[n];

		for (int x = 0; x < n; x++) {
			nomes[x] = JOptionPane.showInputDialog(null, "Digite o nome de " + (x + 1) + "º Pessoa", "Lista nomes", 3);
		}

		boolean ver = true;
		do {

			w3 = JOptionPane.showInputDialog(null, "Digite o nome de Pessoa que deseja encontrar", "Lista nomes", 3);
			if (w3.equals("fim")) {
				ver = false;
			}
			int indice = Arrays.binarySearch(nomes, w3);

			if (indice < 0) {
				JOptionPane.showMessageDialog(null, w3 + " Não foi encontrado, digite outro nome", "Lista de Amigos",
						0);
			} else {
				JOptionPane.showMessageDialog(null, "\n" + w3 + " Encontrado no índice " + indice, "Lista de Amigos",
						3);
				ver = false;
			}

		} while (ver);
	}

}
