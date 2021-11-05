package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		int idades[] = new int [5]; // array começa no indice 0
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//		int idade1 = 39;
//		int idade2 = 49;
//		int idade3 = 59;
//		int idade4 = 69;
//		int idade5 = 29;

	}

}
