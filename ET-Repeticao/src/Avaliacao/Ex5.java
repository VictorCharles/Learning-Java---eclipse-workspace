/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

5. Um time de Futebol deseja aumentar o salário de seus 22 jogadores. O reajuste deve obedecer a seguinte tabela: 
SALÁRIO ATUAL (R$)	 |AUMENTO
0,00 a 10.000,00	 |20%
10.000,01 a 50.000,00|10%
acima de 50.000,00	 |5%

Escrever um programa em Java que:
•	leia o nome e o salário atual de cada jogador;
•	exiba o nome, o salário atual e o salário reajustado de cada jogador;
•	exiba o total da folha de salários do clube, antes do reajuste.
•	exiba o total da folha de salários do clube, após o reajuste.
•	exiba o percentual de reajuste sobre o total da folha de salários.
*/

package Avaliacao;

import java.io.*;

public class Ex5 {

	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		String nome;
		double sal, salClube= 0, salReajus=0;

		try {

			for (int i = 1; i <= 22; i++) {
				System.out.print("Escreva o nome do jogador: ");
				nome = dado.readLine();
				System.out.print("\nEscreva o salário atual desse jogador: R$ ");
				sal = Double.parseDouble(dado.readLine());
				salClube += sal;
				if (sal > 0 & sal <= 10000) {
					System.out.println("O jogador " + nome + " com salario de R$ " + sal + " vai ter um aumento de 20%\nO salario dele passa a ser R$ " + (sal * 1.20));
					sal *= 1.20;
					salReajus += sal;
				} 
				else if (sal > 10000 & sal <= 50000) {
					System.out.println("O jogador " + nome + " com salario de R$ " + sal + " vai ter um aumento de 10%\n O salario dele passa a ser R$ " + (sal * 1.10));
					sal *= 1.10;
					salReajus += sal;
				} 
				else if (sal > 50000) {
					System.out.println("O jogador " + nome + " com salario de R$ " + sal + " vai ter um aumento de 5%\n O salario dele passa a ser R$ " + (sal * 1.10));
					sal *= 1.05;
					salReajus += sal;
				}

			}
			
			
			System.out.println("------------------> FOLHA DE PAGAMENTO <------------------ ");
			System.out.println("Total da folha de pagamentos (sem reajustes): R$ " + salClube);
			System.out.println("Total da folha de pagamentos (com reajustes): R$ " + salReajus);
			System.out.println("Teve um aumento percentual de " +  (((salReajus-salClube) / salClube)  * 100) + "%");
			System.out.println("O reajuste foi de " + ((salReajus / salClube) * 100) + "%");
			dado.close();
		} catch (IOException erro) {
			// Indica erro de entrada de dados
			System.out.println("Houve erro na entrada de dados");

		} catch (NumberFormatException erro) {
			// Erro de formato de numero, tipo por string numa variável int
			System.out.println("Digite apenas caracteres numéricos");
		}

	}

}
