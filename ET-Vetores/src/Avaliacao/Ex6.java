package Avaliacao;

import javax.swing.JOptionPane;

public class Ex6 {
	public static void main(String[] args) {
		int [] Numeros = { 35, 78, 55, 71, 37, 81, 83, 96, 87, 90, 69 };
		float [] Divisao = new float[Numeros.length];
		float soma = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para dividir cada elemento do vetor Numeros","Número Divisor",3));
		for (int n = 0; n < Numeros.length; n++) {
			Divisao[n] = (Numeros[n] / num) * 2;
			soma += Divisao[n];
		}
		JOptionPane.showMessageDialog(null, "soma dos valores: " + soma, "Soma da divisão multiplicada por 2 do vetor Numeros por um número", 2);
	}
}
