package Avaliacao;

import javax.swing.JOptionPane;

public class Ex11 {
	public static void main(String[] args) {
		int[] cpf = new int[11];
		int dv1 = 0;
		int dv2 = 0;
		int sm = 0;
		int r = 0;
		boolean verificador = true;
		try {
			String cpfDig = JOptionPane.showInputDialog(null,
					"Digite os 11 caracteres do CPF para verificar se ele é valido", "Validador de CPF", -1);
			for (int n = 0; n < cpf.length; n++) {
				cpf[n] = (int) (cpfDig.charAt(n) - 48);
			}

			// Verificador 1
			for (int n = 0; n < 9; n++) {
				sm += (cpf[n] * (10 - n));
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dv1 = 0;
			} else {
				dv1 = r;
			}

			sm = 0;
			// Verificador 2
			for (int n = 0; n < 10; n++) {
				sm += (cpf[n] * (11 - n));
			}
			r = 11 - (sm % 11);
			System.out.println(r);
			if ((r == 10) || (r == 11)) {
				dv2 = 0;
			} else {
				dv2 = r;
			}

			if (dv1 != cpf[9] || dv2 != cpf[10]) {
				verificador = false;
			}

			if (verificador) {
				JOptionPane.showMessageDialog(
						null, "O CPF " + cpf[0] + cpf[1] + cpf[2] + "." + cpf[3] + cpf[4] + cpf[5] + "." + cpf[6]
								+ cpf[7] + cpf[8] + "-" + +cpf[9] + cpf[10] + " e um CPF valido",
						"Validador de CPF", -1);
			} else {
				JOptionPane.showMessageDialog(null, "O CPF não é valido", "Validador de CPF", -1);
			}
		} catch (NumberFormatException erro) {
			// Erro de formato de numero, tipo por string numa variável int
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numéricos", "ERRO", 3);
		}

	}
}
