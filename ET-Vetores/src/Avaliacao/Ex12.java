package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex12 {
	public static void main(String[] args) {
		String[] Nomes = new String[20];
		int[] id = new int[Nomes.length];
		for (int n = 0; n < Nomes.length; n++) {
			Nomes[n] = JOptionPane.showInputDialog(null, "Digite um nome para inserir no vetor.", "Lista de nomes", 3);
			id[n] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do " + Nomes[n] + ": "));
		}
		boolean ver = true;
		do {

			String w3 = JOptionPane.showInputDialog(null, "Digite o codigo da Pessoa que deseja encontrar",
					"Lista nomes", 3);
			if (w3.equals("fim")) {
				ver = false;
			}
			int w2 = Integer.parseInt(w3);
			int indice = Arrays.binarySearch(id, w2);

			if (indice < 0) {
				JOptionPane.showMessageDialog(null, w3 + " Não foi encontrado, digite outro codigo", "Lista de nomes",
						0);
			} else {
				JOptionPane.showMessageDialog(null, " Nome correspondente ao codigo:  " + Nomes[indice],
						"Lista de nomes", 3);
				ver = false;
			}

		} while (ver);
	}
}
