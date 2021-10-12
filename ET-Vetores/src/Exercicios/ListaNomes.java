package Exercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ListaNomes {
	public static void main(String[] args) {
		String[] nomes = { "Antonio", "Kelly", "Maria", "Alan", "Luiz", "João", "Sandra", "Leandro", "Paulo", "Elise",
				"Marcos", "Paula", "Luiza", "Luis", "Salomão", "José", "Josefina", "Morhiarth", "Roberfina",
				"Maria Juana" };
		String n = "";
		for (int i = 0; i < nomes.length; i++) {
			n += "==> Indice " + i + "º -" + nomes[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, n, "Lista - Sem ordenar", 1);
		n = null;
		Arrays.sort(nomes);
		for (int i = 0; i < nomes.length; i++) {
			n += "==> Indice " + i + "º -" + nomes[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, n, "Lista - Ordenada", 1);
	}

}
