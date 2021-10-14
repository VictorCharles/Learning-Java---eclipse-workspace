package exemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro_v1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);
		String nome;
		char sexo;
		int idade, altura;
		double pc; // Peso Corporal

		FileOutputStream arq = new FileOutputStream(
				"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\arquivo.dat");
		DataOutputStream gravarArq = new DataOutputStream(arq);

		System.out.printf("Informe seu nome:\n");
		nome = ler.nextLine();
		System.out.printf("Informe seu sexo (M/F):\n");
		sexo = (char) System.in.read();
		System.out.printf("Informe sua idade:\n");
		idade = ler.nextInt();
		System.out.printf("Informe seu peso (em KG):\n");
		pc = ler.nextDouble();
		System.out.printf("Informe sua altura (em CM):\n");
		altura = ler.nextInt();

		gravarArq.writeUTF(nome);
		gravarArq.writeChar(sexo);
		gravarArq.writeInt(idade);
		gravarArq.writeDouble(pc);
		gravarArq.writeInt(altura);

		arq.close();
		ler.close();

		System.out.printf(
				"\nDados gravados com sucesso em \"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\arquivo.dat\".\n");

	}
}
