package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		// Nessa array lista existe apenas classe Conta, é mais seguro e ele faz o auto cast quando referenciado como object
		
		// ArraysList<String> nomes = new ArrayLista<String>();
		// Nessa array lista existe apenas String, é mais seguro e ele faz o auto cast quando referenciado como object
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		System.out.println("Tamanho : " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho : " + lista.size());
		
		Conta cc3 = new ContaCorrente(22, 131);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(22, 323);
		lista.add(cc4);
		
		System.out.println("Tamanho : " + lista.size());

		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
	
		System.out.println("<----------------------------->");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		//Nova forma de trabalhar com for em arrays
		
	}

}
