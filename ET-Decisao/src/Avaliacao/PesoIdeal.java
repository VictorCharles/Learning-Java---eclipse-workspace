package Avaliacao;
import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double altura;
		String sexo;
		
		
		System.out.println("Qual a sua altura?");
		altura = (s.nextDouble()) / 100;
		
		System.out.println("seu sexo é masculino ou feminino? ");
		sexo = s.next();
		
		
		if (sexo.equals("masculino") || sexo.equals("MASCULINO") || sexo.equals("Masculino")) {
			double pesoIdeal = (72.7 * altura) - 58;
			System.out.println();
			System.out.println("==>> PESO IDEAL: " + pesoIdeal + "kg");
		}
		
		if (sexo.equals("feminino") || sexo.equals("FEMININO") || sexo.equals("Feminino") ) {
			double pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println();
			System.out.println("==>> PESO IDEAL: " + pesoIdeal + "kg");
		}
		
		System.out.println(sexo);
		
		
		
		
		
		
		
		
		
		s.close();
	}

}
