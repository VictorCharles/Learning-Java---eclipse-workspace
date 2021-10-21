package br.com.pilha.test;


import br.com.pilha.models.Conta;
import br.com.pilha.models.MinhaExcecao;

public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento..........");
		}
	}
}
