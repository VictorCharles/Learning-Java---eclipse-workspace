//Uma classe java que pe�a um lista de n�meros inteiros positivos. Para terminar, deve-se digitar o numero 0
package Exemplos;

import java.io.*;

public class MediaNum3 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int kNum = 0, inteiro = 0;
		float S = 0;
		float positivos = 0;

		try {
			while (S != 0) {
				System.out.println("Digite um numero (0 para sair)");
				S = Float.parseFloat(dado.readLine());

				if (S == 0) {
					break;
				}
				else if (S <= 0) {
					System.out.println("==> Somente n�meros positivos <==");
					System.out.println("Tente novamente");
					continue;
				}
				inteiro = (int)S;
				if (inteiro != S){
					System.out.println("==> Somente n�meros positivos <==");
					System.out.println("Tente novamente");
					continue;
				}
				positivos++;
				kNum ++;
			}
			
			System.out.println("Foram digitados" + kNum + " n�meros");
			System.out.println("A m�dia �: " + (positivos/kNum));
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
