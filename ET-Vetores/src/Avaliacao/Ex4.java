package Avaliacao;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		int [] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		float [] Divisao = new float[Numeros.length];
		String w = "";
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero para dividir cada elemento do vetor Numeros","N�mero Divisor",3));
		for (int n = 0; n < Numeros.length; n++) {
			Divisao[n] = Numeros[n] / num;
			w += "Divisao[" + n + "] = " + Divisao[n] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Divis�o do vetor Numeros por um n�mero", 2);
	}
}
