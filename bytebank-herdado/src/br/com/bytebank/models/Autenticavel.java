package br.com.bytebank.models;
//contrato Autenticavel 
//(obriga a implementar os métodos 
	//setSenha e o 
	//autentica()
public interface Autenticavel{


	void setSenha(int senha);

	boolean autentica(int senha);

}
