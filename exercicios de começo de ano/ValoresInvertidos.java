import java.util.Scanner;

public class ValoresInvertidos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		//leia valor1
		System.out.println("Digite o primeiro valor:");
		valor1 =ler.nextInt();
		
		//leia valor2
		System.out.println("Digite o segundo valor:");
		valor2 = ler.nextInt();
		
		valor3 = valor1;
		valor1 = valor2;
		valor2 = valor3;
		
		//escreva valor1 e valor2
		System.out.println("Apresente o primeiro valor: " + valor1 + ". Apresnete o segundo valor:" + valor2);
		
		ler.close();
	
		}
	}