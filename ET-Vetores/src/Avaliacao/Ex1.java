package Avaliacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex1 {
	public static void main(String[] args) {
		int[] Nums = { 65, 22, 45, 29, 63, 19, 17, 4, 13, 10, 31 };
		Arrays.sort(Nums);
		String w = "";
		for (int n = 0; n < Nums.length; n++) {
			w += Nums[n] + "\n";
		}
		JOptionPane.showMessageDialog(null, w, "Vetor Nums ordenado numericamente", 2);
	}
}
