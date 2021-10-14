/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica

8. Foi feita um pesquisa de audiência de canal de TV em várias casas de um certa cidade, num determinado dia. Para cada casa visitada, é fornecido o número do canal (2, 4, 5, 7, 9, 11 ou 13) e o número de pessoas que o estavam assistindo naquela casa. Fazer um programa em Java que:
•	leia um número indeterminado de dados, sendo que o flag corresponde ao número de canal igual a 0 (zero);
•	calcule e escreva a porcentagem de audiência de cada emissora.
*/
package Avaliacao;

import java.io.*;

public class Ex8 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int canal, k2 = 0, k4 = 0, k5 = 0, k7 = 0, k9 = 0, k11 = 0, k13 = 0;
		float kPTotal;

		try {

			do {
				System.out.println("Qual canal estava sendo assistido?");
				canal = Integer.parseInt(dado.readLine());
				if (canal == 0) {
					break;
				}
				if (canal == 2) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k2 += Integer.parseInt(dado.readLine());
				} else if (canal == 4) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k4 += Integer.parseInt(dado.readLine());
				} else if (canal == 5) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k5 += Integer.parseInt(dado.readLine());
				} else if (canal == 7) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k7 += Integer.parseInt(dado.readLine());
				} else if (canal == 9) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k9 += Integer.parseInt(dado.readLine());
				} else if (canal == 11) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k11 += Integer.parseInt(dado.readLine());
				} else if (canal == 13) {
					System.out.println("Quantas pessoas estavam assistindo esse canal?");
					k13 += Integer.parseInt(dado.readLine());
				} else {
					System.out.println("Digite um canal valido");
				}
			} while (canal != 0);
			kPTotal = k2 + k4 + k5 + k7 + k9 + k11 + k13;
			System.out.println("===============> RESULTADO <===============");
			System.out.println("Audiência do canal 2 " + ((k2 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 4 " + ((k4 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 5 " + ((k5 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 7 " + ((k7 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 9 " + ((k9 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 11 " + ((k11 / kPTotal) * 100) + "%");
			System.out.println("Audiência do canal 13 " + ((k13 / kPTotal) * 100) + "%");

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
