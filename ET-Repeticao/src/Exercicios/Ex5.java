package Exercicios;

import java.io.*;

public class Ex5 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int idade = 0, tId = 0, k18 = 0, k25 = 0;
		float altura = 0;
		float peso = 0, tPes = 0;

		try {
			System.out.println("Quantos atletas tem no time?");
			int kAtle = Integer.parseInt(dado.readLine());

			for (int x = 1; x <= kAtle; x++) {
				String nome = dado.readLine();
				System.out.println("Nome do atleta " + nome);
				System.out.println("Idade");
				idade = Integer.parseInt(dado.readLine());
				System.out.println("Altura");
				altura = Float.parseFloat(dado.readLine());
				System.out.println("Peso");
				peso = Float.parseFloat(dado.readLine());
				if (idade >= 18 && idade <= 22) {
					k18++;
				}
				if (idade > 25 && altura > 1.90) {
					k25++;
				}
				tPes += peso;
				tId += idade;
			}

			System.out.println("Peso medio dos atletas: " + (tPes / kAtle) + " kg");
			System.out.println("Idade media dos atletas: " + (tId / kAtle));
			System.out.println("Com mais de 25 anos e 1,90 de altura " + k25);
			System.out.println("Com idade entre 18 e 22 anos " + k18);

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
