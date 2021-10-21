package br.com.bytebank.banco.test;
//modelo.Conta => Full Qualified Name
import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.SaldoInsuficienteException;

public class TestaSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);

		try {
		conta.saca(210);
		} catch(SaldoInsuficienteException ex){
			System.out.println("Ex: " + ex.getMessage()); 
		}
		
		System.out.println(conta.getSaldo());
	}
}
