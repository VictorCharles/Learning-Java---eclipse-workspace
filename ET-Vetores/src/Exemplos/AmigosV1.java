package Exemplos;

import javax.swing.JOptionPane;

public class AmigosV1 {

	public static void main(String[] args) {
		/*
		 * show Input DIALOG usa 4 parametros 1 - Arquivo pra ficar carregando
		 * posteriormente 2 - Mensagem 3 - Titulo 4 - ICONE - TEM 4 tipos de icon: 0(Um
		 * x vermelho e tals 1(Da um tipo de i) 2(Ponto de exclamação) 3(Ponto de
		 * interrogação)
		 */

		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quant. pessoas", "Lista Amigos", 3));
		String[] nomes = new String[n];
		String w = "";
		for (int x = 0; x < n; x++) {
			nomes[x] = JOptionPane.showInputDialog(null, "Digite o nome da " + (x + 1) + "º pessoa", 3);
			w += "Nome " + (x + 1) + " = " + nomes[x] + "\n";

		}
		/*
		 * JOptionPane.showMessageDialog usa 4 parametros 1 - Arquivo pra ficar
		 * carregando posteriormente 2 - Mensagem 3 - Titulo 4 - ICONE - TEM 4 tipos de
		 * icon: 0(Um x vermelho e tals 1(Da um tipo de i) 2(Ponto de exclamação)
		 * 3(Ponto de interrogação)
		 */
		/*
		 * for (int x = 0; x < n; x++) { JOptionPane.showMessageDialog(null, nomes[x],
		 * "Lista Amigos", 1); }
		 */

		// Mas como a gente é inteligente, a gente usa uma somatoria de texto e exibe
		// ela no final :3
		JOptionPane.showMessageDialog(null, w, "Lista Amigos", 1);
	}
}
