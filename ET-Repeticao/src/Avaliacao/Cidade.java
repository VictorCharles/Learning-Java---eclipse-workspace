/*
Etec de Sapopemba
Victor Charles Alves Vieira 3ºC 
Rodrigo Guedes dos Santos 3ºC
ETIM - Informatica
	
	A prefeitura de uma cidade precisa fazer uma pesquisa entre seus habitantes. Desenvolva um código em Java que peça:
	- Valor salário Mínimo;
	- Valor salário Funcionário;
	- Número de filhos;
	O programa deve parara de pedir ao digitar 0 no salário do Funcionário.
	
	No final, mostrar:
	- Média de salário da população; 
	- Media do número de filhos
	- Maior e menor salário da população
	- Percentual de pessoas com o salário menor que o Mínimo

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
				System.out.print("\n--->Digite o salario do " + kP + "° funcionario: R$ ");
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
				System.out.print("    Digite a quantidade de filhos que o " + kP + "° funcionario tem: ");
				nFilho += Float.parseFloat(dado.readLine());
				if (salarioFuncionario < salarioMinimo) {
					kPM++;
				}
				kP++;
			}
			kP--;
			System.out.println("\n\n------------------------> RESULTADO <------------------------");
			System.out.println("Media de salário da população: R$" + (somaSalario / kP));
			System.out.println("Media do número de filhos: " + (nFilho / kP) + " por habitante");
			System.out.println("Maior salário: R$" + maiorSal);
			System.out.println("Menor salário: R$" + menorSal);
			System.out.println("Percentual de pessoas com o salário menor que o minimo: " + ((kPM / kP) * 100) + "%");

			dado.close();
		} catch (IOException erro) {
			System.out.println("Houve erro na entrada de dados");
		} catch (NumberFormatException erro) {
			System.out.println("Digite apenas caracteres numéricos");

		}

	}
}