package br.com.bytebank.models;
public class Conta {

	public double saldo;
	public int agencia = 121;
	public int numero;
	public String titular;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}