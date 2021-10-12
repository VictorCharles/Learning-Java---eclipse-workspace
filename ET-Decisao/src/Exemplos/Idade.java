package Exemplos;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		Scanner digita = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = digita.nextInt();
		if (idade >= 18) {
			System.out.println("Parabéns, você é maior de idade!");
		}
		else if (idade <0) {
			System.out.println("Você ainda nem nasceu, pó");
		}
		else {
			System.out.println("Você é menor de idade e nasceu, olha pelo lado bom");
		}
		
		digita.close();
	}
}
