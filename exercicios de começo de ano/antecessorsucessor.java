package lista13Exercícios;
import java.util.Scanner;

public class antecessorsucessor {
	public static void main  (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int valor, sucessor, antecessor;
		
		System.out.println("Digite o valor:");
		valor = ler.nextInt();
		
		antecessor = valor - 1;
		
		sucessor = valor + 1;
		
		System.out.println("Antecessor e Sucessor respectivamente:" + antecessor + " e " + sucessor );
		ler.close();
}
}