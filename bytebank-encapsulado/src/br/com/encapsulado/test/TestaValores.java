package br.com.encapsulado.test;

import br.com.encapsulado.models.Conta;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(123123, 1239);
		Conta conta2 = new Conta(100, "Charles");
		Conta conta3 = new Conta();

		System.out.println(conta.getAgencia());

		System.out.println(Conta.getTotal());
	}
}
