package Avaliacao;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		int [] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		float [] Divisao = new float[Numeros.length];
		String w = "";
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para dividir cada elemento do vetor Numeros","Número Divisor",3));
		for (int n = 0; n < Numeros.length; n++) {
			Divisao[n] = Numeros[n] / num;
			w += "Divisao[" + n + "] = " + Divisao[n] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Divisão do vetor Numeros por um número", 2);
	}
}
