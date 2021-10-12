//Uma classe java que peça um lista de números inteiros positivos. Para terminar, deve-se digitar o numero 0
package Exemplos;

import java.io.*;

public class MediaNum1 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int kNum = 0;
		String S = "";
		float media = 0;

		try {
			while (!S.equals("0")) {
				System.out.println("Digite um numero");
				S = dado.readLine();

				if (S.equals("0")) {
					break;
				}

				media += Float.parseFloat(S);
				kNum++;
			}

			media /= kNum;
			System.out.println("Você digitou " + kNum + " numero");
			System.out.println("A media é " + media);

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
