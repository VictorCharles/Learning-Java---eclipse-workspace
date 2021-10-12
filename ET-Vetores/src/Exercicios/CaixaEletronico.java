package Exercicios;
/* 6) Desenvolva uma classe onde permita armazenar, 
 * em um vetor, quantidade de cédulas de cada valor 
 * (índice 0 = R$ 2, 
 *  índice 1 = R$ 5, 
 *  índice 2 = R$ 10, 
 *  índice 3 = R$ 20, 
 *  índice 4 = R$ 50, 
 *  índice 5 = R$ 100). 
 *  Depois a classe deve pedir para o usuário quanto 
 *  ele quer sacar. A Classe deve retornar ao usuário 
 *  duas opções de saque: 
 *     - uma com poucas notas de valor alto 
 *     - e uma com varias notas de valor baixo. 
 *  Deve informar, também, se não há dinheiro suficiente 
 *  para atender o pedido
 *  
 *  FALTA VERIFICAR:
 *     - QUANTIDADE NEGATIVA DE CADA VALOR
 *     - FAZER BOTAO CANCELAR FUNCIONAR
 *     - QUANTIDADES IGUAIS NAS DUAS OPÇOES
 */

import javax.swing.JOptionPane;
public class CaixaEletronico {

	public static void main(String[] args) {
		int [] CxEl = new int[6];
		float [] Valor = {2,5,10,20,50,100};
		float valorcx = 0;
		boolean x = true;
		
	/* Preencher Vetor CxEl com a quantidade de 
	 * cada cedula
	 */

		for (int y=0; y < 6; y++){
			CxEl[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Cedulas de R$ " + Valor[y],"Procedimento Interno - Abastecendo Caixa Eletronico",3));
			valorcx += CxEl[y]*Valor[y];
		}
		
		JOptionPane.showMessageDialog(null, "Caixa Eletronico abastecido com as seguintes quantidades\n"
				+ "\nR$   2,00 x "+CxEl[0]+ " = R$ " + (float)(CxEl[0]*Valor[0])
				+ "\nR$   5,00 x "+CxEl[1]+ " = R$ " + (float)(CxEl[1]*Valor[1])
				+ "\nR$  10,00 x "+CxEl[2]+ " = R$ " + (float)(CxEl[2]*Valor[2])
				+ "\nR$  20,00 x "+CxEl[3]+ " = R$ " + (float)(CxEl[3]*Valor[3])
				+ "\nR$  50,00 x "+CxEl[4]+ " = R$ " + (float)(CxEl[4]*Valor[4])
				+ "\nR$ 100,00 x "+CxEl[5]+ " = R$ " + (float)(CxEl[5]*Valor[5])
				+ "\n\nTotal Abastecido R$ " + valorcx,"Procedimento Interno - Caixa Abastecido",1);
	/* Procedimento Externo - Saque do Caixa Eletronico*/
				
		while (x){
			String mens = "Escolha uma opçao de Saque:\n";
			float valorsq = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual valor deseja sacar?","Procedimento Externo - Saque",3));
			float valorint = valorsq;
			if (valorsq > valorcx){
				JOptionPane.showMessageDialog(null, "Nao ha valor disponivel para essa quantia\nTente outro Caixa","Procedimento Externo - Saque",0);
				continue;
			}
			int [] Sq1 = new int[6];
			mens += "\nOpçao 1:\n";
			int i=5;
			if (valorint >= 100){
				Sq1[5] = (int)valorint / 100;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]); 
				valorint -= Sq1[5]*100;
			}
			i--;
			if (valorint >= 50){
				Sq1[4] = (int)valorint / 50;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]);
				valorint -= Sq1[4]*50;
			}
			i--;
			if (valorint >= 20){
				Sq1[3] = (int)valorint / 20;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]);
				valorint -= Sq1[3]*20;
			}
			i--;
			if (valorint >= 10){
				Sq1[2] = (int)valorint / 10;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]);
				valorint -= Sq1[2]*10;
			}
			i--;
			if (valorint >= 5){
				Sq1[1] = (int)valorint / 5;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]); 
				valorint -= Sq1[1]*5;
			}
			i--;
			if (valorint >= 2){
				Sq1[0] = (int)valorint / 2;
				if (Sq1[i] > CxEl[i]) Sq1[i] += (CxEl[i] - Sq1[i]); 
				valorint -= Sq1[0]*2;
			}
			if (Sq1[5]!=0) mens += Sq1[5]+" notas de R$ 100,00\n";
			if (Sq1[4]!=0) mens += Sq1[4]+" notas de R$ 50,00\n";
			if (Sq1[3]!=0) mens += Sq1[3]+" notas de R$ 20,00\n";
			if (Sq1[2]!=0)	mens += Sq1[2]+" notas de R$ 10,00\n";
			if (Sq1[1]!=0)	mens += Sq1[1]+" notas de R$ 5,00\n";
			if (Sq1[0]!=0)	mens += Sq1[0]+" notas de R$ 2,00\n";
			
			int [] Sq2 = new int[6];
			valorint = valorsq;
			mens += "\nOpçao 2:\n";
			while (valorint > 0){
				if (valorint >= 100){
					Sq2[5] ++;  
					//(int)valorint / 100 - 1;
					valorint -= 100;
				}
				if (valorint >= 50){
					Sq2[4] ++;
					//= (int)valorint / 50 - 1;
					valorint -= 50;
				}
				if (valorint >= 20){
					Sq2[3] ++;
					//= (int)valorint / 20 - 1;
					valorint -= 20;
				}	
				if (valorint >= 10){
					Sq2[2] ++;
					//= (int)valorint / 10 - 1;
					valorint -= 10;
				}
				if (valorint >= 5){
					Sq2[1] ++;
					//= (int)valorint / 5 - 1;
					valorint -= 5;
				}
				if (valorint >= 2){
					Sq2[0] ++;
					//= (int)valorint / 2 - 1;
					valorint -= 2;
				}
			}
			
			if (Sq2[5]!=0) mens += Sq2[5]+" notas de R$ 100,00\n";
			if (Sq2[4]!=0) mens += Sq2[4]+" notas de R$ 50,00\n";
			if (Sq2[3]!=0) mens += Sq2[3]+" notas de R$ 20,00\n";
			if (Sq2[2]!=0)	mens += Sq2[2]+" notas de R$ 10,00\n";
			if (Sq2[1]!=0)	mens += Sq2[1]+" notas de R$ 5,00\n";
			if (Sq2[0]!=0)	mens += Sq2[0]+" notas de R$ 2,00\n";
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(null, mens,"Procedimento Externo - Saque",1));
			
			if (op == 1){
				CxEl[0] -= Sq1[0];
				CxEl[1] -= Sq1[1];
				CxEl[2] -= Sq1[2];
				CxEl[3] -= Sq1[3];
				CxEl[4] -= Sq1[4];
				CxEl[5] -= Sq1[5];
			} else {
				CxEl[0] -= Sq2[0];
				CxEl[1] -= Sq2[1];
				CxEl[2] -= Sq2[2];
				CxEl[3] -= Sq2[3];
				CxEl[4] -= Sq2[4];
				CxEl[5] -= Sq2[5];
			}
			
			valorcx = CxEl[0]*2+CxEl[1]*5+CxEl[2]*10+CxEl[3]*20+CxEl[4]*50+CxEl[5]*100;
			
			JOptionPane.showMessageDialog(null, "Caixa Eletronico abastecido com as seguintes quantidades\n"
					+ "\nR$   2,00 x "+CxEl[0]+ " = R$ " + (float)(CxEl[0]*2)
					+ "\nR$   5,00 x "+CxEl[1]+ " = R$ " + (float)(CxEl[1]*5)
					+ "\nR$  10,00 x "+CxEl[2]+ " = R$ " + (float)(CxEl[2]*10)
					+ "\nR$  20,00 x "+CxEl[3]+ " = R$ " + (float)(CxEl[3]*20)
					+ "\nR$  50,00 x "+CxEl[4]+ " = R$ " + (float)(CxEl[4]*50)
					+ "\nR$ 100,00 x "+CxEl[5]+ " = R$ " + (float)(CxEl[5]*100)
					+ "\n\nTotal Abastecido R$ " + valorcx,"Procedimento Interno - Caixa Abastecido",1);
		}
		
	}

}
