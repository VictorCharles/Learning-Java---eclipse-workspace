package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.ContaPoupanca;
import br.com.bytebank.banco.models.SaldoInsuficienteException;


public class TesteContas {

	
	public static void main(String[] args) throws SaldoInsuficienteException{

		ContaEspecial ce = new ContaEspecial(123, 321);
		
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);
		
		System.out.println("CE: " + ce.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
