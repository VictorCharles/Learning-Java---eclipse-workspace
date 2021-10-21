package br.com.bytebank.models;

public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador autenticador;

	public Gerente() {
		this.autenticador = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Chamado o metodo de bonificacao do gerente");
		// TODO Auto-generated method stub
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
