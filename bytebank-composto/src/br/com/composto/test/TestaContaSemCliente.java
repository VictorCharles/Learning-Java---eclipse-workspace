package br.com.composto.test;
import br.com.composto.models.Cliente;
import br.com.composto.models.Conta;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoRodrigo = new Conta();
		System.out.println(contaDoRodrigo.getSaldo());

		contaDoRodrigo.titular = new Cliente();
		System.out.println(contaDoRodrigo.titular);
		contaDoRodrigo.titular.nome = "Rodrigo";
		System.out.println(contaDoRodrigo.titular.nome);
	}
}
