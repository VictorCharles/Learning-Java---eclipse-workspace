package Exemplos;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		Scanner digita = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = digita.nextInt();
		if (idade >= 18) {
			System.out.println("Parab�ns, voc� � maior de idade!");
		}
		else if (idade <0) {
			System.out.println("Voc� ainda nem nasceu, p�");
		}
		else {
			System.out.println("Voc� � menor de idade e nasceu, olha pelo lado bom");
		}
		
		digita.close();
	}
}
