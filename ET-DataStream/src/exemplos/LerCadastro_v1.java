package exemplos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LerCadastro_v1 {
	public static void main(String[] args) throws IOException {
		String nome;
		char sexo;
		int idade, altura;
		double pc; // Peso corporal
		double geb; // Gasto energetico Basal

		FileInputStream arq = new FileInputStream(
				"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\arquivo.dat");

		DataInputStream lerArq = new DataInputStream(arq);

		nome = lerArq.readUTF();
		sexo = lerArq.readChar();
		idade = lerArq.readInt();
		pc = lerArq.readDouble();
		altura = lerArq.readInt();

		if ((sexo == 'm') || (sexo == 'M')) {
			geb = 66.47 + (13.75 * pc) + (5 * altura) - (6.78 * idade);
		} else {
			geb = 655.1 + (9.56 * pc) + (1.85 * altura) - (4.67 * idade);
		}

		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Sexo: %c\n", sexo);
		System.out.printf("Idade: %d anos\n", idade);
		System.out.printf("Peso corporal: %.2f KGs\n", pc);
		System.out.printf("Altura: %d CM\n", altura);
		System.out.printf("Gasto Energético Basal: %.0f kcal/dia \n", geb);

		arq.close();
		lerArq.close();

	}
}
