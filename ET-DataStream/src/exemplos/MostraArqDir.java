package exemplos;

import java.io.File;
import java.util.Scanner;

public class MostraArqDir {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("=> Informe o nome de um arquivo ou pasta\n");
		String nome = ler.nextLine();
		File objFile = new File(nome);
		if (objFile.exists()) {
			if (objFile.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes \n", objFile.getName(), objFile.length());
			} else {
				System.out.println("\nConteudo da pasta: \n");
				String pasta[] = objFile.list();
				for (String item : pasta) {
					System.out.printf("%s \n", item);
				}
			}
		} else {
			System.out.println("ERRO: Arquivo ou pasta informada inexistente!\n");
		}
	}
}
