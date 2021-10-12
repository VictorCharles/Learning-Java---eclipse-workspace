package exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerCadastro_v2 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o nome do arquivo de texto:\n");
		String nome = ler.nextLine();
		System.out.printf("\nConteúdo do Arquivo de texto: \n\n");
		
		try {
			FileReader arq = new FileReader("E:\\CHARLES 3C\\Escola\\T.E.C.N.I.C.O\\3° Ano\\PC - Programação de Computadores\\6-Interface Grafica\\" + nome + ".txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine(); // Lê a linha 1
			while (linha != null){
				System.out.printf("%s\n", linha);
				linha = lerArq.readLine();// Lê as outras
			}
			arq.close();
			lerArq.close();
		} catch (IOException e){
			System.out.printf("Erro na abertura do arquivo: %s\n ", e.getMessage());
		}
		System.out.println();
		ler.close();
	}
}
