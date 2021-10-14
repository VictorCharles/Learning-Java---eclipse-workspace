package exemplos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LerCadastro_v3 {
	public static void main(String[] args) throws IOException {
		String nome, sit;
		double nota1, nota2, media;

		try {
			RandomAccessFile diario = new RandomAccessFile(
					"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\diario.dat",
					"r");
			System.out.printf("REG Nome................. NOTA1 NOTA2   Média Situação\n");
			System.out.printf("......................................................\n");
			int i;
			long n = (diario.length() / 56);
			for (i = 1; i <= n; i++) {
				nome = lerString(diario, 20);
				nota1 = diario.readDouble();
				nota2 = diario.readDouble();
				media = (nota1 + nota2) / 2;
				sit = (media >= 6.0 ? "Aprovado" : "Reprovado");
				System.out.printf("%3d %20s %6.2f %6.2f %6.2f %s\n", i, nome, nota1, nota2, media, sit);
			}
			System.out.printf("......................................................");
			diario.close();
		} catch (FileNotFoundException e) {
			System.out.printf("Arquivo não encontrado: %s \n", e.getMessage());
		}
	}

	private static String lerString(RandomAccessFile arq, int tam) throws IOException {
		char result[] = new char[tam];
		for (int i = 0; i < tam; i++) {
			result[i] = arq.readChar();
		}
		return (new String(result).replace('\0', ' '));
	}
}
