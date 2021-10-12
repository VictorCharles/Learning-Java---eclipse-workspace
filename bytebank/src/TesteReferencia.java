
public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		//primeiraConta é uma referencia a um objeto Conta
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		//essas duas "conta" faz referencia ao mesmo objeto do tipo conta
		
		System.out.println("Saldo da segunta conta:" + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da segunta conta:" + segundaConta.saldo);
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
