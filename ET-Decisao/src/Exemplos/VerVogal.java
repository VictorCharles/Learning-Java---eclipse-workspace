package Exemplos;

import java.util.Scanner;

public class VerVogal {
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" ==> Verifica se é vogal ou não <=");
		char c = s.nextLine().charAt(0);
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(c + "é uma vogal");
		case 'y':
		case 'Y':
		case 'w':
		case 'W':
			System.out.println(c + "Pode ter som de vogal");
			break;
		default:
			System.out.println(c + "Não é uma vogal");
		}
		s.close();
	}

}
