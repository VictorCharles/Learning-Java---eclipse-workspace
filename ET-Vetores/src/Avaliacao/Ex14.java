package Avaliacao;

import javax.swing.JOptionPane;

public class Ex14 {
	public static void main(String[] args) {
		float[] notas = new float[50];
		int kAcima = 0, kAbaixo = 0;
		float media = 0, mediaAcima = 1.1f, mediaAbaixo = 0.9f;
		for (int n = 0; n < notas.length; n++) {
			notas[n] = Float.parseFloat(
					JOptionPane.showInputDialog(null, "Digite uma nota para inserir no vetor.", "Acima abaixo", 3));
			media += notas[n];
		}
		media /= notas.length;
		mediaAcima *= media;
		mediaAbaixo *= media;
		for (int n = 0; n < notas.length; n++) {
			if (notas[n] >= mediaAcima) {
				kAcima++;
			}
			if (notas[n] <= mediaAbaixo) {
				kAbaixo++;
			}
		}
		JOptionPane.showMessageDialog(null, "Tem " + kAcima+ " notas 10% acima da média\nTem" +kAbaixo+ " notas 10% abaixo da média" , "Acima ou Abaixo", 1);
	}
}
