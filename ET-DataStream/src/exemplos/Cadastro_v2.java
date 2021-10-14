package exemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro_v2 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int i, n;
		System.out.printf("Informe o numero da tabuada: \n");
		n = ler.nextInt();
		FileWriter arq = new FileWriter(
				"D:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\tabuada.txt");
		PrintWriter gravaArq = new PrintWriter(arq);
		gravaArq.printf("+---Resultado--+%n");
		for (i = 1; i <= 10; i++) {
			gravaArq.printf("|  %2d * %d = %2d | %n", i, n, (i * n));
		}
		gravaArq.printf("+--------------+%n");
		arq.close();
		ler.close();
		System.out.printf(
				"E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\tabuada.txt\".\n",
				n);
	}
}
