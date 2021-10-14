/*
Etec de Sapopemba
Victor Charles Alves Vieira 3�C 
Rodrigo Guedes dos Santos 3�C
ETIM - Informatica

10. Escreva um programa em Java que leia o n�mero de andares de um pr�dio e, a seguir, para cada andar do pr�dio, leia o n�mero de pessoas que entraram e sa�ram do elevador. 
Considere que o elevador est� vazio e est� subindo, os dados se referem a apenas uma subida do elevador e que o n�mero de pessoas dentro do elevador ser� sempre maior ou igual a zero.
Se o n�mero de pessoas, ap�s a entrada e sa�da, for maior que 15, deve ser mostrada a mensagem "Excesso de passageiros. Devem sair X", sendo X o n�mero de pessoas que devem sair do elevador, de modo que seja obedecido o limite de 15 passageiros.
Ap�s a entrada e sa�da no �ltimo andar, o algoritmo deve mostrar quantas pessoas permaneceram no elevador para descer.
*/
package Avaliacao;

import java.io.*;

public class Ex10 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int andar = 0, kP = 0, cont = 0, a;
		try {
			System.out.println("Digite quantos andares tem no pr�dio ");
			andar = Integer.parseInt(dado.readLine());

			for (a = 0; a <= andar; a++) {
				System.out.println(a + "� Andar");
				System.out.println("Quantas pessoas entraram no elevador? ");
				kP += (Integer.parseInt(dado.readLine()));
				System.out.println("Quantas pessoas sairam do elevador? ");
				kP -= (Integer.parseInt(dado.readLine()));
				if (kP < 0) {
					System.out.println("O n�mero de pessoas dentro do elevador n�o pode ser menor que 0 (ERRO)");
					break;
				} else if (kP > 15) {
					cont = kP - 15;
					System.out.println(
							"O n�mero de pessoas dentro do elevador excede a capacidade maxima (15 PESSOAS). Devem sair "
									+ cont + " pessoas");
					kP -= cont;
				} else {
					System.out.println("O elevador torna a subir");
				}
			}

			System.out.println("Ficaram " + kP + "pessoas no elevador para descer no " + a + "� andar");
			dado.close();
		} catch (IOException erro) {
			// Indica erro de entrada de dados
			System.out.println("Houve erro na entrada de dados");

		} catch (NumberFormatException erro) {
			// Erro de formato de numero, tipo por string numa vari�vel int
			System.out.println("Digite apenas caracteres num�ricos");
		}
	}
}
