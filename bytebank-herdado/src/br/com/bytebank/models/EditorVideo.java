package br.com.bytebank.models;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() + 100;
	}
}