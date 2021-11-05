package br.com.bytebank.banco.test;


import br.com.bytebank.banco.models.Cliente;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		
		// no java todo objeto erda a classe Object
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
//		ContaCorrente cc = new ContaCorrente(22, 33);
//		ContaPoupanca cp = new ContaPoupanca(33, 22);
//		Cliente cliente = new Cliente();
//		
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cliente);
		
		
//		println(cliente.toString());
//		println(cc);
	}

	static void println() {}
	static void println(int n) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {
		
	}

}
