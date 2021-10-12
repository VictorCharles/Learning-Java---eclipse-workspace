package Avaliacao;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Avaliacao {
	public static void main(String[] args) {
		int[][] m = new int[10][10];
		int[] vL = new int[10];
		int[] vC = new int[10];
		int verificadorMaior = 0, verificadorMenor = 99999999;
		for (int l = 0; l < 10; l++) {
			for (int c = 0; c < 10; c++) {
				m[l][c]= Integer.parseInt(JOptionPane.showInputDialog("digite um número para preencher a matriz"));
			}
		}
		
		for (int l = 0; l < 10; l++) {
			for (int c = 0; c < 10; c++) {
				m[l][c]= Integer.parseInt(JOptionPane.showInputDialog("digite um número para preencher a matriz"));
			}
		}
		
		for (int l = 0; l < 10; l++) {
			for (int c = 0; c < 10; c++) {
				if(verificadorMaior<m[l][c]) verificadorMaior = m[l][c];
				if(verificadorMenor<m[c][l]) verificadorMenor = m[c][l];
			}
			vL[l] = verificadorMaior;
			vC[l] = verificadorMenor;
			
			verificadorMaior = 0;
			verificadorMenor = 99999999;
		}
		Arrays.sort(vL);
		Arrays.sort(vC);
		String w = "Vetor com os maiores elementos de cada linha, ordenada, crescente\n";
		for (int i = 0; i < 10; i++){
			w += vL[i] + "  ||  ";
		}
		w = "Vetor com os menores elementos de cada coluna, ordenada, crescente\n";
		for (int i = 0; i < 10; i++){
			w += vC[i] + "  ||  ";
		}
		
		JOptionPane.showMessageDialog(null, w ,"Mostrando vetores" ,-1);
	}
}