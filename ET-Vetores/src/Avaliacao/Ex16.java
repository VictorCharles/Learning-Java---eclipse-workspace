package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex16 {
	public static void main(String[] args) {

		int nota[] = new int[200];
		int nota2[] = new int[nota.length];
		int indice[] = new int[nota.length];
		String nome[] = new String[nota.length];
		String nomeOrdenado[] = new String[nota.length];
		String w = "";
		int n;

		for (n = 0; n < nota.length; n++) {
			nota[n] = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Digite com a pontuação do candidato: ", "Concurso", -1));

			nome[n] = (JOptionPane.showInputDialog(null, "Digite com a nome do candidato: ", "Concurso", -1));
			if (nome[n] == null || nome[n].isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro de entrada de dados, o programa sera encerrado", "Concurso",
						3);
				System.exit(1);
			}
		}

		nota2 = nota;

		Arrays.sort(nota);

		for (n = 0; n < nota.length; n++) {
			indice[n] = Arrays.binarySearch(nota, nota2[n]);
			nomeOrdenado[n] = nome[indice[n]];
			w += nota[n] + " | " + nomeOrdenado[n] + "\n";
		}

		JOptionPane.showMessageDialog(null, "Nota - Nome: \n" + w, "Concurso", -1);

	}
}
