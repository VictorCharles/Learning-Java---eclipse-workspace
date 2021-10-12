package Avaliacao;

import javax.swing.JOptionPane;

public class Ex15 {
	public static void main(String[] args) {
		double[] custo = new double[50];
		double[] preco = new double[50];
		String[] nome = new String[50];
		String wMenor = "", wEntre = "", wMaior = "";
		for (int n = 0; n < nome.length; n++) {
			nome[n] = JOptionPane.showInputDialog(null, "Digite o nome do produto", "Produtos", 3);
			custo[n] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Digite o custo do produto " + nome[n], "Produtos", 3));
			preco[n] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Digite o preço do produto " + nome[n], "Produtos", 3));
			if ((((preco[n] - custo[n]) / preco[n]) * 100) < 10) {
				wMenor += nome[n] + " Custou R$" + custo[n] + " e tem o preço de R$" + preco[n] + "\n";
			}
			if ((((preco[n] - custo[n]) / preco[n]) * 100) >= 10 && (((preco[n] - custo[n]) / preco[n]) * 100) <= 30) {
				wEntre += nome[n] + " Custou R$" + custo[n] + " e tem o preço de R$" + preco[n] + "\n";
			}
			if ((((preco[n] - custo[n]) / preco[n]) * 100) > 30) {
				wMaior += nome[n] + " Custou R$" + custo[n] + " e tem o preço de R$" + preco[n] + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, wMenor, "A) Produtos com lucro menor que 10%", 2);

		JOptionPane.showMessageDialog(null, wEntre, "B) Produtos com lucro entre 10% e 30%", 2);

		JOptionPane.showMessageDialog(null, wMaior, "C) Produtos com lucro maior que 30%", 2);

	}

}
