
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		// podemos chamar metodos do Funcionario:
		gerente.setNome("Jo�o Silva");

		// e tambem metodos do gerente
		gerente.setSenha(4321);
	}
}
