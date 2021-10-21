package br.com.pilha.test;

import br.com.pilha.models.Conexao;

public class TesteConexao {
	public static void main(String[] args) {
		// A partir do java 1.7 o tratameto pode ser feito assim
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		
		
		
		
		
		
		
		
		
		//Tratamento macarrão (na unha) -----------------------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("deu erro na conexão");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		}

	}
}
