package Exemplos;

import java.util.Scanner;

public class VerVogal {
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" ==> Verifica se � vogal ou n�o <=");
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
			System.out.println(c + "� uma vogal");
		case 'y':
		case 'Y':
		case 'w':
		case 'W':
			System.out.println(c + "Pode ter som de vogal");
			break;
		default:
			System.out.println(c + "N�o � uma vogal");
		}
		s.close();
	}

}
