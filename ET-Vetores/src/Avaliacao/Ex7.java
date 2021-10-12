package Avaliacao;

import javax.swing.JOptionPane;

public class Ex7 {
	public static void main(String[] args) {
		int[] Nums = { 65, 22, 45, 29, 63, 19, 17, 4, 13, 10, 31 };
		int[] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		int n = Nums.length;
		float num = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Digite um número para dividir cada elemento do vetor Numeros", "Número Divisor", 3));
		float [] Produto = new float[n];
		float [] Divisao = new float[n];
		float [] Modulo = new float[n];
		String w = "";
		for (int n1 = 0; n1 < n; n1++) {
			Produto[n1] = Nums[n1] * Numeros[(n - 1) - n1];
			Divisao[n1] = Numeros[n1] / num;
			Modulo[n1] = (Produto[n1] * Divisao[n1]) % 10;
			w += "Modulo[" + n1 + "] = " + Modulo[n1] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Vetor Modulo", 2);
	}
}