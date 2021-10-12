package Exercicios;

import java.io.*;

public class Ex6 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int n = 0, x = 0;
		float r = 0f;
		try {
			do {
				System.out.println("Digite um multiplo de 3");
				System.out.println("OU 0 oara encerrar");
				n = Integer.parseInt(dado.readLine());
				
				if (n==0) {
					System.exit(0);
				}
				if ((n%3) != 0) {
					System.out.println("O numero: " + n);
					System.out.println("Não é multiplo de 3");
					System.out.println("Tente outro");
					continue;
				}
			}while ((n%3)!= 0);
			
			for (x = 3; x <=n; x+=3) {
				System.out.println("1/" + x + " + ");
				r += (float)1/x;
			}
			System.out.println("1 / " + x + "=");
			r+= (float) 1/x;
			System.out.println(r);
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