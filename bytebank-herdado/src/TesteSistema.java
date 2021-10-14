
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		// autenticou com sucesso
		Gerente g1 = new Gerente();
		g.setSenha(2223);
		si.autentica(g1);
		// não autenticou com sucesso

		Administrador adm = new Administrador();
		adm.setSenha(3333);
		si.autentica(adm);
	}
}
