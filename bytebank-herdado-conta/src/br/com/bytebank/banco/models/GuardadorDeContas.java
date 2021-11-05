package br.com.bytebank.banco.models;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int i;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.i = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.i] = ref;
		this.i++;
	}

	public int getQtdElementos() {
		
		return this.i;
	}

	public Conta getReferencia(int pos) {
		
		return this.referencias[pos];
	}
}
