package Exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MultiplicaEntreVetor {
	public static void main(String[] args) {
		int [] vetor1 = new int[10];
		int [] vetor2 = new int[10];
		int [] vetor3 = new int[10];
		String h="";
		for (int n = 0; n < 10; n++) {
			vetor1[n] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor a ser armazenado","Vetor 1",3));
		}
		for (int n = 0; n < 10; n++) {
			vetor1[n] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor a ser armazenado","Vetor 2",3));
		}
		for (int n = 0; n < 10; n++) {
			vetor3[n] = vetor1[n] * vetor2[(vetor3.length - 1)-n];
			h += "Indice " + (n) + " = " + vetor3[n] + "\n";
		}
		JOptionPane.showMessageDialog(null,h,"Vetor 3 sem ordenar",3);
		
		h = "";
		Arrays.sort(vetor3);
		for (int n = 0; n<10; n++) {
			h += "Indice " + (n) + " = " + vetor3[n] + "\n";
		}
		JOptionPane.showMessageDialog(null,h,"Vetor 3 ordenado",3);
	}
}
