package Avaliacao;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		int[] Nums = { 65, 22, 45, 29, 63, 19, 17, 4, 13, 10, 31 };
		int[] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		int[] Soma = new int[Nums.length];
		String w = "";
		for (int n = 0; n < Nums.length; n++) {
			Soma[n] = Nums[n] + Numeros[n];
			w += "Soma[" + n + "] = " + Soma[n] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Soma dos vetores", 2);
	}
}
