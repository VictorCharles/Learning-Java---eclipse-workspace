public class Hellpers {
	public static void main(String[] args) {
		int tama = 12, dinheiro = 20, i;
		for (i = 0; dinheiro >= tama; i++) {
			System.out.println("O "+ (i + 1) +"� tamagochi custar� R$ " + tama + ",00");
			dinheiro -= tama;
			if (tama > 1)
			//desconto a cada tamagochi
			tama -= 4;
			//se n�o tiver como dar mais desconto, o pre�o trava em 1
			else 
			tama = 1;
			System.out.println("Dinheiro restante R$ " +dinheiro+ ",00");
		}
		System.out.println("Comprou um total de " +i+ " tamagochis e sobrou um total de R$ " +dinheiro+ ",00");
	}
}
