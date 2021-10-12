package Exercicios;

import java.io.*;

public class Ex4 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int somaTotal = 0, ktotal = 0, c1 = 0, soma10 = 0;
		try {
			
			do{

				System.out.println("Digite o nome: ");
				String nome = dado.readLine();
				System.out.println("Digite a idade da pessoa "+ nome+": ");
				int n = Integer.parseInt(dado.readLine());
				soma10 += n;
				somaTotal +=n;
				ktotal ++;
				c1++;
				if (c1 == 10){
					System.out.println("A idade media dos 10 ultimos digitados é de: " + (soma10 / c1));
					c1 = 0; 
					soma10 = 0;
				}
				ktotal ++;
				c1++;
			} while (ktotal <= 500);
			System.out.println("A idade media de todas as pessoas é de: " + (somaTotal / ktotal));
				
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
