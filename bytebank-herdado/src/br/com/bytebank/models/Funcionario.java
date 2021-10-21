package br.com.bytebank.models;
//classe abstrata n pode ser instanciada, somente usada como herança 
public abstract class Funcionario {
	// ATRIBUTOS
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	
	// metodo sem corpo, nao tem implementacao
	public abstract double getBonificacao();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf != null) {
			this.cpf = cpf;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}
	}
}
