/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

7. Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado no mercado. 
Para isto, forneceu o sexo do entrevistado (M-masculino ou F-feminino) e sua resposta (S-sim ou N-não). 
Sabendo-se que foram entrevistados 2.000 pessoas, faça um programa em Java que calcule e escreva:
•	número de pessoas que responderam sim (S);
•	número de pessoas que responderam não (N);
•	a porcentagem de pessoas do sexo feminino (F);
•	a porcentagem de pessoas do sexo masculino (M);
•	a porcentagem de pessoas do sexo feminino (F) que responderam sim (S);
•	a porcentagem de pessoas do sexo masculino (M) que responderam não (N).
*/
package Avaliacao;

import java.io.*;

public class Ex7 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		String sexo = "", resposta = "";
		int kM = 0, kF = 0, kS = 0, kN = 0, kFS = 0, kMN = 0, kP = 0;

		try {
			for (kP = 1; kP <= 2000; kP++) {
				System.out.println("Sexo do entrevistado. M para masculino e F para feminino");
				sexo = dado.readLine();
				if (sexo.equals("M") || sexo.equals("m")) {
					kM++;
					System.out.println("Qual a resposta do entrevistado. S para sim e N para não");
					resposta = dado.readLine();
					if (resposta.equals("N") || resposta.equals("n")) {
						kMN++;
						kN++;
					} else if (resposta.equals("S") || resposta.equals("s")) {
						kS++;
					}
				}
				if (sexo.equals("F") || sexo.equals("f")) {
					kF++;
					System.out.println("Qual a resposta do entrevistado. S para sim e N para não");
					resposta = dado.readLine();
					if (resposta.equals("S") || resposta.equals("s")) {
						kFS++;
						kS++;
					} else if (resposta.equals("N") || resposta.equals("n")) {
						kN++;
					}
				}
			}
			System.out.println("===============> RESULTADO <===============");
			System.out.println("Quantas pessoas responderam sim: " + kS);
			System.out.println("Quantas pessoas responderam não: " + kN);
			System.out.println("Porcentagem de pessoas do sexo feminino: " + ((kF / kP) * 100) + "%");
			System.out.println("Porcentagem de pessoas do sexo masculino: " + ((kM / kP) * 100) + "%");
			System.out.println(
					"Porcentagem de pessoas do sexo feminino que responderam sim: " + ((kFS / kP) * 100) + "%");
			System.out.println(
					"Porcentagem de pessoas do sexo masculino que responderam não: " + ((kMN / kP) * 100) + "%");

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
