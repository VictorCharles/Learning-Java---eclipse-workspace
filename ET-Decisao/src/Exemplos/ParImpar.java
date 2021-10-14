package Exemplos;

public class ParImpar {
	// Atributos
	private int numero = 0;

	// Set e get
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public String definir() {
		int mod = numero % 2;
		if (mod == 0) {
			return ("Par");
		} else {
			return ("Impar");
		}
	}
}
