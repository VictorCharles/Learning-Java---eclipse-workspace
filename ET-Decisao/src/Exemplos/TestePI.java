package Exemplos;

import java.util.Scanner;

public class TestePI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ParImpar npi = new ParImpar();

		System.out.println("Digite o n�mero que deseja descobrir se � impar ou par");
		npi.setNumero(s.nextInt());
		System.out.println(npi.definir());

		s.close();
	}

}
