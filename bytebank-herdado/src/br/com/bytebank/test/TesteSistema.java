package br.com.bytebank.test;
import br.com.bytebank.models.Administrador;
import br.com.bytebank.models.Cliente;
import br.com.bytebank.models.Gerente;
import br.com.bytebank.models.SistemaInterno;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);

		Cliente cli = new Cliente();
		cli.setSenha(2223);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cli);
	}
}
