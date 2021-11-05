package br.com.bytebank.banco.test;

import br.com.bytebank.banco.models.Cliente;
import br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		//int [] idades = new int [5];
		Object[] referencia = new Object[5];
		
		System.out.println(referencia.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		referencia[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencia[2] = cliente;
		
//		System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = referencia[1];
		
//		System.out.println( referenciaGenerica.getNumero());

		ContaCorrente ref = (ContaCorrente) referencia[1]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	
	
	
	}

}
