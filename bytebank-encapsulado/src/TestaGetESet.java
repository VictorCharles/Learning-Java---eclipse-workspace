
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());

		// MEIOS DE INSTACIA REFERENCIA
		
		// Maneira Curta
		conta.setTitular(new Cliente());
		
		// Definindo o nome do titular
		Cliente ricardo = conta.getTitular();
		
		// Metodo 2 linhas
		Cliente victor = new Cliente();
		conta.setTitular(victor);
		
		// conta.titular = victor;
		victor.setNome("Victor Charles");

		conta.setTitular(victor);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setCpf("387.906.373-72");
		
		//EM duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setCpf("387.906.373.72");
		
		System.out.println(titularDaConta);
		System.out.println(victor);
		System.out.println(conta.getTitular());
		
	}
}
