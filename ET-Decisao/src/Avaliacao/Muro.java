package Avaliacao;

import java.util.Scanner;

public class Muro {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double homens, metros, tijolos, tempo;
			int tipoTijolo;
			
			System.out.print("Quantidade de homens que ser�o usados no trabalho: " );
			homens = scanner.nextDouble();
			
			System.out.print("Quantos metros do muro ser�o constru�dos: " );
			metros  = scanner.nextDouble();
			
			System.out.print("Tipo do tijolo (1=BAIANO, 2=COMUM): ");
			tipoTijolo = scanner.nextInt();
			
			if (tipoTijolo == 1) {
				tempo = (metros / homens) * 60;
				tijolos = metros * 50.0;
				System.out.println("O tempo gasto �: " + tempo + " minutos");
				System.out.println("A quantidade de tijolos baianos usado �: " + tijolos);
			}
			if (tipoTijolo == 2) {
				tempo = (metros / homens) * 90;
				tijolos = metros * 150.0;
				System.out.println("O tempo gasto �: " + tempo + " minutos");
				System.out.println("A quantidade de tijolos comuns usado �: " + tijolos);
			}
			else {
				System.out.println("Tipo de tijolo invalido");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			scanner.close();
	}
}
