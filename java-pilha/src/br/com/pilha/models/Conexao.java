package br.com.pilha.models;

public class Conexao implements AutoCloseable {
	public Conexao() {
		System.out.println("Abrindo conex�o");
		throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("recebendo dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("encerrando conex�o");

	}
}
