package exemplos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Cadastro_v3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);
		String nome;
		double nota1, nota2;
		long n;
		RandomAccessFile diario = new RandomAccessFile(
				"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\diario.dat",
				"rw");
		diario.seek(diario.length());// Posiciona o ponteiro de posicao no fnal
										// do arquivo
		n = (diario.length() / 56) + 1; // Numero do novo registro
		while (true) {
			System.out.printf("%dº. REGISTRO...............\n", n);
			System.out.printf("Informe Nome do aluno. FIM para encerrar\n");
			nome = ler.nextLine();
			if (nome.equalsIgnoreCase("FIM"))
				break;
			System.out.println("Informe a 1° nota: ");
			nota1 = ler.nextDouble();
			System.out.println("Informe a 2° nota: ");
			nota2 = ler.nextDouble();
			ler.nextLine(); // Esvazia o buffer de teclado
			gravarString(diario, nome, 20);
			diario.writeDouble(nota1);
			diario.writeDouble(nota2);
			n = n + 1;
			System.out.println();
		}
		diario.close();
		ler.close();
	}

	private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
		StringBuilder result = new StringBuilder(s);
		result.setLength(tam);
		arq.writeChars(result.toString());
	}
}
