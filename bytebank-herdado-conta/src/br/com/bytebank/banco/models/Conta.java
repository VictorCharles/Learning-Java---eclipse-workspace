package br.com.bytebank.banco.models;
/**
 * classe que representa uma conta (molde) a ser herdada no bytebank
 * 
 * @author Charles
 * @version 0.1
 */
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

/**
 * construtor para inicializa um objeto conta a paritr da agencia e do numero
 * @param agencia
 * @param numero
 */
	
	
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia Invalida");
		}
		if (numero < 1 ) {
			throw new IllegalArgumentException("Número da conta invalido");
		}
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor)
			throw new SaldoInsuficienteException("Saldo insuficiente \n Saldo R$ " + this.saldo + "0 \n Valor R$ " + valor + "0");

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);

		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		
		return "Numero: " + this.getNumero() + ", Agencia: " + this.agencia;
	}

}