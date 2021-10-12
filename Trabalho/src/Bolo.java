import java.util.Scanner;
public class Bolo {
	int kCamadas = 0;
	String sabor = "";
	Scanner s = new Scanner(System.in);
	public void fazerBolo() {
		System.out.println("Quantas camadas tem o bolo?");
		kCamadas = s.nextInt();
		System.out.println("Qual sabor tem o bolo");
		sabor = s.next();
	}
}
