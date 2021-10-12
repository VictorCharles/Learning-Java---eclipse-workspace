
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
