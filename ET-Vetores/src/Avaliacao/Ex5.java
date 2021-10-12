package Avaliacao;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main(String[] args) {
		int[] Nums = { 65, 22, 45, 29, 63, 19, 17, 4, 13, 10, 31 };
		int[] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		int n = Nums.length, soma = 0;
		int[] Produto = new int[Nums.length];
		for (int n1 = 0; n1 < n; n1++) {
			Produto[n1] = Nums[n1] * Numeros[(n - 1) - n1];
			soma += Produto[n1];
		}
		JOptionPane.showMessageDialog(null, "Soma dos produtos = " + soma, "Produto somado dos vetores", 2);
	}
}
