package br.com.bytebank.biblioteca.test;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente(123,321);
		
		c.deposita(200.5);
		System.out.println(c.getSaldo());
	}

}
