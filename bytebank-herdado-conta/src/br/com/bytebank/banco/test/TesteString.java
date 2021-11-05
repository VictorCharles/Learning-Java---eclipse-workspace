package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3;
		System.out.println(a);
		//Literal
		String nome = "Alura";
		//Contraintuitivo
//		String outro = new String ("alura");
		
		
		
		String vazio = "   aura   ";
		String outroVazio = vazio.trim();
		//trim tira os espaços no inicio e no final da string
		
		System.out.println(vazio);
		System.out.println(outroVazio);
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.isEmpty());
		
		
		for (int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.length());
		
		
		String sub=	nome.substring(1);
		System.out.println(sub);
		
		
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		
		nome.replace("A", "a");
		System.out.println(nome);
			
		nome.toLowerCase();
		System.out.println(nome);
		//No momento que a classe string é criada, ela é imutavel, ela precisa criar uma outra string para ser alterada
		//IMUTABILIDADE
		 		
//		String outro = nome.replace("Al", "aL");
//		System.out.println(nome);
//		System.out.println(outro);
//		
	
		
		//Para cocatenar string, melhor usar o String Builder, melhor para perfomance
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);	

		
		System.out.println();
	}

}
