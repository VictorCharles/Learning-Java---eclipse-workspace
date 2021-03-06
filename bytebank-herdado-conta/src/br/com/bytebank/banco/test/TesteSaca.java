package br.com.bytebank.banco.test;
//br.com.bytebank.modelo.Conta => Full Qualified Name
import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.SaldoInsuficienteException;

public class TesteSaca {
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
