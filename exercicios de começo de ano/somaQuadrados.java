package lista13Exerc�cios;
import java.util.Scanner;

public class somaQuadrados {
	public static void main  (String args[]) {
		Scanner ler = new Scanner(System.in);
	
	int valorA, valorB, valorC, soma;
	
	System.out.println("Digite o valorA:");
	valorA = ler.nextInt();
	
	System.out.println("Digite o valorB:");
	valorB = ler.nextInt();
	
	System.out.println("Digite o valorC:");
	valorC = ler.nextInt();
	
		soma = (valorA * valorA) + (valorB * valorB) + (valorC * valorC);
	
			System.out.println("A soma dos quadrados �:" + soma );
		ler.close();
	
	}
}