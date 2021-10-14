/*
Etec de Sapopemba
Victor Charles Alves Vieira 3�C 
Rodrigo Guedes dos Santos 3�C
ETIM - Informatica
	
	A prefeitura de uma cidade precisa fazer uma pesquisa entre seus habitantes. Desenvolva um c�digo em Java que pe�a:
	- Valor sal�rio M�nimo;
	- Valor sal�rio Funcion�rio;
	- N�mero de filhos;
	O programa deve parara de pedir ao digitar 0 no sal�rio do Funcion�rio.
	
	No final, mostrar:
	- M�dia de sal�rio da popula��o; 
	- Media do n�mero de filhos
	- Maior e menor sal�rio da popula��o
	- Percentual de pessoas com o sal�rio menor que o M�nimo

 */
package Avaliacao;

import java.io.*;

public class Cidade {

	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		double salarioFuncionario = 1, salarioMinimo = 0, somaSalario = 0, menorSal = 999999999, maiorSal = 0;
		int kP = 1;
		float nFilho = 0, kPM = 0;

		try {
			System.out.print("Digite o valor do salario minimo: R$ ");
			salarioMinimo = Integer.parseInt(dado.readLine());

			while (salarioFuncionario != 0) {
				System.out.print("\n--->Digite o salario do " + kP + "� funcionario: R$ ");
				salarioFuncionario = Double.parseDouble(dado.readLine());
				if (salarioFuncionario == 0) {
					break;
				}
				if (salarioFuncionario > maiorSal) {
					maiorSal = salarioFuncionario;
				}
				if (salarioFuncionario < menorSal) {
					menorSal = salarioFuncionario;
				}

				somaSalario += salarioFuncionario;
				System.out.print("    Digite a quantidade de filhos que o " + kP + "� funcionario tem: ");
				nFilho += Float.parseFloat(dado.readLine());
				if (salarioFuncionario < salarioMinimo) {
					kPM++;
				}
				kP++;
			}
			kP--;
			System.out.println("\n\n------------------------> RESULTADO <------------------------");
			System.out.println("Media de sal�rio da popula��o: R$" + (somaSalario / kP));
			System.out.println("Media do n�mero de filhos: " + (nFilho / kP) + " por habitante");
			System.out.println("Maior sal�rio: R$" + maiorSal);
			System.out.println("Menor sal�rio: R$" + menorSal);
			System.out.println("Percentual de pessoas com o sal�rio menor que o minimo: " + ((kPM / kP) * 100) + "%");

			dado.close();
		} catch (IOException erro) {
			System.out.println("Houve erro na entrada de dados");
		} catch (NumberFormatException erro) {
			System.out.println("Digite apenas caracteres num�ricos");

		}

	}
}