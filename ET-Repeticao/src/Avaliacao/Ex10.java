/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

10. Escreva um programa em Java que leia o número de andares de um prédio e, a seguir, para cada andar do prédio, leia o número de pessoas que entraram e saíram do elevador. 
Considere que o elevador está vazio e está subindo, os dados se referem a apenas uma subida do elevador e que o número de pessoas dentro do elevador será sempre maior ou igual a zero.
Se o número de pessoas, após a entrada e saída, for maior que 15, deve ser mostrada a mensagem "Excesso de passageiros. Devem sair X", sendo X o número de pessoas que devem sair do elevador, de modo que seja obedecido o limite de 15 passageiros.
Após a entrada e saída no último andar, o algoritmo deve mostrar quantas pessoas permaneceram no elevador para descer.
*/
package Avaliacao;

import java.io.*;

public class Ex10 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int andar = 0, kP = 0, cont = 0, a;
		try {
			System.out.println("Digite quantos andares tem no prédio ");
			andar = Integer.parseInt(dado.readLine());

			for (a = 0; a <= andar; a++) {
				System.out.println(a + "º Andar");
				System.out.println("Quantas pessoas entraram no elevador? ");
				kP += (Integer.parseInt(dado.readLine()));
				System.out.println("Quantas pessoas sairam do elevador? ");
				kP -= (Integer.parseInt(dado.readLine()));
				if (kP < 0) {
					System.out.println("O número de pessoas dentro do elevador não pode ser menor que 0 (ERRO)");
					break;
				} else if (kP > 15) {
					cont = kP - 15;
					System.out.println(
							"O número de pessoas dentro do elevador excede a capacidade maxima (15 PESSOAS). Devem sair "
									+ cont + " pessoas");
					kP -= cont;
				} else {
					System.out.println("O elevador torna a subir");
				}
			}

			System.out.println("Ficaram " + kP + "pessoas no elevador para descer no " + a + "º andar");
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
