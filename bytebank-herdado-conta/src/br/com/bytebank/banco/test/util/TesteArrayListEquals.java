package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
		//Generics
		List<Conta> lista = new ArrayList<Conta>();
		// arraylist é uma classe que herda a interface list
		// Nessa array lista existe apenas classe Conta, é mais seguro e ele faz o auto cast quando referenciado como object
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 33);
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? "+ existe);

		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//Nova forma de trabalhar com for em arrays
		// Para (<Classe da referencia e da lista> <referencia> : <Nome da List) {
		// interação (para cada item na lista alguma coisa na referenca conta
	
	}
}
