package br.com.bytebank.test;

import br.com.bytebank.models.Funcionario;
import br.com.bytebank.models.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("387906373-73");
		nico.setSalario(12342.12);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}
}
