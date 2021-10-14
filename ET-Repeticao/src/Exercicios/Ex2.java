package Exercicios;

import java.io.*;

public class Ex2 {
	public static void main(String[] args) {
		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
		int aluno = 0, apr = 0, rep = 0;
		float medAp = 0, medTotal = 0;
		try {
			for (aluno = 1; aluno <= 30; aluno++) {
				System.out.println("\n---------------> ALUNO " + aluno + " <-----------------");
				System.out.print("Digite a nota da prova te�rica do " + aluno + "� aluno: ");
				float nT = Float.parseFloat(dado.readLine());
				System.out.print("Digite a nota da prova pr�tica do " + aluno + "� aluno: ");
				float nP = Float.parseFloat(dado.readLine());
				System.out.print("Digite a nota da prova final do " + aluno + "� aluno: ");
				float nF = Float.parseFloat(dado.readLine());

				float media = ((nT * 2) / 10) + ((nP * 3) / 10) + ((nF * 5) / 10);
				medTotal += media;

				if (media >= 7) {
					System.out.println("\nMedia do aluno " + aluno + " �: " + media);
					System.out.println("Aluno " + aluno + " foi APROVADO");
					apr++;
					medAp += media;
				} else if (media >= 5 && media < 7) {
					System.out.println("Media do aluno " + aluno + " �: " + media);
					System.out.println("Aluno " + aluno + " � necessario fazer EXAME");

				} else if (media < 5) {
					System.out.println("Media do aluno " + aluno + " �: " + media);
					System.out.println("Aluno " + aluno + " foi REPROVADO");
					rep++;
				}

			}
			System.out.println("\n --------> RESUMO <-------- ");
			System.out.println("\nForam aprovados " + apr + " alunos");
			System.out.println("Foram reprovados" + rep + " alunos");
			medAp /= aluno;
			System.out.println("\nA media dos alunos aprovados �: " + medAp);
			medTotal /= aluno;
			System.out.println("\nA media globas �: " + medTotal);

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
