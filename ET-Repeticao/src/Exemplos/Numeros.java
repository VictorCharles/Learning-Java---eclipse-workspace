//imagine uma brincadeira entre dois colegas no qual, um pensa um numero e o outro deve fazer chutes at� acertar acertar o n�mero imaginario
//Como dica, a cada tentativa, � dito se o chute foi alto, ou baixo.
//Elabore uma classe dentro deste contexto que pe�a o n�mero imaginado, e os chutes no final, mostre quantas tentativas foram necessarias para descobrir o numero

package Exemplos;

import java.io.*;

public class Numeros {

	public static void main(String[] args) {
		BufferedReader numero = new BufferedReader(new InputStreamReader(System.in));
		int tentativas = 1, tentativaAtual, n;
		
		try {
			System.out.println("Digite um n�mero: ");
			n = Integer.parseInt(numero.readLine());
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nDigite sua tentativa: ");
			tentativaAtual = Integer.parseInt(numero.readLine());
			while(tentativaAtual != n) {
				
				if(tentativaAtual > n) {
					System.out.println("Sua tentativa foi ALTA");
				} else {
					System.out.println("Sua tentativa foi BAIXA");
				}
				System.out.println("Digite sua tentativa: ");
				tentativaAtual = Integer.parseInt(numero.readLine());
				tentativas++;
			}
			numero.close();
			
			System.out.println("Voce chutou " + tentativaAtual + " e acertou! Voc� tentou: " + tentativas + " vezes.");
		} catch(IOException erro) {
			System.out.println("Houve erro na entrada de dados");
		} catch(NumberFormatException erro) {
			System.out.println("Digite apenas caracteres num�ricos");

	}

}
}