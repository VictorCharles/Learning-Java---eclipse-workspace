
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente victor = new Cliente();
		victor.nome = "Victor Vieira";
		victor.cpf = "222.222.222-22";
		victor.rg = "387.123.124-9";
		victor.endereco = "Rua Maria Rosa de Souza, 220 - SP, São Paulo";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.deposita(100);
		
		contaDoVictor.titular = victor;
		//Assoscia o objeto cliente ao objeto conta
		System.out.println(contaDoVictor.titular.nome);
		System.out.println(contaDoVictor.titular);
		System.out.println(victor);
		
	}

}
