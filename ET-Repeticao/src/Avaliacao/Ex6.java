/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

6. O cardápio de uma casa de lanches, especializada em sanduíches, é dado abaixo. 

CÓDIGO|PRODUTO	    |PREÇO (R$)
H     |Hamburger	|3,00
C     |Cheeseburger	|3,80
M	  |Misto Quente	|2,50
A	  |Americano	|4,20
Q	  |Queijo Prato	|1,80

Escreva um programa em Java que leia o código e a quantidade de cada item comprado por um freguês, depois feche a conta calculando e exibindo o total a pagar.  Obs: A leitura do código 'X' indica o fim dos itens.
*/
package Avaliacao;

import java.io.*;

public class Ex6 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		double conta = 0;
		String codigo = "";

		try {
			while (!codigo.equals("X") && !codigo.equals("x")) {
				System.out.println("Digite um dos codigo abaixo");
				System.out.println("\nH - Hamburguer");
				System.out.println("C - Cheeseburguer");
				System.out.println("M - Misto Quente");
				System.out.println("A - Americano");
				System.out.println("Q - Queijo Prato");
				System.out.println("X - Sair");
				codigo = dado.readLine();

				if (codigo.equals("X") || codigo.equals("x")) {
					System.out.println("Volte Sempre!\n");
					break;
				}
				if (codigo.equals("H") || codigo.equals("h")) {
					System.out.println("Digite a quantidade");
					int k = Integer.parseInt(dado.readLine());
					conta += (k * 3);
					System.out.println("Adicionado a conta com sucesso");
				}
				if (codigo.equals("C") || codigo.equals("c")) {
					System.out.println("Digite a quantidade");
					int k = Integer.parseInt(dado.readLine());
					conta += (k * 3.8);
					System.out.println("Adicionado a conta com sucesso");
				}
				if (codigo.equals("M") || codigo.equals("m")) {
					System.out.println("Digite a quantidade");
					int k = Integer.parseInt(dado.readLine());
					conta += (k * 2.5);
					System.out.println("Adicionado a conta com sucesso");
				}
				if (codigo.equals("A") || codigo.equals("a")) {
					System.out.println("Digite a quantidade");
					int k = Integer.parseInt(dado.readLine());
					conta += (k * 4.2);
					System.out.println("Adicionado a conta com sucesso");
				}
				if (codigo.equals("Q") || codigo.equals("q")) {
					System.out.println("Digite a quantidade");
					int k = Integer.parseInt(dado.readLine());
					conta += (k * 1.8);
				}
				else {
					System.out.println("Codigo invalido");
				}
			}
			System.out.println("======> RECIBO <======");
			System.out.println("Total a pagar: R$ " + conta);
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