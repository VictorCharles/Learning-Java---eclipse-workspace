package br.com.bytebank.banco.test;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.GuardadorDeReferencias;

public class TesteGuardadorReferencia {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta cc = new ContaCorrente(22,11);
		guardador.adiciona(cc);
		Conta cc2 = new ContaCorrente(22,33);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQtdElementos();
		System.out.println(tamanho);
	
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
