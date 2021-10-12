/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica 
 
2) Dada as matrizes a seguir, faça a multiplicação delas usando a regras matemáticas, mostrando a matriz resultante P2:
	3	6
X = 8	4				 3	5	8	
	6	2			Y =	 7	9	2

Depois, calcule o determinante da matriz P2, utilizando a regra de Sarrus.

 */
package Avaliacao;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		int [][] x =  {
				{3, 6},
				{8, 4},
				{6, 2} 
				};
		int [][] y = {
				{3, 5, 8},
				{7, 9, 2}
				};
		int [][] p2 = new int [3][3];
		int dP = 0, dN = 0, determinante = 0;
		String w = "Matriz P2: \n";
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++){
				p2[l][c] = (x[l][0] * y[0][c]) + (x[l][1] * y[1][c]);
				//CODIGO LINDO DE BONITO, TOMAR NO MEU CU, TO ORGULHOSO, O QUE É NÚMERO É PQ É PRA SER ESTATICO MESMO, TOMAR NO CU.
				//chorei fazendo essa merda. Ah é, L é pra ser altera só quando descer, e C é pra ser alterado constantemente.
				w += p2[l][c] + "  "; //Essa porra pega a informação da matriz
				
			}
			w+= "\n";//pula a linha pra fazer isso ficar bonito
			
		}
		for (int i = 0; i < 3; i++) {	
					//parte positiva da determinante
		if (i == 0)	dP = p2[0][i] * p2[1][i+1] * p2[2][2];
		if (i == 1) dP += p2[0][i] * p2[1][i+1] * p2[2][i-1];
		if (i == 2) dP += p2[0][i] * p2[1][i-2] * p2[2][i-1];
					//parte negativa da determinante
		if (i == 0)	dN =  (p2[0][2] * p2[1][i+1] * p2[2][i]) * -1;
		if (i == 1) dN += (p2[0][i-1] * p2[1][i+1] * p2[2][i]) * -1;
		if (i == 2) dN += (p2[0][i-1] * p2[1][i-2] * p2[2][i]) * -1; 
				
		}
		determinante = dP + dN; // gerar determinante
		w += "Determinante =  " + determinante; // armazenar a determinante na resposta
		JOptionPane.showMessageDialog(null, w, "Resposta", -1); // RESPOSTA FINAL, n tem o calculo da determinante pq preguiça, mas tem a determinante
	}
}
