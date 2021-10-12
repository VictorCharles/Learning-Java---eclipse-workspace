package Exemplos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class AmigosV3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite quantidade de pessoas", "Lista de amigos", 3));
		String w = "", w2 = "";

		String[] nomes = new String[n];

		for (int x = 0; x < n; x++) {
			nomes[x] = JOptionPane.showInputDialog(null, "Digite o nome de " + (x + 1) + "º Pessoa", "Lista de Amigos",
					3);
			w += "Nome " + (x + 1) + " = " + nomes[x] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Lista de amigos sem ordenar", 1);

		Arrays.sort(nomes);
		w = "";
		for (int x = 0; x < n; x++) {
			w += "Nome " + (x + 1) + " = " + nomes[x] + "\n";
		}
		w2 = JOptionPane.showInputDialog(null, "Digite o nome para procurar", "Lista de Amigos", 3);

		if (w2.isEmpty()) {
			JOptionPane.showMessageDialog(null, w, "Lista de amigos sem ordenar", 0);
			System.exit(1);
		}

		int indice = Arrays.binarySearch(nomes, w2);

		if (indice < 0) {
			JOptionPane.showMessageDialog(null, w2 + " Não foi encontrado", "Lista de Amigos", 0);
		} else {
			JOptionPane.showMessageDialog(null, w + "\n" + w2 + " Encontrado no índice " + indice, "Lista de Amigos",
					3);
		}

	}

}
