public class Conta {
	//ATRIBUTOS
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	//METODOS
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
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	
}