//Crie uma classe java que leia o numero N e
//some todos os numeros inteiro de 1 a N e mostrar o resultado

package Exemplos;

import java.io.*;

public class SomaIn {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(dado.readLine()), soma = 0, x = 1;
			while (x <= n) {
				System.out.println(soma);
				soma += x;
				// soma = soma + x;
				x++;
			}
			System.out.println(soma);
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
