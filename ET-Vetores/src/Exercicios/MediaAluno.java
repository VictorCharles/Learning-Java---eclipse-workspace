package Exercicios;

import javax.swing.JOptionPane;

public class MediaAluno {
	public static void main(String[] args) {

		int n = 0, kAp = 0, kEx = 0, kRep = 0, kAcima = 0, kAbaixo = 0;
		float mediaGeral = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos aluno são", "ALUNOS", 3));
		float[] avBi = new float[n];
		float[] avPra = new float[n];
		float[] avOr = new float[n];
		float[] media = new float[n];
		for (int n1 = 0; n1 < n; n1++) {
			avBi[n1] = Float.parseFloat(
					JOptionPane.showInputDialog(null, "Nota da Avaliação Bimestral", "ALUNO " + (n1 + 1), 3));
			avPra[n1] = Float
					.parseFloat(JOptionPane.showInputDialog(null, "Nota da Avaliação Pratica", "ALUNO " + (n1 + 1), 3));
			avOr[n1] = Float
					.parseFloat(JOptionPane.showInputDialog(null, "Nota da Avaliação Oral", "ALUNO " + (n1 + 1), 3));
			media[n1] = ((avBi[n1] * 5) + (avPra[n1] * 3) + (avOr[n1] * 2)) / 10;
			mediaGeral += media[n1];

			if (media[n1] >= 7) {
				JOptionPane.showMessageDialog(null, "COM A NOTA " + (media[n1]) + "\nO ALUNO FOI APROVADO",
						"RESULTADO DO ALUNO " + (n1 + 1), 2);
				kAp++;
			}
			if (media[n1] >= 5 && media[n1] < 7) {
				JOptionPane.showMessageDialog(null, "COM A NOTA " + (media[n1]) + "\nO ALUNO FICOU PARA EXAME",
						"RESULTADO DO ALUNO " + (n1 + 1), 2);
				kEx++;
			}
			if (media[n1] < 5) {
				JOptionPane.showMessageDialog(null, "COM A NOTA " + (media[n1]) + "\nO ALUNO FOI REPROVADO",
						"RESULTADO DO ALUNO " + (n1 + 1), 2);
				kRep++;
			}
		}
		//
		mediaGeral /= n;
		for (int n1 = 0; n1 < n; n1++) {
			if (media[n1] > mediaGeral) {
				kAcima++;
			}
			if (media[n1] < mediaGeral) {
				kAbaixo++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Foram aprovados: " + (kAp) + " Alunos\n" + "Ficaram de exame: " + (kEx) + " Alunos\n"
						+ "Foram reprovados: " + (kRep) + " Alunos\n" + "Media Geral da sala: " + (mediaGeral)
						+ "\nQuantidade de alunos acima da media da sala: " + (kAcima)
						+ "\nQuantidade de alunos abaixo da media da sala: " + (kAbaixo),
				"RESULTADO", 2);
	}

}
