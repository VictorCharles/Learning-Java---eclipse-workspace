package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];

		int idade = 29; // Integer
		Integer idaderef = Integer.valueOf(29);

		System.out.println(idaderef.doubleValue());

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		int valor = idaderef.intValue(); // unboxing
		
		String s = args[0]; // "10"

//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // autoboxing

	}

}
